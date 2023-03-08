public class ExceptionHandle{
    public static void main(String[] args){
        try{
            int[] myNumbers = {1,2,6,3,9};
            System.out.println(myNumbers[10]);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}