package KIOSKLv2;

public class MenuItem {

    //속성
    String name;
    int price;
    String explain;

    //생성자
    public MenuItem(String name, int price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    //메뉴 이름 가져오기
    public String getName() {
        return name;
    }

    // 가격 가져오기
    public int getPrice() {
        return price;
    }

    // 설명 가져오기
    public String getExplain() {
        return explain;
    }
}
