package repeat;

public class Restaurant {

    //속성
    String menu;
    int price;
    String drink;

    //생성자
    public Restaurant(){

    }

    public Restaurant(String menu, int price, String drink){
        this.menu = menu;
        this.price = price;
        this.drink  = drink;
    }

    //기능
    private String  order(String menu){
        return menu + "을/를 주문할게요.";
    }

    String eat(String menu){
        return menu + "을/를 먹을게요.";
    }

    String price(int price){
         return price + "원 입니다.";
    }
    int price2(){
        return this.price;
    }

    //세터 기능
    String setOrder(String menu){
        return menu + "을/를 다시 주문할게요.";
    }

    //게터 기능
    int getPrice(){
       return this.price;
    }
}
