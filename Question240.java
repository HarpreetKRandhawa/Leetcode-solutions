public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length <= 0 || matrix[0].length <= 0)
            return false;
        int row = 0;
        int col = matrix[0].length - 1;
        while(col >= 0 && row < matrix.length){
            if(target == matrix[row][col])
                return true;
            else if(target < matrix[row][col])
                col--;
            else if(target >matrix[row][col])
                row++;
        }
        return false;
    }
}
