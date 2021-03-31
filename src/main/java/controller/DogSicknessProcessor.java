package controller;


import model.DogSickness;
import util.MyException;

import java.util.List;

public class DogSicknessProcessor extends Processor<DogSickness> {

    @Override
    public List<DogSickness> getData() {
              return session.createQuery("from DogSickness").list();
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
