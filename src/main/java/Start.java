import controller.BoxProcessor;
import controller.SpeciesProcessor;
import model.Box;
import model.Species;
import org.hibernate.Session;
import util.HibernateUtil;
import util.InitialFixtures;
import util.MyException;

import java.math.BigDecimal;


public class Start {


    public static void main(String[] args) {

        Session s = HibernateUtil.getSession();
        InitialFixtures.start();


        SpeciesProcessor sp = new SpeciesProcessor();

        Species species = sp.getData().get(1);
        sp.setEntity(species);
        try {
            sp.delete();
        } catch (MyException e) {
            e.printStackTrace();
        }


        try {
            sp.create();
        } catch (MyException e){
            System.out.println(e.getMessage());
    }


//        for(Box bo : bx.getData()){
//        System.out.println(b.getName());
//        }

    }


}
