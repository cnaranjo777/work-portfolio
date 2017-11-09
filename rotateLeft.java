import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] num1=new int[]{1,2,3};
        System.out.println(rotateLeft3(num1));
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] nums2=new int [3];
        //shits elements of the array left 
        nums2[0]=nums[1];
        nums2[1]=nums[2];
        nums2[2]=nums[0];
       return nums2;
        }



    }
