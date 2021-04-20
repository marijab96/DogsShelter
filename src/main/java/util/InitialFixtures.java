package util;


import com.github.javafaker.Faker;
import model.*;
import org.hibernate.Session;

import java.math.BigDecimal;

/*
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
            e.setOib(OibCheck.getOibIsCentral());
            e.setMobileNumber(faker.phoneNumber().cellPhone());
            s.save(e);
        }


       Box b;

        for(int i = 0; i<100 ; i++){

            e = new Employee();
            e.setFirstName((faker.name().firstName()));
            e.setLastName(faker.name().lastName());
            e.setOib(OibCheck.getOibIsCentral());
            e.setMobileNumber(faker.phoneNumber().cellPhone());
            s.save(e);

            b = new Box();
            b.setCapacity(faker.number().numberBetween(1,10));
            b.setName(faker.funnyName().name());
            b.setSize(BigDecimal.valueOf(faker.number().randomDouble(2, 10, 50)));
            b.setEmployee(e);
            s.save(b);
        }

        Dog d;
        Species specie;

        Box box = new Box();
        box.setCapacity(faker.number().numberBetween(1,10));
        box.setName(faker.funnyName().name());
        box.setSize(BigDecimal.valueOf(faker.number().randomDouble(2, 10, 50)));
        s.save(box);

        for(int i = 0 ; i <10; i++){
            specie = new Species();
            specie.setName(faker.dog().name());
            s.save(specie);
            d= new Dog();
            d.setName(faker.funnyName().name());
            d.setAdopted(true);
            d.setBox(box);
            d.setYearOfBirth(2020);
            d.setSpecies(specie);
            s.save(d);
        }

        s.getTransaction().commit();


    }

}
*/