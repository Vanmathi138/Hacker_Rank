package Algorithms;
import java.util.*;
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scan.nextInt();

        System.out.print("Enter the number of columns: ");
        int column =scan.nextInt();

        int[][] matrix = new int[row][column];
        System.out.println("Enter the matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Elements ["+i+"]["+j+"]: ");
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int result = diagonalDifference(matrix);
        System.out.println("The Diagonal Difference is: "+result);
        scan.close();
    }

    private static int diagonalDifference(int[][] matrix) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j){
                    leftSum+=matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    rightSum+=matrix[i][j];
                }
            }
        }
        int diff = Math.abs(leftSum-rightSum);
        return diff;
    }
}
