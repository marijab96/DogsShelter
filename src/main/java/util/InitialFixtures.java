package util;


import com.github.javafaker.Faker;
import controller.AdministratorProcessor;
import model.Administrator;
import model.Box;
import model.Employee;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

import java.math.BigDecimal;


public class InitialFixtures {

    public static void start(){

        Session s = HibernateUtil.getSession();

        s.beginTransaction();

        Faker faker = new Faker();

        Employee e;

        for(int i = 0; i < 15 ; i++){

            e = new Employee();
            e.setFirstName((faker.name().firstName()));
            e.setLastName(faker.name().lastName());
            e.setOib(OibCheck.getOibIiCentral());
            e.setMobileNumber(faker.phoneNumber().cellPhone());
            s.save(e);
        }


       Box b;

        for(int i = 0; i<100 ; i++){

            e = new Employee();
            e.setFirstName((faker.name().firstName()));
            e.setLastName(faker.name().lastName());
            e.setOib(OibCheck.getOibIiCentral());
            e.setMobileNumber(faker.phoneNumber().cellPhone());
            s.save(e);

            b = new Box();
            b.setCapacity(faker.number().numberBetween(1,10));
            b.setName(faker.funnyName().name());
            b.setSize(BigDecimal.valueOf(faker.number().randomDouble(2, 10, 50)));
            b.setEmployee(e);
            s.save(b);
        }
        s.getTransaction().commit();


        Administrator a = new Administrator();
        a.setFirstName("Marija");
        a.setLastName("Bralić");
        a.setEmail("marija.bralic96@gmail.com");
        a.setOib(OibCheck.getOibIiCentral());
        a.setUserName("marija");
        a.setPassword(BCrypt.hashpw("marija", BCrypt.gensalt()));

        AdministratorProcessor ap = new AdministratorProcessor();
        ap.setEntity(a);


        try {
            ap.create();
        } catch (MyException exception) {
            System.out.println(exception.getMessage());
        }




    }




}
