package JavaIO;

import java.util.Scanner;

public class InputOutputProcessExample {
    public static void main(String[] args) {
        // Following code will create scannerObj of scanner class
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the name of the Student");

        // below line of code ensures that data will be input as string by default
        String studentName = scannerObj.next();
        System.out.println("Enter the roll number of the student");

        // below line of code ensures that data will be input as int by default
        int studentRollNumber = scannerObj.nextInt();
        System.out.println("Enter the marks that the student obtained");

        float studentMarks = scannerObj.nextFloat();
        System.out.println("---------Student Report Card ----------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll No: " + studentRollNumber);
        System.out.println("Student Marks: " + studentMarks);

        // Following code is needed to avoid resource leak
        scannerObj.close();

        // System.err works!
        System.err.println("This is Error Message");
    }
}
