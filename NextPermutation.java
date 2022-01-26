public class NextPermutation {
        public void nextPermutation(int[] nums) {
            int len=nums.length;
            if(len<=1||nums==null) return;
            int begin,finish;
            for(begin=len-2;begin>=0;begin--){
                if(nums[begin]<nums[begin+1]) break;
            }
            if(begin>=0){
                for(finish=len-1;finish>=0;finish--){
                    if(nums[finish]>nums[begin]) break;
                }
                swap(nums,begin,finish);
            }
            rev(nums,begin+1,len-1);
        }
        public void swap(int nums[],int start,int end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
        }
        public void rev(int nums[],int a,int b){
            for(int c=a;c<=b;c++){
                for(int d=c+1;d<=b;d++){
                    if(nums[c]>nums[d]) swap(nums,c,d);
            }
        }
    }
}