import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        System.out.println(startHi(""));
    }
    public static boolean startHi(String str) {
        if(str.length()<=1){
            return false;
        }

        else if (str.substring(0,2).equals("hi")){
            return true;
        }
        else{
            return false;
        }
    }




}
