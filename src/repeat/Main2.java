package repeat;

public class Main2 {
    public static void main(String[] args) {

        //객체 생성
        Cafe cafe1 = new Cafe();
        Cafe cafe2 = new Cafe(15000, "latte", "orange juice", "strowberry cake");

        //기능 사용
        String name1 = cafe1.order("abc");
        System.out.println(name1);

        String order1 = cafe1.search(20000);
        System.out.println(order1);

        String juce1 = cafe1.juce("apple juice");
        System.out.println(juce1);

        String cake1 = cafe1.cakee("Cream Cake");
        System.out.println(cake1);

        String coffe2 = cafe1.setName("aaab");
        System.out.println(coffe2);

        String coffe3 = cafe1.getCoffe();
        System.out.println(coffe3);
    }
}
