package util;

import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import us.codecraft.xsoup.Xsoup;

public class OibCheck {

    public static boolean oibValidation (String oib) {

        if (oib.length() != 11) {
            return false;
        }

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int control = 11 - a;
        if (control == 10) {
            control = 0;
        }
        return control == Integer.parseInt(oib.substring(10));
    }

    public static String getOibIsCentral() {
        try {
            String html = new Scanner(new URL("http://oib.itcentrala.com/oib-generator/").openStream(), "UTF-8").useDelimiter("\\A").next();

            org.jsoup.nodes.Document document = Jsoup.parse(html);
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(document).get();
        } catch (Exception e) {
            return null;
        }
    }
}
