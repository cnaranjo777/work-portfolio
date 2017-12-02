 public int centeredAverage(int[] nums) {
        int total = 0;
        int counter=0;
        int average=0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length-1; i++) {
            total +=nums[i];
            counter++;
            average=total/counter;

        }
        return average;
    }
