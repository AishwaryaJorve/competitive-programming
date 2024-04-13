import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Map<Integer,Integer> nextGretest=new HashMap();
      Stack<Integer> stack=new Stack();

      for(int i=0;i<nums2.length;i++){
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
