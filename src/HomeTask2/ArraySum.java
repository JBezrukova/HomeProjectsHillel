package HomeTask2;

/**
 * Created by Þëÿ on 16.02.2016.
 */
import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter number of elements: ");
        int number = scanner.nextInt();
        for (int i=0; i<size; i++){
            array[i]=i;
        }
        int i=0;
        int sum =0;
        while (i<number){
            sum = sum+array[i];
            i++;
        }
        System.out.println("The sum is: "+sum);

    }
}

