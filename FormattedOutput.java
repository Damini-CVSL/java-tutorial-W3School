import java.util.Scanner;

public class FormattedOutput{
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("=========================");
        for(int i = 0; i < 3; i++){
            String s = myScan.next();
            int x = myScan.nextInt();
            System.out.printf("%-15s%03d\n",s,x);
        }
        System.out.println("========================");
    }
}