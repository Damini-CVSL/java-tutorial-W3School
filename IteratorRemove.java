import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(82);
        numbers.add(8);

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer  i = it.next();
            if(i<10){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}