public class spiralCode {
    public static void spiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top metrix
            for(int i =0; i<= endCol ; i++){
            System.out.print(matrix[startRow][i]+" ");
        }
        //right matrix
        for(int j =startRow+1; j<= endRow ; j++){
            System.out.print(matrix[j][endCol]+" ");
        }
        //bottom matrix
        for(int i =endCol-1; i>=startCol ; i--){
            System.out.print(matrix[endRow][i]+" ");
        }
        for(int j =endRow-1; j>startRow ; j--){
            System.out.print(matrix[j][startCol]+" ");
        }
        startCol++;
        startRow++;
        endRow--;
        endCol--;


        }
        
        
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        spiral(matrix);
    }
}
