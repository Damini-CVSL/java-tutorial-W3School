import java.util.ArrayList;

public class OtherTypesArrayList{

    public static void main(String[] args){

     ArrayList<Integer> cars = new ArrayList<Integer>();

        cars.add(10);
        cars.add(20);
        cars.add(30);
        cars.add(40);
        for(int i : cars){
            System.out.println(i);
        }
    }
}
