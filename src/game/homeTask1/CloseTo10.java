package game.homeTask1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

/**
 * Created by ��� on 13.02.2016.
 */
public class CloseTo10 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 == num2) System.out.println("located identically with respect to 10");
        else {
            if (Math.abs(num1 - 10) > Math.abs(num2 - 10)) System.out.println("Num2= " + num2 + " is closed to 10");
            else System.out.println("Num1= " + num1 + " is closed to 10");

        }
    }


}
