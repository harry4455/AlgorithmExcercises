import java.util.Scanner;

public class linetest_1 {
    static int n=0,w=0,h=0,ans=0;
    static int [] sub = new int[10^13];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   //사각형 넓이

        cal(n); // 연산
    }

    public static void cal(int n) {


        for(int h=1; h < n; h++) {
            if ((n % h) != 0) {
                continue;
            } else {
                w = n / h;
               // System.out.println("w is " + w);
                w -= h;
                sub[h] = Math.abs(w);
                //System.out.println("h is " + h);

                //System.out.println(sub[h]);

                if(n == 1){
                    ans = sub[h];
                }else{
                    if(h ==1){
                        ans = sub[h];
                    }else if(h >= 2){
                        ans = Math.min(sub[h],ans);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
