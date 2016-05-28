package HomeTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.*;

/**
 * Created by Юля on 20.02.2016.
 */
public class Reduction {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter str: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str= reader.readLine();
        String[] str1 = str.split(" ");
        System.out.println("Reductioned str: ");
        for (int i=0; i<str1.length; i++ ){
            if (str1[i].length()>3){
                str1[i] = reductionFunction(str1[i]);
            }
            System.out.print(str1[i]+" ");
        }


    }

    private static String reductionFunction(String word){

            String number = Integer.toString(word.length()-2);
            word = word.replace(word.substring(1,word.length()-1),number);
        return word;
    }
}
