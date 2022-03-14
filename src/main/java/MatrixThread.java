
public class MatrixThread {
	
	private static final int THREADS = 4;

    public static void multi(int[][]matrix1, int[][]matrix2){
        Thread[] threads = new Thread[THREADS];
        int p = (int) matrix1.length / THREADS;
        int[][] matrixResult = new int[matrix1.length][matrix2[0].length];

        for(int i=0; i < THREADS; i++){
            threads[i] = new MultiplicationThread(matrix1, matrix2, matrixResult,p * i, p * (i + 1));
            threads[i].start();
        }
        for (Thread thread : threads){
            try{
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
