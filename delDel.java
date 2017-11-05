
public class Main {


    public static void main(String[] args) {
        int[]numbers={9,2,6};
        System.out.println(delDel(""));
    }
    public static String delDel(String str) {
        if(str.length()<=3){
            //Check if the string is 3 words or less
            return str;
        }
        else  if(str.substring(1,4).equals("del")){
            //checks if the word contains the substring "del"
            char ch=str.charAt(0);
            //takes the first letter of the word
            String str2=str.substring(4,str.length());
            //takes the remaining word after "del"

            return ch+str2;
            //returns first character plus the rest of the word - "del"
        }
        return str;
    }

}
