import java.util.Scanner;

public  class ScannerExample{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

            System.out.println("Enter Username");
            String userName = myObj.next();
            System.out.println("Username is " +userName );
    }



}