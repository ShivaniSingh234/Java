package OOPS;



class Singleton {
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Private Constructor Called");
    }

    // Public static method to get instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
public class PrivateConstr {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();  
    }
}
