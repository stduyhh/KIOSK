package kIOSKLv3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Dolce Cold Brew", 7.5, "동남아 휴가지에서 즐기는 커피를 떠오르게 하는 스타벅스 음료의 베스트 x 베스트 조합인 돌체 콜드 브루를 만나보세요!"));
        menuItems.add(new MenuItem("Oat Cold Brew", 8.5, "콜드 브루의 풍미와 깔끔한 오트음료(식물성 대체유)가 어우러진 달콤 고소한 라떼."));
        menuItems.add(new MenuItem("Iced Caffe Americano", 4.5, "진한 에스프레소에 시원한 정수물과 얼음을 더하여 스타벅스의 깔끔하고 강렬한 에스프레소를 가장 부드럽고 시원하게 즐길 수 있는 커피"));
        menuItems.add(new MenuItem("Strawberry Yogurt", 3.5, "상큼 달콤 딸기 과육이 한가득 씹히는 마시는 요거트 음료"));
        menuItems.add(new MenuItem("Sea Salt Caramel Cold Brew", 6.5, "구름 처럼 부드러운 씨솔트 폼과 번트 카라멜의 중독성 강한 단짠단짠 조합의 콜드 브루 한번 맛보면 자꾸 생각나는 매력적인 음료"));

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
        kiosk.close();
    }
}
