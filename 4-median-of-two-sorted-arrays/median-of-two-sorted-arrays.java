class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length==0 && nums2.length==0) return 0.0;
        
        int[] merged=new int[nums1.length+nums2.length];
        double result=0.0;
        int i = 0;
        int j = 0; 
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        
        int mid=merged.length/2;
        if(merged.length%2==0){
        result=merged[mid]+merged[mid-1];
        result=result/2;
        }else {
            result=merged[mid];
        }

        return result;
    }
}