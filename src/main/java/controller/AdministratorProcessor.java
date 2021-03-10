package controller;

import model.Administrator;
import util.MyException;

import java.util.List;

public class AdministratorProcessor extends Processor<Administrator>{

    @Override
    public List<Administrator> getData() {
        return session.createQuery("from Administrator").list();
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
