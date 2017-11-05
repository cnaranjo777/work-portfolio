import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[]numbers={9,2,6};
        System.out.println(firstLast6(numbers));
    }
    public static boolean firstLast6(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[0]==6){
                return true;
            }
            if(nums[nums.length-1]==6) {
                return true;
            }
        }
        return false;
    }

}
