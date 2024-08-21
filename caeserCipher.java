import java.util.*;

public class caeserCipher{
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
        System.out.println("Welcome "+name+"!\nPlease enter the data that is to be encrypted, we will be using Caeser Cipher to encrypt the data.");
        String data = read.nextLine();
        System.out.println("Choose any number between 1 to 9:");
        int k = read.nextInt();
        read.nextLine();
    
        String encryptedData = encrypt(data,k);
        System.out.println("Encrypted data: " + encryptedData);
    }

    public static String encrypt(String data, int k){
        char[] ch = new char[data.length()];
        for(int i=0; i< data.length(); i++){
            ch[i] = data.charAt(i);
            if(ch[i] == ' '){
                ch[i] = '*';
            }
            else{
                ch[i] = (char) (ch[i] + k);
            }
        }
        
        return new String(ch);
    }
}