import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        System.out.println(front22(""));
    }


    public static String front22(String str) {
        if (str.length()< 2) {

            return str + str + str;
        } else {
            String srt1 = str.substring(0, 2);

            return srt1 + str + srt1;

        }
    }
}
