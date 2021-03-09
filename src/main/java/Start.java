import org.hibernate.Session;
import util.HibernateUtil;

public class Start {


    public static void main(String[] args) {

        Session s = HibernateUtil.getSession();
    }


}
