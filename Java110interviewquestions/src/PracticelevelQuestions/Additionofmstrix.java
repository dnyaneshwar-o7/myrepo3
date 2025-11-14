package PracticelevelQuestions;

public class Additionofmstrix {


        public static void main(String[] args) {
            int[][] a = {
                    {1, 2},
                    {3, 4}
            };

            int[][] b = {
                    {5, 6},
                    {7, 8}
            };

            int rows = a.length;
            int cols = a[0].length;

            int[][] sum = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("Matrix Addition:");
            printMatrix(sum);
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

