package THREAD2;


//multiple threads execute together
public class SleepDemo2 extends Thread{
    public void run()
    {
         for (int i = 1; i <= 5; i++) {                
            try{
                System.out.println(i + " : " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        SleepDemo2 s1 = new SleepDemo2();
        s1.start();

        SleepDemo2 s2 = new SleepDemo2();
        s2.start();

        // s1.run();      thread won't be created
        // s2.run();
    }
}
