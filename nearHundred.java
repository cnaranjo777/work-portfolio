public class Main {

    public static void main(String[] args) {

        System.out.println(nearHundred(190));

    }


    public static  boolean nearHundred(int n) {
          int x=Math.abs(n-100);
          int y=Math.abs(n-200);
        if(x<=10){
            return true;
        }
        else if (y<=10){
            return true;
        }
        else{
            return false;
        }
    }
}
