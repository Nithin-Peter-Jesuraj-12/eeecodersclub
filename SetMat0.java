import java.util.Arrays;
class SetMat0{
    public void setZero(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int arrOfRow[]=new int[r];
        int arrOfCol[]=new int[c];
        Arrays.fill(arrOfRow,1);
        Arrays.fill(arrOfCol,1);
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(matrix[i][j]==0){
                    arrOfCol[j]=0;
                    arrOfRow[i]=0;
                }
            }
        }
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(arrOfRow[i]==0||arrOfCol[j]==0) matrix[i][j] = 0;
            }
        }
    }
}