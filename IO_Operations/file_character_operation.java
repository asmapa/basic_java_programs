
package IO_Operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_character_operation {
    public static void main(String[] args) throws IOException{
        
        try  {
            FileReader fil=new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(fil);
            FileWriter fir=new FileWriter("example2.txt");
            BufferedWriter writer=new BufferedWriter(fir);
            String line;
           // int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
               
                
            }
            fil.close();
                reader.close();
                writer.close();
                fir.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file cant see");
        }
    }
}



