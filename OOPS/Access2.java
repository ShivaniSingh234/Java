package OOPS;


// final keyword is used with access specifier

class Constants {
    public final int PUBLIC_CONST = 100;
    private final int PRIVATE_CONST = 50;
    protected final int PROTECTED_CONST = 75;

    public void display() {
        System.out.println(PUBLIC_CONST);
        System.out.println(PRIVATE_CONST);
        System.out.println(PROTECTED_CONST);
    }
}

public class Access2 {
    public static void main(String[] args) {
        Constants c = new Constants();
        System.out.println(c.PUBLIC_CONST);
        c.display();
    }
}
