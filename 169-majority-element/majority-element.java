class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap();

        for(int num : nums){
            if(!map.containsKey(num))
               map.put(Integer.valueOf(num),1);
            else
               map.put(Integer.valueOf(num),map.get(num)+1);
        }

        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        int max=0;
        int key=0;

        for(Map.Entry<Integer,Integer> entry : entrySet){
            if(entry.getValue()>max){
                max=entry.getValue();
                key=entry.getKey();
            }
        }

        return key;

    }
}