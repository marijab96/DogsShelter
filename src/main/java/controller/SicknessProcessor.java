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

        controlNameSet();
        controlNameLength();
        controlDescriptionLengt();

    }

    @Override
    protected void controlUpdate() throws MyException {

        controlNameSet();
        controlNameLength();
        controlDescriptionLengt();

    }

    @Override
    protected void controlDelete() throws MyException {

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

    private void controlDescriptionLengt() throws MyException{

        if(entity.getDescription().length() > 500){

            throw new MyException("Description cannot be longer than 500 characters.");
        }
    }
}
