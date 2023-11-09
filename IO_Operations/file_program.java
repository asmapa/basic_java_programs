package IO_Operations;
import java.io.*;

public class file_program {

    public static void main(String[] args) throws IOException {
        FileInputStream fin = null; 
        FileOutputStream fout=null;

        try {
            fin = new FileInputStream("asma.txt");
            fout = new FileOutputStream("meenu.txt");
            int data;
            while((data=fin.read())!=-1)
            {
                fout.write(data);
                System.out.print((char) data);
            }
            
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File you are trying to read is not there!!!");
        } 
        finally 
        {
            
                fin.close(); 
                fout.close();
            
        }
    }
}
