 public static int[] withoutTen(int[] nums) {
        int count10 = 0;          //index for the beginning of the array 
        int countO = nums.length - 1;//index to fill the end of the array 
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                array[countO] = 0;
                countO--;
            }else{
                array[count10]=nums[i];
                count10++;
            }
        }
        return array;

    }
