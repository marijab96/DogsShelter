package controller;


import model.Box;
import util.MyException;

import java.util.List;


public class BoxProcessor extends Processor<Box> {

    public BoxProcessor(){
        super();
    }
    public BoxProcessor(Box b){
        super(b);
    }

    @Override
    public List<Box> getData() {
        return session.createQuery("from Box").list();
    }

    @Override
    protected void controlCreate() throws MyException {
        controlNameSet();
    }

    @Override
    protected void controlUpdate() {

    }

    @Override
    protected void controlDelete() {

    }

    private void controlNameSet() throws MyException{
        if(entity.getName() == null || entity.getName().isEmpty()){
            throw new MyException("Name must be set.");

        }
    }
}
