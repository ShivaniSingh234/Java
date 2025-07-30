package THREAD2;

//main thread will wait 

public class JoinDemo extends Thread {
    public void run()
    {
         for (int i = 1; i <= 5; i++) {                
            try{
                
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        JoinDemo j1 = new JoinDemo();
        j1.start();
        j1.join();
         for (int i = 1; i <= 5; i++) {                
            try{
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
