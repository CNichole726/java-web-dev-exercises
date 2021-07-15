package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

        System.out.println("How much gas have you used (in gallons)?");
        Double gallons = input.nextDouble();

        Double mpg = miles/gallons;
        System.out.println("Miles per gallon = " + mpg);

        input.close();
    }
}
