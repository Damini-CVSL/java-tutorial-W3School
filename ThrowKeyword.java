public class ThrowKeyword{
    public void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access Denied! - You must be atleast 18");
        }
        else{
            System.out.println("Access Granted! - You are old enough");
        }
    }
        public static void main(String[] args){
            ThrowKeyword myObj = new ThrowKeyword();
            myObj.checkAge(13);
        }
}
