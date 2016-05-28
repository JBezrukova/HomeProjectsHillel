package HomeTask3;

import java.util.Scanner;

/**
 * Created by Þëÿ on 20.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("What do u want to do with this number?");
        System.out.println("Enter \"1\" to convert to the binary system");
        System.out.println("Enter \"2\" to convert to the decimal system");
        int  choise = scanner.nextInt();
        switch (choise) {
            case 1:
                BInary.toBinary(number);
                break;
            case 2:
                BInary.toDecimal(number);
                break;
            default:
                System.out.println("Incorrect input data. Try again");

        }
    }
}
