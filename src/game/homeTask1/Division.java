package game.homeTask1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ��� on 13.02.2016.
 */
public class Division {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 % num2 == 0 ) System.out.println(num1+ " divided by "+num2 +" evenly");
        else System.out.println(num1 +" does not divided by "+num2 + " evenly");
    }
}

