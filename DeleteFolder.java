import java.io.File;

public class DeleteFolder{
    public static void main(String[] args){


    File myObj = new File("C:\\Users\\damin\\OneDrive\\Desktop\\py4e\\first.py");
    if (myObj.delete()){
    System.out.println("Deleted the Folder" +myObj.getName());
    }
    else{
        System.out.println("Failed to delete the folder");
    }
    }
}