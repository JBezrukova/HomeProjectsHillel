package homeTask10;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

/**
 * Created by Юля on 18.04.2016.
 */
public class CounterOfProducity {

    public static void main(String[] args) {

        fileCopyInputOutputStreamDuration();

        fileCopyWithBufferedReaderAndWriter();

    }

    private static void fileCopyInputOutputStreamDuration() {
        Instant begin = Instant.now();

        try (InputStream inputStream = new FileInputStream("./newFile.txt");
             OutputStream outputStream = new FileOutputStream("./newFile_copy.txt")) {

            int value;

            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(begin,end);
        System.out.println("Productivity of file copy with Input stream and output stream: " + duration.toMillis());
    }

    private static void fileCopyWithBufferedReaderAndWriter(){

        Instant begin = Instant.now();

        File file = new File("./newBufferedCopy.txt");

        try {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./newFile.txt")));
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))){
                String value;
                while((value = reader.readLine()) != null){
                    writer.write(value);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();
        Duration duration = Duration.between(begin, end);
        System.out.println("Productivity of buffered copy: "+duration.toMillis());
    }

}
