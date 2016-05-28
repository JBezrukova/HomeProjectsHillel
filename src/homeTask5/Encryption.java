package homeTask5;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Þëÿ on 28.02.2016.
 */
public class Encryption {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] key = {'x', 'e', 'u', 'i', 'p', 'o','s','q'};
        XOR textForEncryption = new XOR(key);

        System.out.println("Write the text for crypt: ");
        String text = reader.readLine();

        System.out.println("Encrypted text:");
        String encryptedText = textForEncryption.crypt(text);
        System.out.println(encryptedText);

        System.out.println("Decrypted text: ");
        System.out.println(textForEncryption.crypt(encryptedText));


    }
}
