package chapter2.clazz;

public class Person {

    //속성 - 변수 선언
    String name;
    int age;
    String adress;

    //생성자
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //기능
    int sum(int value1, int value2){
        int result = value1 + value2;
        return result;
    }

    //게터
    String getName(){
        return this.name;
    }

    //세터
    void setAdress(String adress){
        this.adress = adress;
    }
}
