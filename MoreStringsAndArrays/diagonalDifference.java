import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = new int[N][N];
        int primarySum=0;
        int secondarySum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                mat[i][j] = sc.nextInt();
                if(i==j){ // left diagonal
                    primarySum+=mat[i][j];
                }
                if(i+j==N-1){ // right diagonal
                    secondarySum+=mat[i][j];
                }
            }
        }
        System.out.println(Math.abs(primarySum - secondarySum));

    }
}