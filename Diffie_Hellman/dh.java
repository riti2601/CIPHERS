package Diffie_Hellman;
import java.math.BigInteger;
import java.util.*;

public class dh {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Hello User! \nEnter your name and age:");
        String name = read.nextLine();
        int age = read.nextInt();
        read.nextLine(); // this is added so the the input is handled better, as without it the if condition was being ignored

        if(age < 18){
            System.out.println("I'm sorry you can not encrypt the data. You are very young to hide anything!");
            return;
        }

        System.out.println("Welcome "+name+"!");

        BigInteger n,g,x,y,k1,k2,A,B;

        System.out.println("Enter two prime numbers: ");
        n = new BigInteger(read.next());
        g = new BigInteger(read.next());

        System.out.println("Person A : Enter your secret number");
        x = new BigInteger(read.next());
        A = g.modPow(x, n);

        System.out.println("Person B : Enter your secret number");
        y = new BigInteger(read.next());
        B = g.modPow(y, n);

        k1 = B.modPow(x, n);
        k2 = A.modPow(y, n);

        System.out.println("A's secret key: "+k1);
        System.out.println("B's secret key: "+k2);



        
    }


}