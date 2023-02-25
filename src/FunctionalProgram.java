import java.util.Scanner;

public class FunctionalProgram {
    public static void print(int[][] arr, int M, int N){
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows -");
        int M = input.nextInt();
        System.out.println("Please enter number of columns -");
        int N = input.nextInt();
        int[][] arr=new int[M][N];

        System.out.println("Enter numbers");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j]=input.nextInt();
            }
        }
        print(arr, M, N);
    }
}
