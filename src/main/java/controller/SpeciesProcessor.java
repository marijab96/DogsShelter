package controller;


import model.Box;
import model.Species;
import util.MyException;
import java.util.List;

public class SpeciesProcessor extends Processor<Species>{

    @Override
    public List<Species> getData() {
        return session.createQuery("from Species").list();
    }


    public List<Species> getData(String condition) {

        return session.createQuery("from Species s"
                + " where concat(s.name)"
                +" like :condition")
                .setParameter("condition", "%" + condition + "%")
                .setMaxResults(100)
                .list();
    }


    @Override
    protected void controlCreate() throws MyException {

       controlNameSet();
       controlNameLength();
        controlIsNameUnique();

    }

    @Override
    protected void controlUpdate() throws MyException {

       controlNameSet();
       controlNameLength();
        controlIsNameUnique();

    }

    @Override
    protected void controlDelete() throws MyException {

        controlIsSpeciesAssigned();

    }


    private void controlNameSet() throws MyException {

        if (entity.getName() == null || entity.getName().isEmpty()) {

            throw new MyException("Name must be set.");

        }
    }

    private void controlNameLength() throws MyException {

        if (entity.getName().length() > 20) {

            throw new MyException("Name cannot be longer than 20 characters.");

        }
    }

    private void controlIsSpeciesAssigned() throws MyException{


        var speciesList =session
                .createQuery("from Dog d where d.species.name=:name")
                .setParameter("name", entity.getName())
                .list();

        if(speciesList.size() > 0){

            throw new MyException("That species is assigned and can not to be deleted.");

        }


    }

    private void controlIsNameUnique() throws MyException{

        var speciesList = session
                .createQuery("from Species s where s.name=:name")
                .setParameter("name", entity.getName())
                .list();

        if(speciesList.size() > 0){

            throw new MyException("That species already exist, name must be unique.");

        }

    }
}
