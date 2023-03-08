
public class RunningThreads implements Runnable{
    public static void main(String[] args){
        RunningThreads myObj = new RunningThreads();
        Thread myThread = new Thread(myObj);
        myThread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}