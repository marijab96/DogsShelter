package controller;

import model.Sickness;
import util.MyException;

import java.util.List;

public class SicknessProcessor extends Processor<Sickness>{

    @Override
    public List<Sickness> getData() {
        return session.createQuery("from Sickness").list();
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
