package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNums {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(8);
        nums.add(10);
        nums.add(13);
        nums.add(18);
        nums.add(21);
        nums.add(40);
        nums.add(42);
    }
        public static int sumEven(ArrayList<Integer> nums){
            int sum = 0;
            for (int integer : nums) {
                if (integer % 2 == 0){
                    sum += integer;
                }
            }
            return sum;
            System.out.println(sumEven);
        }
}
