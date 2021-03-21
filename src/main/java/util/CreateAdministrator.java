package util;

import controller.AdministratorProcessor;
import model.Administrator;
import org.mindrot.jbcrypt.BCrypt;

public class CreateAdministrator {

    public static void main(String[] args) {

        Administrator a = new Administrator();
        a.setFirstName("Marija");
        a.setLastName("Bralić");
        a.setEmail("dogsshelter@gmail.com");
        a.setOib(OibCheck.getOibIsCentral());
        a.setUserName("marija");
        a.setPassword(BCrypt.hashpw("fredi", BCrypt.gensalt()));


        AdministratorProcessor ap = new AdministratorProcessor();
        ap.setEntity(a);

        try {
            ap.create();
        } catch (MyException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
