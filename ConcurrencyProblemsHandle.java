public class ConcurrencyProblemsHandle extends Thread{
    public static int amount = 0;
        public static void main(String[] args){

            ConcurrencyProblemsHandle myThread = new ConcurrencyProblemsHandle();
            myThread.start();
            //Wait for the thread to finish
            while(myThread.isAlive()){
                System.out.println("Waiting...");
            }

            System.out.println("MAin: " +amount);
            amount++;
            System.out.println("MAin: " +amount);
        }

        public void run(){
            amount++;
        }
}
