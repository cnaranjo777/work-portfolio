import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(mixStart("ni"));
    }

    public static boolean mixStart(String str) {
        //checks if word is more less than 3 words and if the word contains "ix" 
        if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
            
            return true;
        }
        return false;
    }
}
