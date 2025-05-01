package kIOSKLv3;

public class MenuItem {
    //속성
    String name;
    double price;
    String information;

    //생성자
    public MenuItem(String name, double price, String information){
        this.name = name;
        this.price = price;
        this.information = information;
    }

    //기능

    public String getName(int x) {
        return name;
    }

    public double getPrice(int y) {
        return price;
    }

    public String getInformation(int z) {
        return information;
    }
}
