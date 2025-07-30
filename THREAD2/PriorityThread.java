package THREAD2;

public class PriorityThread extends Thread{

    public void run()
    {
        System.out.println("Child Thread");
        System.out.println("Child thread priority: " + Thread.currentThread().getPriority());       //gives 10
    }
    public static void main(String[] args) {
        
        System.out.println("Main thread old priority: " + Thread.currentThread().getPriority());         //gives 5
        Thread.currentThread().setPriority(7);
        System.out.println("Main thread new priority: " + Thread.currentThread().getPriority());         //gives 5
        
        PriorityThread p = new PriorityThread();
        p.setPriority(MAX_PRIORITY);
        p.start();
    }
}
