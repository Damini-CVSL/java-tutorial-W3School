import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("Damini.txt");
            myWriter.write("This is my first file program");
            myWriter.close();
            System.out.println("Successfully wrote to file.");
        } catch(IOException e){
            System.out.println("An Error Occur");
            e.printStackTrace();
        }
    }
}