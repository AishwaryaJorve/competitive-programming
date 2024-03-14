class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int j=0;
        int count=0;

        if(nums.length==0)
        return 0;

        for(int i=1;i<nums.length;i++){

            if(nums[j]==nums[i])
             count++;

            if(i==nums.length-1 && j<nums.length-1){
                j++;
                i=j;
            }  
        }

        return count;
    }
}