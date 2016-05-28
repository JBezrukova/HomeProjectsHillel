package game.homeTask2;

/**
 * Created by ��� on 16.02.2016.
 */
public class Array {
    public static void main(String[] args) {
        int[] array={5,4,8,75,32,10,24,-9,25};
        int min=array[0];
        int max=array[0];

        for (int element:array){
            if (element > max){
                max = element;
            }
            if (element < min){
                min = element;
            }
        }
        System.out.println("Array max: "+max);
        System.out.println("Array min: "+min);
    }
}
