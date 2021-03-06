
public class MultiplicationThread extends Thread {
	private int[][] matrix1;
    private int[][] matrix2;
    private int[][] matrixOutput;
    private int begin;
    private int end;

    public MultiplicationThread(int[][] matrix1, int[][] matrix2, int[][] matrixOutput, int begin, int end) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.matrixOutput = matrixOutput;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run(){
        for (int i = begin; i < end; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrixOutput[i][j] = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    matrixOutput[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
 
    }

}
