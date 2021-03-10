package controller;

import model.Employee;
import util.MyException;

import java.util.List;

public class EmployeeProcessor extends Processor<Employee>{

    @Override
    public List<Employee> getData() {
        return session.createQuery("from Employee").list();
    }

    @Override
    protected void controlCreate() throws MyException {

    }

    @Override
    protected void controlUpdate() throws MyException {

    }

    @Override
    protected void controlDelete() throws MyException {

    }
}
