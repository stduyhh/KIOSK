package chapter1.operator.array;

import java.awt.desktop.AboutEvent;

public class quiz {
    public static void main(String[] args) {

        // 짝수 배열 출력하기
//        int[] arr = {3, 4, 7, 10, 15, 20};
//
//        for (int a: arr) {
//            if (a % 2 == 0) {
//                System.out.println("짝수: " + a);
//            }
//        }
        // 1차원 배열 누적합 계산
//        int sum;
//        sum = 0;
//        int[] arr = {2, 5, 8};
//        for (int a : arr ){
//            sum += a;
//        }
//        System.out.println("누적합: " + sum);

        //2차원 배열 좌표(x, y) 찾기
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int i=0; i<board.length; i++){
            for (int j=0; j < board[i].length; j++){
                System.out.println("검은돌(●) 위치: " + "("+i +", "+ j+")");
            }
        }

    }
}
