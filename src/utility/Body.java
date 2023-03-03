package utility;

import services.Decryption;
import services.Encryption;

import java.util.Scanner;

public class Body {
    public void ceaserCypher(){
        Decryption decryption = new Decryption();
        Encryption encryption = new Encryption();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ====== CEASER CYPHER ======");
        System.out.println("A password encryption service that helps you send and receive encrypted messages and decrypt" +
                " them for you as well \n");

        System.out.println("Would you like to \"ENCODE\" a message or to \"DECODE\" a message : ");
        System.out.println("Select 1 to encode or 2 to decode a message");
        int decision = Integer.parseInt(scanner.nextLine());
        if (decision == 1){
            encryption.encryptData();
        } else if (decision == 2){
            decryption.decryptData();
        } else
            System.out.println("Wrong input");

    }
}
