package Array;

public class multidimesnionArray {
    public static  void main(String []args){
        //declaration
        int [][] matrix;

        //initialization
        matrix = new int[3][3]; //3x3 matrix

        //combined declaration and initialization
        int[][] matrix1 ={
                {1,2,3},
                {4,5,6},
                { 7,8,9}};


        //accessgin elements
        int firstelement = matrix1[0][0];
        System.out.print(firstelement);

        //iteratin through elements
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                System.out.print(matrix1[i][j]);
            }
        }
    }
}
