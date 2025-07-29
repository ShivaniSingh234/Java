package THREAD;

//step1
public class Basic2 implements Runnable{
    //step2
     public void run()
    {
        System.out.println("Thread creation using Runnable class.");
    }
    public static void main(String[] args)
    {
        //step 3
        Basic2 t1 = new Basic2();
        //step 4
        Thread th = new Thread(t1);
        //step 5
        th.start();
    }
}
