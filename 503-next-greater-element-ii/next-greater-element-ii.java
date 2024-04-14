class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int length=nums.length*2;
        Stack<Integer> stack=new Stack();
        int[] resArray=new int[nums.length];
        Arrays.fill(resArray, -1);
        for(int i=0;i<length;i++){
            int num=nums[(i%nums.length)];
            
            while(!stack.isEmpty() && nums[stack.peek()]<num){
                 resArray[stack.pop()]=num;
            }

            if(i<nums.length)
            stack.push(i);
        }
        return resArray;
    }
}