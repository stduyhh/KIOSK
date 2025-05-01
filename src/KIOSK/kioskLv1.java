package KIOSK;
import java.util.Scanner;

public class kioskLv1 {
    public static void main(String[] args) {
        //스캐너 인스턴스
        Scanner scanner = new Scanner(System.in);


        //반복문
        while(true) {
            //메뉴 표시
            System.out.println("1. 1955 Burger");
            System.out.println("2. McSpicy Burger");
            System.out.println("3. Shanghai Burger");
            System.out.println("4. Cheese Burger");
            System.out.println("메뉴 번호를 입력하세요.");
            int number = scanner.nextInt();

            if (number == 1) {
                System.out.println("1. 1955 Buger | W 7.2 | 토마토, 양상추, 치즈들어간 버거");                   // 1번 입력의 경우 1955Buber 출력
            } else if (number == 2) {
                System.out.println("2. McSpicy Buger | W 6.5 | 베이컨 들어간 매콤한버거");                     // 2번 입력의 경우 McSpicyBuber 출력
            } else if (number == 3) {
                System.out.println("3. Shanghai Buger | W 8.4 | 포테이토 번과 비프패티 들어간 버거");            // 3번 입력의 경우 ShanghaiBuber 출력
            } else if (number == 4) {
                System.out.println("4. Cheese Buger | W 5.8 | 치즈가 많이들어간 치즈버거");                    // 4번 입력의 경우 CheeseBuber 출력
            } else {
                System.out.println("잘못 입력했습니다. 번호를 다시 확인 해주세요!");
            }
            //루프 제어
            System.out.println("종료하겠습니까? (종료를 원하면 0을 입력해주세요. or 계속 진행하려면 1을 입력해주세요.)");
//            int passFail = scanner.nextInt();
            int fail = scanner.nextInt();
            if(fail == 0){                                                                                  // 0 입력 시 반복문 종료
               break;
            }
        }
    }
}