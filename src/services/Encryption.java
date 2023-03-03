package services;

import interfaces.Encrypt;

import java.util.ArrayList;
import java.util.Scanner;

public class Encryption implements Encrypt {
    private final String[] alphabet = {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private ArrayList<String> alph = new ArrayList<>();
    public void encryptData(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < alphabet.length; i++){
            alph.add(alphabet[i]);
        }
        // Created an empty array list to hold the final result
        ArrayList<String> encrypted = new ArrayList<>();
        System.out.println("Please provide the text that you would like to encrypt");
        //Collect user text or message
        String text_to_encrypt = scanner.nextLine();
        //Collect user key
        System.out.println("Please provide the key value ");
        int key_to_encrypt = scanner.nextInt();
        // Converting user text or message to an array
        String[] sp = text_to_encrypt.split("");
        // Looping through the user text or message a single character at a time to count shift
        for (int i = 0; i < sp.length; i++){
            // The logic for a space character
            if (!alph.contains(sp[i])){
                encrypted.add(sp[i]);
                continue;
            }
            // Getting the index of the user input in the whole alphabet array
            int loc = alph.indexOf(sp[i]);
            // Building a logic to restart the count process when at the last character
            int position = loc + key_to_encrypt;
            if (position > 26){
                position = position - 26;
            }
            // Adding the character at the alphabet position plus the shift key
            encrypted.add(alphabet[position]);
        }
        String value = String.join("", encrypted);
        // Print result
        System.out.println("The Result is : " + value);
    }
}
