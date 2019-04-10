import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ2844 {
    static int n,q;
    static int [] d;
    static List<Object> input = new ArrayList<Object>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        n = sc.nextInt();
        q = sc.nextInt();
        d = new int[n];
        for(int i=0; i<n; i++){
            d[i] = sc.nextInt();
        }
        change(d);
    }

    public static void change(int [] d) {
        for(int i=0; i<input.size(); i++){
            int cal = sc.nextInt();
            input.add(cal);
        }

    }
}
