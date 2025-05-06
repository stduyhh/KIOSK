package chapter1.operator.Car;

public class Car {

    String name ;
    String carName;

    Car(String name, String carName){
        this.name = name;
        this.carName = carName;
    }

    public  void drive(){
        System.out.println("["+this.carName+"] 을 주행합니다.");
    }
}
