package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phrase: ");

        String inputStr = input.nextLine().toLowerCase();
        String noCharSentence = remove(inputStr);

        char[] charInString = noCharSentence.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char letter : charInString) {
            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter) +1);
            } else {
                charCount.put(letter, 1);
            }
        }

        for(Map.Entry<Character, Integer> printChar : charCount.entrySet()){
            System.out.println(printChar.getKey() + " : " + printChar.getValue());
        }
        System.out.println(remove(inputStr));
    }

    public static String remove(String inputStr){
        inputStr = inputStr.replaceAll("[^a-zA-Z0-9]", "");
        return inputStr;
    }
}
