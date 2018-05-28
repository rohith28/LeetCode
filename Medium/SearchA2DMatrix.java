class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length ; 
        
        if(m == 0){
            
            return false;
        }
        int n = matrix[0].length;
        
        
        for(int i=0;i<m;i++){
            for(int j=n-1; j >= 0; j--){
                
                if(matrix[i][j] == target)
                    return true;
                else if(matrix[i][j] < target)
                    break;
                
            }
        }
        
        return false;
        
        
    }
}