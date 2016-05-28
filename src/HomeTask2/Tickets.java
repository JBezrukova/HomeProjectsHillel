package HomeTask2;

/**
 * Created by Þëÿ on 16.02.2016.
 */
public class Tickets {
    public static void main(String[] args) {
        int[] array = new int[10];
        int m=0;

        System.out.println("Happy tickets: ");
        for (int i=100000; i<1000000;i++){
            int ticket=i;
            int j=0;
            int sum1=0;
            int sum2=0;
            while(ticket>0){
                array[j] = ticket % 10;
                ticket=ticket/10;
                if (j<3){
                    sum1= sum1+array[j];
                }
                else {
                    sum2=sum2+array[j];
                }
                j++;
            }
            if (sum1 == sum2){
                m++;
                System.out.println(i);
            }

        }
        System.out.println(m);
    }
}

