package hash;

import java.util.HashSet;
import java.util.Scanner;

public class hashSetEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution2(arr, target));
    }

    // solution 메서드 생성 후 구현
    public static boolean solution1(int[] arr, int target){
        boolean a = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    a = true;
                    break;
                }
            }
        }
        return a;
    }

    public static boolean solution2(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(target-i) && target-i != i){
                return true;
            }
            set.add(i);
        }
        return false;
    }


    /*
        문제 - 두 개의 수로 특정값 만들기

        n개의 양의 정수로 이루어진 배열 arr와 정수 target이 주어졌을 때 이 중에서 합이 target인 두 수가 arr에 있는지 찾고, 있으면 true, 없으면 false를 반환하는 solution()함수를 작성해 보자.
        제약 조건

        n은 2 이상 10,000 이하의 자연수이다.
        arr의 각 원소는 1 이상 10,000 이하의 자연수이다.
        arr의 원소 중 중복되는 원소는 없다.
        target은 1 이상 20,000 이하의 자연수이다.

        입력
        5
        1 2 3 4 8
        6

        결과 true

        입력
        2 3 5 9
        10

        결과 false
     */
}
