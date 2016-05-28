package HomeTask3;

/**
 * Created by Þëÿ on 20.02.2016.
 */
public class BInary {

    public static void toBinary(int number) {
        System.out.print(number + " converted to the binary system= ");
        int[] array = new int[20];
        int i = 0;
        int k = 0;
        while (number > 0) {
            array[i] = number % 2;
            number = number / 2;
            i++;
            k++;
        }

        for (i = k - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
    public static void toDecimal(int number) {
        int result = 0;
        System.out.print(number + " converted to the decimal system = ");
       int  i=0;
        while(number>0){
           result =result + (int) Math.pow(2,i)*(number%10);
            i++;
            number=number/10;

        }
        System.out.print(result);

    }

    }


