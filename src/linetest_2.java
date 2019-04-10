import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class linetest_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // string 입력
        // String [] array;
        char[] chs = str.toCharArray();
        char[] chs1 = new char[0];
        char[] chs2 = new char[0];
        char check;

       /* array = str.split("");
        for(int i = 0; i < array.length ; i++){
            System.out.println(i+"th word : "+array[i]);
        }*/

        if(str.equals("")){
            System.out.println("error");
        }

        for(int i=0; i < chs.length ; i++){
            check = chs[i];
            if( check < 48 || check >58){ //숫자가 아닌 경우
                chs1[i] = check;
            }else{ // 숫자일 경우
                chs2[i] = check;
            }
        }
        System.out.println(chs1);
        System.out.println(chs2);


    }
}
