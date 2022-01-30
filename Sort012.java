class Sort012 {
    public void sortColors(int[] nums) {
        int least = 0,middle = 0,highest = nums.length-1;
        while(middle<=highest){
            switch(nums[middle]){
                case 0:{
                    int temp = nums[least];
                    nums[least] = nums[middle];
                    nums[middle] = temp;
                    least++;
                    middle++;
                    break;
                }
                case 1:{
                    middle++;
                    break;
                }
                case 2:{
                    int temp = nums[highest];
                    nums[highest] = nums[middle];
                    nums[middle ] = temp;
                    highest--;
                    break;
                }
            }
        }
    }
}