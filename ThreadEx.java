public class ThreadEx extends Thread{
    public static void main(String[] args){
        ThreadEx thread = new ThreadEx();
        thread.start();
        System.out.println("This code is running outside of the thread"); 
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}