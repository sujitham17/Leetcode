class Solution {
   
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i< matrix.length;i++){
            int s=0, e=matrix[i].length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(matrix[i][mid]==target){
                    return true;
                }
                else if(matrix[i][mid]>target){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return false;
}
}