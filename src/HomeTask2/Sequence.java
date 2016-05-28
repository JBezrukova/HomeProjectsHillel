package HomeTask2;

/**
 * Created by Þëÿ on 16.02.2016.
 */
public class Sequence {
    public static void main(String[] args) {

        System.out.println("All numbers of sequence (if construction): ");
        for (int i=1000; i<10000;i+=3){
            System.out.println(i);
        }
        System.out.println("All numbers of sequence (while construction): ");
        int i=1000;
        while (i<10000){
            System.out.println(i);
            i+=3;
        }
    }
}

