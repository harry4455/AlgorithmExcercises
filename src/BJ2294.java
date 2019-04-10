import java.util.Scanner;

public class BJ2294 {
    static int n,k;
    static int coin[], sum[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 동전 종류
        k = sc.nextInt(); // 동전의 합

        coin = new int[n+1];
        sum = new int[k+1];

        for (int i=0; i<n; i++){
           coin[i] = sc.nextInt();
        }

        dp();
    }

    public static void dp() {
        for(int i=0; i<n; i++){
            int cur = coin[i]; // 현재 동전

            for(int j=cur; j<=k; j++){
                if(j == cur) {
                    sum[j] = 1;
                    continue;
                }

                if((sum[j] == 0 || sum[j] >= sum[j-cur]+1) && sum[j-cur] !=0){
                    sum[j] = sum[j-cur] + 1;
                }
            }
        }
        System.out.println(sum[k] == 0 ? -1 : sum[k]);
    }
}
