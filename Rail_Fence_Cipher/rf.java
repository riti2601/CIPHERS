package Rail_Fence_Cipher;
import java.util.*;
public class rf{
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

        System.out.println("Welcome "+name+"! Enter the data you want to enctypt: ");
        String data = read.nextLine();


        String even = "", odd = "";

        for(int i=0; i<data.length(); i++){
            if(data.charAt(i) == ' '){
                continue;
            }
            else if(i%2 == 0){
                even += data.charAt(i); 
            }
            else{
                odd += data.charAt(i);
            }
        }

        String res = even+odd;

        System.out.println("The encypted data is: "+res);
    }
}