class Solution {
    public int findNumbers(int[] nums) {
        int ans =0;
        for(int num:nums){
            int count =0;
            int n=num;
           
            while(n!=0){
                n=n/10;
                count++;
            }
            if(count % 2==0){
                ans++;
            }
        }
        return ans;
        
    }
}