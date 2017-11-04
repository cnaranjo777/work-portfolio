import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {9, 12, 6,};

        sort(array1, array2);
    }

    public static void sort(int[] array1, int[] array2) {

        int[] sorted = new int[array1.length + array2.length];
        int counter=0;
        for (int i = 0; i < array1.length; i++) {


            sorted[i] = array1[i];
            counter ++;
        }
      for(int j=0;j<array2.length;j++){

            sorted[counter++]=array2[j];
      }
      Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }
}
