class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] resultArray=new int[2];

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
               resultArray[0]=i;
               resultArray[1]=j;
               return resultArray;
            }
            }
        }

        return resultArray;
    }
}