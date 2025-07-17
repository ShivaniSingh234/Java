package OOPS;

class AccessExample{
public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; // package-private (default)

    public void publicMethod() {
        System.out.println("Public Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    public void showAll() {
        // All accessible within same class
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);

        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }
}


public class Access {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.publicMethod();         
        // obj.privateMethod();     Not accessible
        obj.protectedMethod();      
        obj.defaultMethod();        

        obj.showAll();
    }
}
