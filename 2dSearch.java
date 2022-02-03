class 2dSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int min = 0;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int max = (n * m) - 1;
        
        while(min <= max) {
            int mid = (min + (max - min) / 2);
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }
        return false;
    }
}