/*
문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

예제 입력 1
3
happy
new
year
예제 출력 1
3
예제 입력 2
4
aba
abab
abcabc
a
예제 출력 2
1
 */

import java.util.Scanner;

public class BJ1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        for(int i=0; i<number; i++){
            String word = sc.next(); // 단어 입력
            boolean[] checker = new boolean[26];    // a부터 z까지 boolean 배열 생성, 초기값 false로 생성.
            for(int j=1; j<word.length();j++) {
                if (word.charAt(j - 1) != word.charAt(j)) { // 앞뒤로 다른 알파벳이 등장하는 경우
                    if (checker[word.charAt(j) - 97] == true) { // 현재 문자가 이전에 나온적이 있다면
                        count++;
                        break;
                    } else {    // 이전 문자가 쓰여졌음으로 true로 변경
                        checker[word.charAt(j-1) - 97] = true;
                    }
                }
            }
        }
        System.out.println(number - count);
    }
}
