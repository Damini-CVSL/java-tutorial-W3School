import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile{
        public static void main(String[] args){
            try{
            File ReadFile = new File("Damini.txt");
            Scanner Reader = new Scanner(ReadFile);
            while (Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.print(data);
            }
            Reader.close();
            }catch(FileNotFoundException e){
                System.out.println("An error occurred");
            }

        }
}