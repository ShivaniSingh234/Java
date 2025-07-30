package THREAD2;

public class SleepThread extends Thread{
    public void run()
    {
        for (int i = 1; i <= 5; i++) {                //sleep is static method
            try{
                Thread.sleep(1000);
                // Thread.sleep(1000, -1);          --> throws exception due to -1
                System.out.println(i);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        SleepThread s1 = new SleepThread();
        s1.start();
    }
}
