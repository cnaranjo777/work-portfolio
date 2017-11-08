import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] num1=new int[]{3,2,2};
        System.out.println(sum3(num1));
    }

    public static int sum3(int[] nums) {
        int sum=0;
        //set counter 
        for(int i=0;i<nums.length;i++){
           //add elements of the arrays and puts them into sum
            sum+=nums[i];
        }
        return sum;

    }



}
