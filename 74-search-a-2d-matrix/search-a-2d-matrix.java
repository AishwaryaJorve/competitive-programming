class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // return bruteForce(matrix,target);
        return optimizeSolution(matrix,target);
    }

    public boolean optimizeSolution(int[][] matrix, int target){
        int low=0;
        int high=(matrix.length*matrix[0].length)-1;

        while(low<=high){
           int mid=(low+high)/2;

           int row=mid/matrix[0].length;
           int col=mid%matrix[0].length;

           if(matrix[row][col]==target) return true;
           else if(matrix[row][col]<target) 
                low=mid+1;
           else 
                high=mid-1;
        }

        return false;
    }    

    public boolean bruteForce(int[][] matrix, int target){
           for(int row=0;row<matrix.length;row++){
               for(int col=0;col<matrix[row].length;col++){
                   if(matrix[row][col]==target)
                      return true;
               }
           }
           return false;
    }
}