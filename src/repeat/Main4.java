package repeat;

public class Main4 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Restaurant restaurant4 = new Restaurant("pasta", 20000, "tomato juice");

 //       String restaurant1 = restaurant.order("ramen");
 //       System.out.println(restaurant1);

        String restaurant2 = restaurant.eat("bibimbab");
        int order1 = restaurant4.price2();
        System.out.println(restaurant2);
        System.out.println(order1);

        String  price = restaurant.price(12312);
        System.out.println(price);

        String restaurant3 = restaurant.setOrder("김치볶음밥");
        System.out.println(restaurant3);

        int box = restaurant.getPrice();
        System.out.println(box);

        int price2 = restaurant4.getPrice();
        System.out.println(price2);
    }
}
