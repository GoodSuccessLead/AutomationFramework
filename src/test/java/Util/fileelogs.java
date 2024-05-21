package Util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class fileelogs {
    public void test() {
        try {
            // Create a FileOutputStream object to write to a file
            FileOutputStream fileOutputStream = new FileOutputStream("Logfile.txt");

            // Create a PrintStream object with the FileOutputStream
            PrintStream printStream = new PrintStream(fileOutputStream);

            // Redirect System.out to the PrintStream
            System.setOut(printStream);

            // Now, anything printed using System.out will be written to output.txt

            // Close the streams when done
            printStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
