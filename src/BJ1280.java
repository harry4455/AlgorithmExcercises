/*
문제
1번부터 N번까지 번호가 매겨져 있는 N개의 나무가 있다. i번 나무는 좌표 X[i]에 심어질 것이다.

동호는 나무를 1번 나무부터 차례대로 좌표 X[i]에 심으려고 한다. 1번 나무를 심는 비용은 없고, 각각의 나무를 심는데 드는 비용은 현재 심어져있는 모든 나무 까지 거리의 합이다.
만약 3번 나무를 심는다면, 1번 나무와의 거리 + 2번 나무와의 거리가 3번 나무를 심는데 드는 비용이다.

2번 나무부터 N번 나무까지를 심는 비용의 곱을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 나무의 개수 N (2 ≤ N ≤ 200,000)이 주어진다. 둘째 줄부터 N개의 줄에 1번 나무의 좌표부터 차례대로 주어진다. 각각의 좌표는 200,000보다 작은 자연수 또는 0이다.

출력
문제의 정답을 1,000,000,007로 나눈 나머지를 출력한다.

예제 입력 1
5
3
4
5
6
7
예제 출력 1
180
 */
import java.util.Scanner;
// 코드는 돌아가는데 시간 초과 문제
public class BJ1280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int treenum = sc.nextInt();
        int[] arr = new int[treenum];
        int mul = 1;
        int totalsum = 0;

        for(int i=0; i<treenum; i++){
            int number = sc.nextInt();
            arr[i] = number;
        }

        for(int j=1; j<treenum; j++){
            int sum=0;
            for(int k=0; k<=j-1; k++){
                sum += (arr[j] - arr[k]);
            }
            mul *= sum;
        }
        System.out.println(mul);
    }
}

// 팬윅트리 활용해서 푸는게 포인트
