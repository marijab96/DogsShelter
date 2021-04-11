package controller;

import model.Dog;
import util.MyException;

import java.util.List;

public class DogProcessor extends Processor<Dog>{


    @Override
    public List<Dog> getData() {
        return session.createQuery("from Dog ").list();
    }
    
    public List<Dog> getData(String conditionDog) {

        return session.createQuery("from Dog d"
                + " where (d.name)"
                +" like :conditionDog")
                .setParameter("conditionDog", "%" + conditionDog + "%")
                .setMaxResults(100)
                .list();
    }

    @Override
    protected void controlCreate() throws MyException {

        controlNameSet();
        controlNameLength();
        controlChipNumberSet();
        controlEmployeeSet();
        controlBoxSet();
        controlSpeciesSet();
        controlIsChipNumberUnique();

    }

    @Override
    protected void controlUpdate() throws MyException {

        controlNameSet();
        controlNameLength();
        controlChipNumberSet();
        controlEmployeeSet();
        controlBoxSet();
        controlSpeciesSet();
        controlIsChipNumberUnique();

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

    private void controlChipNumberSet() throws MyException{

        if(entity.getChipNumber() == null || entity.getChipNumber() <= 0 ){

            throw new MyException("Chip number must be set.");
        }
    }

    private void controlEmployeeSet() throws MyException{

        if(entity.getEmployee() == null){

            throw new MyException("Please enter employee for this dog.");

        }

    }

    private void controlBoxSet() throws MyException{

        if(entity.getBox() == null){

            throw new MyException("Please enter box for this dog.");

        }

    }

    private void controlSpeciesSet() throws MyException{

        if(entity.getSpecies() == null){

            throw new MyException("Please enter species for this dog.");

        }

    }

    private void controlIsChipNumberUnique() throws MyException{

        var dogsList = session
                .createQuery("from Dog d where d.chipNumber=:chipNumber")
                .setParameter("chipNumber", entity.getChipNumber())
                .list();

        for(Object dogObject : dogsList) {
            Dog dog = (Dog) dogObject;
            if(dog.getId().equals(entity.getId())) {
                dogsList.remove(dog);
                break;
            }
        }

        if(dogsList.size() > 0){

            throw new MyException("That chip number already exist, chip number must be unique.");

        }

    }
}
