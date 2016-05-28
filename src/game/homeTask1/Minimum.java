package game.homeTask1;

/**
 * Created by ��� on 12.02.2016.
 */
import java.io.*;

public class Minimum {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers: ");

        int numMass[] = new int[5];
        for (int i=0; i<3;i++){
            numMass[i]=Integer.parseInt(reader.readLine());
        }

        for( int i=0; i<3;i++){
            int min = numMass[i];
            int position = i;
            for (int j=i+1;j<3;j++){
                if(numMass[j]<min)
                {
                    min = numMass[j];
                    position = j;
                }
            }
            if (i != position) {
                int box = numMass[i];
                numMass[i] = numMass[position];
                numMass[position] = box;}
        }

        System.out.println("Sorted mass: ");
        for (int i=0; i<3;i++)
            System.out.println(numMass[i]);

        int min = numMass[0];
        for (int i=0; i<3; i++){
            if (numMass[i]==min) System.out.println("Minimum is numMass["+i+"]= "+numMass[i]);
        }

    }
}



