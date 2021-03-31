package controller;

import model.Employee;
import util.MyException;
import util.OibCheck;

import java.util.List;

public class EmployeeProcessor extends Processor<Employee>{

    @Override
    public List<Employee> getData() {
        return session.createQuery("from Employee").list();
    }
    
     public List<Employee> getData(String condition) {            
       
         return session.createQuery("from Employee e"
                + " where concat(e.firstName, ' ', e.lastName) "
                + " like :condition order by e.lastName, e.firstName")
                .setParameter("condition", "%" + condition + "%")                
                .setMaxResults(100)
                .list();
    }
     
     
    

    @Override
    protected void controlCreate() throws MyException {

        controlFirsAndLastNameSet();
        controlOibCheck();
        controlMobileNumber();


    }

    @Override
    protected void controlUpdate() throws MyException {

        controlFirsAndLastNameSet();
        controlOibCheck();
        controlMobileNumber();

    }

    @Override
    protected void controlDelete() throws MyException {

        controlIsDogSet();
        controlIsBoxSet();
    }

    private void controlFirsAndLastNameSet() throws MyException{

        if(entity.getFirstName() == null || entity.getLastName() == null || entity.getFirstName().isEmpty() || entity.getLastName().isEmpty()){

            throw new MyException("First and Last Name must be set.");

        }
    }

    private void controlOibCheck() throws MyException{

        if(!OibCheck.oibValidation(entity.getOib())){

            throw  new MyException("Oib is not valid.");

        }
    }

    private void controlMobileNumber() throws MyException{

        if(entity.getMobileNumber() == null || entity.getMobileNumber().isEmpty()){

            throw new MyException("Please set mobile number for this employee.");
        }
    }

    private void controlIsDogSet() throws MyException{

        var dogList = session
                .createQuery("from Dog d where d.employee.id=:id")
                .setParameter("id", entity.getId())
                .list();

        if(dogList.size() > 0){

            throw new MyException("That employee is assigned to a dog and can not to be deleted.");

        }

    }

    private void controlIsBoxSet() throws MyException{

        var boxList = session
                .createQuery("from Box b where b.employee.id=:id")
                .setParameter("id", entity.getId())
                .list();

        if(boxList.size() > 0){

            throw new MyException("That employee is assigned to a box and can not to be deleted.");

        }

    }


}
