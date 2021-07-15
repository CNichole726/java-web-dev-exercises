package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is the length of your rectangle?:");
        int length = input.nextInt();

        System.out.println("Ok, and what is the width of your rectangle?:");
        int width = input.nextInt();

        System.out.println("Area = " + (length * width));

        input.close();
    }
}