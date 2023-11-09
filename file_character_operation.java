package IO_Operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file_character_operation {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.printf("%d: %s%n", lineNumber, line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

