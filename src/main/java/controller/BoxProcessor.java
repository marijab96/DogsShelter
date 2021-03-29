package controller;


import model.Box;
import util.MyException;
import java.math.BigDecimal;
import java.util.List;


public class BoxProcessor extends Processor<Box> {

    public BoxProcessor(){
        
    }
   
    @Override
    public List<Box> getData() {       
             
       
         return session.createQuery("from Box").list();
        
    }
    
     public List<Box> getData(String condition) {            
       
         return session.createQuery("from Box b"
         + " where concat(b.name)"
         +" like :condition")
         .setParameter("condition", "%" + condition + "%")
         .setMaxResults(100)
         .list();
    }
     
    
    
    
    
    
   

    @Override
    protected void controlCreate() throws MyException {

        controlSize();
        controlCapacity();
        controlNameSet();
        controlNameLength();
        controlIsNameUnique();
        controlEmployeeSet();
    }

    @Override
    protected void controlUpdate() throws MyException {

        controlSize();
        controlCapacity();
        controlNameSet();
        controlNameLength();
        controlIsNameUnique();
        controlEmployeeSet();


    }

    @Override
    protected void controlDelete() throws MyException{

        controlIsBoxEmpty();


    }

    private void controlNameSet() throws MyException{

        if(entity.getName() == null || entity.getName().isEmpty()){

            throw new MyException("Name must be set.");

        }
    }

    private void controlNameLength() throws MyException{

        if(entity.getName().length() > 20){

            throw new MyException("Name cannot be longer than 20 characters.");

        }
    }



    private void controlCapacity() throws MyException{

        if(entity.getCapacity() == null || entity.getCapacity() <= 0){

            throw new MyException("Capacity should be greater than zero.");
        }


    }

    private void controlSize() throws MyException{

        if (entity.getSize() == null || entity.getSize().compareTo(BigDecimal.ZERO) <= 0) {

            throw new MyException("Size should be greater than zero.");
        }

    }

    private void controlIsBoxEmpty() throws MyException{

        if(entity.getDogs().size() > 0) {

            throw new MyException("Box contains dogs and cannot be deleted.");

        }

    }

    private void controlIsNameUnique() throws MyException{

        var boxList = session
                .createQuery("from Box b where b.name=:name")
                .setParameter("name", entity.getName())
                .list();

        if(boxList.size() > 0){

            throw new MyException("Name of box already exist, please enter other name.");

        }

    }


    private void controlEmployeeSet() throws MyException{

        if(entity.getEmployee() == null){

            throw new MyException("Please enter employee for this box.");

        }

    }

}



