import java.util.Arrays;
class Solution {
    public String triangleType(int[] nums) {
        
        int[] ans=new int[nums.length];
        
        ans[0]=nums[0] + nums[1];
        ans[1]=nums[0] + nums[2];
        ans[2]=nums[1] + nums[2];
        
        int length=2;

        for(int i=0;i<ans.length;i++){
            if(ans[i]>nums[length]) {
                length--;
            }
            else
                return "none";
        }
        
        int[] compare=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
            compare[i]=count;
        }
        
        Arrays.sort(compare);
        
        if(compare[compare.length-1]==2)
            return "equilateral";
        else if(compare[compare.length-1]==1)
            return "isosceles";
        else
            return "scalene";
    }
}