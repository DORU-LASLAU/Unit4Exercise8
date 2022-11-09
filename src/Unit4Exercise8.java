public class Unit4Exercise8 {
    public static void main(String[] args) {
        int [][] matrix = new int[10][10];

        for (int i=0;i<matrix.length;i++) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j]=0;
            }
        }
        matrix[0][4]=1;
        matrix[2][6]=1;
        matrix[3][1]=1;
        matrix[8][6]=1;

        for (int i=0;i<matrix.length;i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
