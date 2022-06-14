class Solution {
    public void sortColors(int[] nums) {
        int count=0;
        int count1=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=1;
                count++;
            }
            if(nums[i]==1){
                nums[i]=2;
                count1++;
            }
        }
        for(i=0;i<count;i++){
            nums[i]=0;
        }
        for(i=count;i<count1;i++){
            nums[i]=1;
        }
    }
}
