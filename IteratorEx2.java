import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");

        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}