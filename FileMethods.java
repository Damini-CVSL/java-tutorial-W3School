import java.io.File;

public class FileMethods{
    public static void main(String[] args){
        File myObj = new File("Damini.txt");
        if (myObj.exists()){
            System.out.println("File name : " +myObj.getName());
            System.out.println("Absolute Path : " +myObj.getAbsolutePath());
            System.out.println("Readable : " +myObj.canRead());
            System.out.println("Writable : " +myObj.canWrite());
            System.out.println("File sixe in bytes : " +myObj.length());
        }
        else{
            System.out.println("File doesn't exits");
        }
    }
}
