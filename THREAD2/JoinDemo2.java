package THREAD2;


//child thread will wait now
public class JoinDemo2 extends Thread{
    static Thread mainthread;
     public void run()
    {
        
         for (int i = 1; i <= 5; i++) {                
            try{
                mainthread.join();
                System.out.println("Child thread: " + i);
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        mainthread= Thread.currentThread();
        JoinDemo2 j = new JoinDemo2();
        j.start();
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
