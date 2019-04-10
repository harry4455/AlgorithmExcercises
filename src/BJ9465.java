/*
import java.util.Scanner;

public class BJ9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        int num = sc.nextInt();
        int [][] arr = new int[2][num];

        for(int i=0;i<2;i++){
            for(int j=0; j<num; j++){

            }
        }
    }
}
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9465{
    static long [][] D;
    static long [][] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            A = new long[2][n+1];
            String[] datas = br.readLine().split(" ");
            String[] datas2 = br.readLine().split(" ");
            for (int k=0; k<n; k++){
                A[0][k] = Long.parseLong(datas[k]);
                A[1][k] = Long.parseLong(datas2[k]);
            }
            System.out.println(bottomUp(n));
        }
    }

    public static long bottomUp(int n) {

        long[][] d = new long[3][n+1];
        for(int i=1; i<=n; i++){
            d[0][i] = Math.max(d[0][i-1], Math.max(d[i][i-1], d[2][i-1]));
            d[1][i] = Math.max(d[0][i-1], d[2][i-1]) + A[0][i-1];
            d[2][i] = Math.max(d[0][i-1], d[1][i-1]) + A[1][i-1];
        }
        long ans = 0;
        ans = Math.max(d[0][n], Math.max(d[1][n], d[2][n]));

        return ans;
    }
}
