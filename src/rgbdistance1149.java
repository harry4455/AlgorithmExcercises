import java.util.Scanner;

public class rgbdistance1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] lcost = new int[num][3];

        lcost[0][0] = sc.nextInt();
        lcost[0][1] = sc.nextInt();
        lcost[0][2] = sc.nextInt();

        for(int i=1; i < num; i++){
            int r,g,b;
            r = sc.nextInt();
            g = sc.nextInt();
            b = sc.nextInt();

            lcost[i][0] = r + Math.min(lcost[i-1][1], lcost[i-1][2]);
            lcost[i][1] = g + Math.min(lcost[i-1][0], lcost[i-1][2]);
            lcost[i][2] = b + Math.min(lcost[i-1][0], lcost[i-1][1]);
        }
        System.out.println(Math.min(lcost[num-1][0],Math.min(lcost[num-1][1],lcost[num-1][2])));
        sc.close();
    }
}
