import java.util.*;
public class Function{
    public static void PrintMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name=sc.next();

        PrintMyName(name);
    }
    
}