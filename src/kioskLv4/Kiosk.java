    package kioskLv4;


    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Kiosk{
        ArrayList<MenuItem> drinkMenu;
        ArrayList<MenuItem> desertMenu;
        ArrayList<MenuItem> sandwichMenu;

        Menu drinkMenus = new Menu("1. 음료 메뉴");
        Menu desertMenus = new Menu("2. 디저트 메뉴");
        Menu sandwichMenus = new Menu("3. 샌드위치 메뉴");

        public Kiosk(Menu drinkMenus, Menu desertMenus, Menu sandwichMenus){
            this.drinkMenus = drinkMenus;
            this.desertMenus = desertMenus;
            this.sandwichMenus = sandwichMenus;
        }

        public Kiosk() {
            drinkMenu = new ArrayList<>();
            desertMenu = new ArrayList<>();
            sandwichMenu = new ArrayList<>();

            // drink메뉴
            drinkMenu.add(new MenuItem("IceAmericano", 5.5, "시원한 아메리카노"));
            drinkMenu.add(new MenuItem("IceLatte", 6.5, "아이스라떼"));
            drinkMenu.add(new MenuItem("CaramelMacchiato", 7.5, "캬라멜마끼야또"));
            drinkMenu.add(new MenuItem("VanillaCreamDolceLatte", 8.0, "바닐라크림돌체라떼"));

            // desert 메뉴
            desertMenu.add(new MenuItem("StrawberryCake", 6.7, "딸기 케이크"));
            desertMenu.add(new MenuItem("ChocolateCake", 7.4, "초코 케이크"));
            desertMenu.add(new MenuItem("IceCreamCake", 9.2, "아이스크림 케이크"));
            desertMenu.add(new MenuItem("SweetPotatoCake", 10.6, "고구마 케이크"));

            // sandwich 메뉴
            sandwichMenu.add(new MenuItem("EggMayoSandwich", 5.2, "부드러운 달걀과 고소한 마요네즈가 만나 더 부드러운 스테디셀러"));
            sandwichMenu.add(new MenuItem("B.L.T.Sandwich", 7.9, "오리지널 아메리칸 스타일 베이컨의 풍미와 바삭함 그대로~"));
            sandwichMenu.add(new MenuItem("TunaSandwich", 6.7, "남녀노소 누구나 좋아하는 담백한 참치와 고소한 마요네즈의 완벽한 조화"));
            sandwichMenu.add(new MenuItem("HamSandwich", 7.2, "풍부한 햄이 만들어내는 담백함을 입 안 가득 즐겨보세요!"));
        }


        Scanner scanner = new Scanner(System.in);

        public void start (){
            System.out.println("=======메뉴 카테고리 선택=======");
            System.out.println(drinkMenus.name);
            System.out.println(desertMenus.name);
            System.out.println(sandwichMenus.name);
            System.out.println("메뉴 카테고리 선택: ");
            int select = scanner.nextInt();

            if (select == 1){
                System.out.println("음료 메뉴표");
                for (int i = 0; i < drinkMenu.size(); i++){
                    MenuItem menuItem = drinkMenu.get(i);
                    System.out.println((i+1) + ". " + menuItem.menu + " | " + menuItem.price + " | " + menuItem.information);
                }
            } else if (select == 2) {
                System.out.println("디저트 메뉴");
                for (int i = 0; i < desertMenu.size(); i++){
                    MenuItem menuItem = desertMenu.get(i);
                    System.out.println((i+1) + ". " + menuItem.menu + " | " + menuItem.price + " | " + menuItem.information);
                }

            } else if (select == 3) {
                for (int i = 0; i < sandwichMenu.size(); i++) {
                    MenuItem menuItem = sandwichMenu.get(i);
                    System.out.println((i + 1) + ". " + menuItem.menu + " | " + menuItem.price + " | " + menuItem.information);
                }
            }
        }
     }