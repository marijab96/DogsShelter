package controller;

import model.Administrator;
import org.mindrot.jbcrypt.BCrypt;
import util.MyException;

import java.util.List;

public class AdministratorProcessor extends Processor<Administrator>{

    public Administrator authorize(String email, char [] password){

        Administrator administrator = (Administrator) session
                .createQuery("from Administrator a where a.email=:email")
                .setParameter("email", email)
                .getSingleResult();

        if(administrator==null){
            return null;
        }

        return BCrypt.checkpw(new String(password),administrator.getPassword()) ? administrator : null;

    }



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
