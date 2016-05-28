package HomeTask2;

/**
 * Created by Þëÿ on 16.02.2016.
 */
public class Array2 {
    public static void main(String[] args) {
        int[] array ={20,25,36,3,1,45,47,42,22};
        int evenSum = 0;
        int unEvenSum = 0;
        for (int element:array){
            if (element % 2 == 0){
                evenSum = evenSum + element;
            }
            else unEvenSum = unEvenSum + element;
        }
        System.out.println("The sum of even elements is : "+evenSum);
        System.out.println("The sum of uneven elements is : "+unEvenSum);

    }
}

