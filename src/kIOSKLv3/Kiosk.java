package kIOSKLv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    //속성
    public ArrayList<MenuItem> menuItems;
    Scanner scanner = new Scanner(System.in);

    //생성자
    public Kiosk(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    //기능
    //기본 메뉴 출력
    public void start() {
        do {
            System.out.println("[Starbucks}");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i + 1) + "." + menuItem.getName(i));
            }
            System.out.println("메뉴를 선택하세요: ");
            System.out.println("0번을 누르면 종료됩니다. | 계속 주문하려면 0을 제외한 숫자 입력해주세요.");
            int select = scanner.nextInt();
            if (select == 0) {
                break;
            }
            ;
            if (select == 1) {
                System.out.println(menuItems.get(select - 1).getName(select - 1) + " | " + menuItems.get(select - 1).getPrice(select - 1) + " | " + menuItems.get(select - 1).getInformation(select - 1));
            } else if (select == 2) {
                System.out.println(menuItems.get(select - 1).getName(select - 1) + " | " + menuItems.get(select - 1).getPrice(select - 1) + " | " + menuItems.get(select - 1).getInformation(select - 1));
            } else if (select == 3) {
                System.out.println(menuItems.get(select - 1).getName(select - 1) + " | " + menuItems.get(select - 1).getPrice(select - 1) + " | " + menuItems.get(select - 1).getInformation(select - 1));
            } else if (select == 4) {
                System.out.println(menuItems.get(select - 1).getName(select - 1) + " | " + menuItems.get(select - 1).getPrice(select - 1) + " | " + menuItems.get(select - 1).getInformation(select - 1));
            } else if (select == 5) {
                System.out.println(menuItems.get(select - 1).getName(select - 1) + " | " + menuItems.get(select - 1).getPrice(select - 1) + " | " + menuItems.get(select - 1).getInformation(select - 1));
            } else {
                System.out.println("입력 번호를 확인해주세요.");
            }
        } while (true);
    }
    public void close(){
        System.out.println("종료합니다.");
    }
}
