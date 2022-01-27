public class MaxSubArray{
    public int maxSubArray(int[] nums) {
        int i,max,total=0;
        max=nums[0];
        for(i=0;i<nums.length;i++){
            total+=nums[i];
            if(total>max) max=total;
            if(total<0) total=0;
        }
        return max;
    }
}