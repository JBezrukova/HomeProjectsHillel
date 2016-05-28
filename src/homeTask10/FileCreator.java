package homeTask10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Юля on 18.04.2016.
 */
public class FileCreator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of file in bytes: ");
        int size = Integer.parseInt(reader.readLine());

        System.out.println("Enter path to file: ");
        String file = reader.readLine();

        createFile(file, size);
    }

    private static void createFile(String file, int size) {

       File newFile = new File(file);

        int count = 0;

        try {
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
                while (count < size) {
                    writer.write("0");
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
