public class Main {
//1351. Count Negative Numbers in a Sorted Matrix
    public static void main(String[] args) {


    }
    public static int numOfNegatives(int[][] matrix){
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
