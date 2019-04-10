import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] fib = new int[41][2];
        fib[0][0] = 1;
        fib[1][1] = 1;
        for (int i = 2; i < 41 ; i++){
            for(int j=0; j < 2 ; j++){
                fib[i][j] = fib[i-1][j] + fib[i-2][j];
            }
        }

        for(int i=0; i < num ; i++){
            int a = sc.nextInt();
            System.out.println(fib[a][0]+ " "+fib[a][1]);
        }
        sc.close();
    }
}
