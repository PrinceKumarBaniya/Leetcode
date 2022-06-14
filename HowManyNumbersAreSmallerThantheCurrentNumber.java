class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size=nums.length;
        int count=0;
        int[] ans= new int[size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}
