package HomeTask3;

import java.util.Scanner;

/**
 * Created by Þëÿ on 20.02.2016.
 */
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the first array: ");
        int array1Size = scanner.nextInt();
        System.out.println("Enter size of the second array: ");
        int array2Size = scanner.nextInt();
        int[] array1 = new int[array1Size];
        int[] array2 = new int[array2Size];
        System.out.println("Fill the first sorted array:");
        array1 = Utils.getArrayFromConsole(array1Size);
        System.out.println("Fill the second sorted array: ");
        array2 = Utils.getArrayFromConsole(array2Size);
        System.out.println();

        Utils.prinArray(arraysSort(array1, array1Size, array2, array2Size));


    }

    private static int[] arraysSort(int[] array1, int size1, int[] array2, int size2){
        int[] sortedArray = new int[size1+size2];
        int index3=0;
        int index1=0;
        int index2=0;
        while((index1<size1)&&(index2<size2)){
            if (array1[index1]<array2[index2]){
                sortedArray[index3]=array1[index1];
                index1++;
            }
            else {
                sortedArray[index3]=array2[index2];
                index2++;
            }
            index3++;
        }
        if (index1<size1){
            for (int i=index1; i<size1;i++){
                sortedArray[index3]= array1[i];
                index3++;
            }

            }
        else {
            for (int i= index2; i<size2;i++){
                sortedArray[index3]=array2[i];
                index3++;
            }
        }

        return sortedArray;
    }
}
