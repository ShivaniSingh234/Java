package EXAMPLES;

import  java.util.*;

public class DiamondBoxes {

static int FindBags(int a,int b,int c,int d)
{
        if(a+b+c == d)
        return 1;
        if(a+b<=d && c<=d )
        return 2;
        if (a+c<=d && b<=d)
        return 2;
        if(b+c <= d && a<=d)
        return 2;

        return 3;
}


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number of Test Cases: ");
            int Cases = sc.nextInt();

            while(Cases-- >0){
            System.out.println("Enter the value of P diamond box: ");
            int P = sc.nextInt();
            System.out.println("Enter the value of Q diamond box: ");
            int Q = sc.nextInt();
            System.out.println("Enter the value of R diamond box: ");
            int R = sc.nextInt();
            System.out.println("Enter the value of bag: ");
            int S = sc.nextInt();

            int output = FindBags(P,Q,R,S);
            System.out.println("This case requires:" + output +" bags.");

            }
        



        }
    }
}
