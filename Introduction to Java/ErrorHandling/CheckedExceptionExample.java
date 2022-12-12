package ErrorHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {

        // GET ERROR FileNotFoundException
        // FileReader file = new FileReader("C:\\Users\\hana\\Desktop\\OJT
        // pratice\\note\\cbs.txt");
        // BufferedReader fileInput = new BufferedReader(file);

        for (int counter = 0; counter < 3; counter++) {
            // System.out.println(fileInput.readLine());
            // fileInput.close();
        }
    }
}
