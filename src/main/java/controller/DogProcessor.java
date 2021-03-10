package controller;

import model.Dog;
import util.MyException;

import java.util.List;

public class DogProcessor extends Processor<Dog>{


    @Override
    public List<Dog> getData() {
        return session.createQuery("from Dog ").list();
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
