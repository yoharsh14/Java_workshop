import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.E;

public class DateTime {
    public static void main(String[] args) {
        Date date = new Date(115, 5, 8);
        System.out.println(date);
        System.out.println(DateFormat.getTimeInstance().format(date));
        System.out.println(DateFormat.getTimeInstance().format(date));
        System.out.println(DateFormat.getTimeInstance(DateFormat.SHORT).format(date));
        System.out.println(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date));
        System.out.println(DateFormat.getTimeInstance(DateFormat.LONG).format(date));
        System.out.println(DateFormat.getDateInstance().format(date));
        SimpleDateFormat sd = new SimpleDateFormat("E dd-MM-YYYY hh:mm:ss");
        System.out.println(sd.format(date));
    }
}
