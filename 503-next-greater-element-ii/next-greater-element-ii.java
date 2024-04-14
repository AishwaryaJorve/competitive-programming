class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int length=nums.length*2;
        Stack<Integer> stack=new Stack();
        int[] resArray=new int[nums.length];
        Arrays.fill(resArray, -1);
        //Example [1,2,3,4,3]
        for(int i=0;i<length-1;i++){
            int num=nums[(i%nums.length)];   
            // In above line  0%5= 5 zeroja zero so remider 0 / 1%5 5 zeroja zero reminder (1-0=1) / 2%5 5 zeroja zero reminder (2-0=2)....
            // 5%5 = 0 / 6%5 = 5 oneja 5 (6-5=1) / 7%5 = 5 oneja 5 (7-5=2) .... This is how we can iterate array twise 
            while(!stack.isEmpty() && nums[stack.peek()]<num){
                 resArray[stack.pop()]=num;
            }

            if(i<nums.length)
            stack.push(i);
        }
        return resArray;
    }
}