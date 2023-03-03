package services;

import interfaces.Decrypt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Decryption implements Decrypt {
    private final String[] alphabet_dec = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private ArrayList<String> newAlph = new ArrayList<>();
    public void decryptData(){
        Scanner scanner = new Scanner(System.in);

        newAlph.addAll(Arrays.asList(alphabet_dec));

        ArrayList<String> decrypted = new ArrayList<>();
        System.out.println("Please provide the text you would like to decrypt: ");
        // Collect the encrypted message you would like to decrypt
        String text_to_decrypt = scanner.nextLine();
        // Select the key to use to decrypt your text
        System.out.println("Please select the key to decrypt the message with: ");
        int key_to_decrypt = scanner.nextInt();
        String[] arrDecrypt = text_to_decrypt.split("");
        for (int i = 0; i < arrDecrypt.length; i++){
            // The logic for a space character
            if (!newAlph.contains(arrDecrypt[i])){
                decrypted.add(arrDecrypt[i]);
                continue;
            }
            // Getting the index of the user input in the whole alphabet array
            int loc = newAlph.indexOf(arrDecrypt[i]);
            // Building a logic to restart the count process when at the last character
            int position = loc - key_to_decrypt;
            if (position < 0){
                position = position + 26;
            }
            // Adding the character at the alphabet position plus the shift key
            decrypted.add(alphabet_dec[position]);
        }
        String value = String.join("", decrypted);
        System.out.println("The Result is : " + value);
    }
}
