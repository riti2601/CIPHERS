package Caeser_Cipher;
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

        System.out.println("Welcomev"+name+"!\nDo you want to encrypt data or decrypt the data?\nFor encryption enter: 1\nFor decryption enter: 2");
        int x = read.nextInt();
        read.nextLine();

        switch (x) {
            case 1:
                System.out.println("\nPlease enter the data that is to be encrypted, we will be using Caeser Cipher to encrypt the data.");
                String data = read.nextLine();
                read.nextLine();
                System.out.println("Choose any number between 1 to 9:");
                int k = read.nextInt();
                
                String encryptedData = encrypt(data,k);
                System.out.println("Encrypted data: " + encryptedData);
                break;
            
            case 2:
                System.out.println("\nPlease enter the data that is to be decrypted, we will be using Caeser Cipher to decrypt the data.");
                data = read.nextLine();
                read.nextLine();
                System.out.println("Enter the number between 1 to 9 which was used for encryption before:");
                k = read.nextInt();
                
                String decryptedData = decrypt(data,k);
                System.out.println("Decrypted data: " + decryptedData);
                break;
        
            default:
                System.out.println("The input was invalid. Kindly restart.");
                break;
        }
    
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


    public static String decrypt(String data, int k){
        char[] ch = new char[data.length()];
        for(int i=0; i< data.length(); i++){
            ch[i] = data.charAt(i);
            if(ch[i] == '*'){
                ch[i] = ' ';
            }
            else{
                ch[i] = (char) (ch[i] - k);
            }
        }
        
        return new String(ch);
    }
}