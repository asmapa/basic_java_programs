import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringToken {
    public static void main(String[] args) throws IOException {
        // Reading a line of integers from the user
        System.out.println("Enter a line of integers separated by spaces:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();

        // Using StringTokenizer to extract integers
        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        // Displaying each integer and calculating the sum
        int sum = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int num = Integer.parseInt(token);
            System.out.println("Integer: " + num);
            sum += num;
        }

        // Displaying the sum of integers
        System.out.println("Sum of Integers: " + sum);
    }
}
