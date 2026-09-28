class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int n = nums.length;
        for(int val:nums){
            if(val!=0){
                nums[count]=val;
                count++;

            }
        }
        while(count<n){
            nums[count++]=0;
        }
        
    }
}