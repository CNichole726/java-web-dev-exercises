package exercises;

public class StringMethods {
    public static void main(String[] args){
        String fox = "I would not, could " +
                "not, in a box. I would not, could not with a " +
                "fox. I will not eat them in a house. I will not " +
                "eat them with a mouse.";

        String[] eachWord = fox.split("\\.");
        System.out.println(java.util.Arrays.toString(eachWord));
    }

}
