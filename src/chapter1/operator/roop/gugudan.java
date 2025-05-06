package chapter1.operator.roop;
import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);

// //        System.out.println("출력할 구구단 단수를 입력하세요.(2~9): ");
//       int dan = scanner.nextInt();
//
//        // 2~9 사이 숫자인지 확인
//        if (dan < 2 || 9 < dan){
//            System.out.println("2에서 9사이의 수자를 입력하세요.");
//        } else {
//            System.out.println("==========="+dan+"단============");
//            for (int i=1; i<10; i++){
//                System.out.println(dan+"x"+i+"="+dan*i);
//            }
//        }

        //중첩 for문 구구단
        for (int dan=2; dan<10; dan++){
            System.out.println("==========="+dan+"단=============");
            for (int i=1; i<10; i++){
                System.out.println(dan+"x"+i+"="+dan*i);
            }
        }

    }
}
