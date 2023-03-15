import java.util.*;

public class CalendarGetMethod{
    public static void main(String[] args){

        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
    }

}