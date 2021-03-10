package controller;

import model.Species;
import util.MyException;

import java.util.List;

public class SpeciesProcessor extends Processor<Species>{

    @Override
    public List<Species> getData() {
        return session.createQuery("from Species").list();
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
