import controller.BoxProcessor;
import model.Box;
import org.hibernate.Session;
import util.HibernateUtil;
import util.InitialFixtures;
import util.MyException;

import java.math.BigDecimal;


public class Start {


    public static void main(String[] args) {

        Session s = HibernateUtil.getSession();
        InitialFixtures.start();


        BoxProcessor bx = new BoxProcessor();
        Box b = new Box();
        bx.setEntity(b);

        try {
            bx.create();
        } catch (MyException e){
            System.out.println(e.getMessage());
    }


//        for(Box bo : bx.getData()){
//        System.out.println(b.getName());
//        }

    }


}
