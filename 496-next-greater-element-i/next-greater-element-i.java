import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Map<Integer,Integer> nextGretest=new HashMap();
      Stack<Integer> stack=new Stack();

    // Explination example nums2=[6,5,4,3,2,1,7]
      for(int i=0;i<nums2.length;i++){
        // Used while because stack is [1,2,3,4,5,6] and now num2[i] is 7 so it should pop every element from stack and for all 
        // next greaterElement is 7 
        while(!stack.isEmpty() && stack.peek()<nums2[i]){    
            nextGretest.put(stack.pop(),nums2[i]);
        }

        stack.push(nums2[i]);
      }

      for(int i=0;i<nums1.length;i++){
        nums1[i]=nextGretest.getOrDefault(nums1[i],-1);
      }

      return nums1;
    }
}
