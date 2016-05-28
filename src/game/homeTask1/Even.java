package game.homeTask1;

/**
 * Created by ��� on 13.02.2016.
 */
import java.io.*;
public class Even {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int number = Integer.parseInt(reader.readLine());
        if (number % 2 ==0) System.out.println("This number is an even");
        else System.out.println("This number is uneven");

    }
}
