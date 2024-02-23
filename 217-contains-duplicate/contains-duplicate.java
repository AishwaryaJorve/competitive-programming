import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap();
        for(Integer num :nums){
            if(map.containsKey(num))
               return true;
            else
               map.put(num,1);   
        }
        return false;
    }
}