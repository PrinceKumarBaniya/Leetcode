class Solution {
    static void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        if(k>size){
            k=k%size;
        }
        if(k<0){
            k=k+size;
        }
        reverse(nums,0,size-k-1);
        reverse(nums,size-k,size-1);
        reverse(nums,0,size-1);
    }
}
