public int[] zeroFront(int[] nums) {
     int count10 = 0;     //counter for the beginning of the array 
        int countO = nums.length - 1;//counter for the end of the array
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {                       // if the number is 0 put it in the front of the array
                array[count10] = 0;               
                count10++;
            }else{
                array[countO]=nums[i];               //if not fill in the end of the array 
                countO--;
            }
        }
        return array;
}
