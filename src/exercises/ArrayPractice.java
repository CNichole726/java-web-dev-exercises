package exercises;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){
        int[] someNumbers = {1, 1, 2, 3, 5, 8};
        System.out.println("Odd numbers in the array are: ");

        for (int i = 0; i < someNumbers.length; i++){
            if(someNumbers[i] %2 != 0){
                System.out.println(someNumbers[i]);
            }
        }
        }
    }

