package HomeTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Þëÿ on 20.02.2016.
 */
public class Palindrom {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter str: ");
        String str = reader.readLine();
        String[] str1 = str.split(",");
        int numberOfPalindroms=0;
        for (String elements : str1){
            if (chekIfPalindrom(elements)==true)
                numberOfPalindroms++;
        }
        System.out.println("There are "+numberOfPalindroms+" palindroms.");
    }
    private static boolean chekIfPalindrom(String word){
        boolean palindrom=true;
            int k=0;
        word = word.trim();
            int timer = (word.length()+1)/2;
            for (int j = 0; j <timer; j++) {
                if (word.charAt(j) == word.charAt(word.length() - 1 - j)) {
                    k++;
                }
            }
            if (k == timer) {
                palindrom=true;
            }
            else palindrom= false;
        return palindrom;
    }
}
