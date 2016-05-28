package HomeTask2;

import java.util.Scanner;

/**
 * Created by Þëÿ on 16.02.2016.
 */
public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Binary system: ");
        int[] array = new int[20];
        int i=0;
        int k=0;
        while (number>0){
            array[i] = number % 2;
            number = number/2;
            i++;
            k++;
        }
        for (i=k-1; i>=0; i--){
            System.out.print(array[i]);
        }
    }
}
