class DupNo {
    public int findDuplicate(int[] nums) {
        int low = nums[0], high=nums[0];
        do{
            low=nums[low];
            high=nums[nums[high]];
        }while(low!=high);
        high=nums[0];
        while(high!=low){
            low=nums[low];
            high=nums[high];
        }
        return low;
    }
}