package KIOSKLv2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //메뉴 배열
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("0. bibimbab", 8000, "한국 음식 비빔밥."));
        items.add(new MenuItem("1. jajangmun", 9000, "자장면."));
        items.add(new MenuItem("2. hamburger", 7000, "햄버거."));
        items.add(new MenuItem("3. noodle", 6000, "라면."));

        System.out.println();



        do {
            // 메뉴 사용자에게 제공 (반복문으로 배열 표시)
            System.out.println("[Food Menu]");
            for(MenuItem menus : items){
                System.out.println(menus.getName());
            }

            //스캐너 인스턴스 생성
            Scanner scanner = new Scanner(System.in);


            //주문번호 입력 받기.
            System.out.println("주문하려는 메뉴 번호를 입력하세요.");
            int number = scanner.nextInt();
            MenuItem menuNumber = items.get(number);

                if (number == 0) {
                    System.out.println(menuNumber.getName() + " " + menuNumber.getPrice() + "원 " + menuNumber.getExplain());
                } else if (number == 1) {
                    System.out.println(menuNumber.getName() + " " + menuNumber.getPrice() + "원 " + menuNumber.getExplain());
                } else if (number == 2) {
                    System.out.println(menuNumber.getName() + " " + menuNumber.getPrice() + "원 " + menuNumber.getExplain());
                } else {
                    System.out.println(menuNumber.getName() + " " + menuNumber.getPrice() + "원 " + menuNumber.getExplain());
                }
                System.out.println("종료하려면 exit를 입력하세요.");
                 String ex = scanner.next();
                if (ex.equals("exit")){
                    break;
                }
        } while (true);
    }
}

