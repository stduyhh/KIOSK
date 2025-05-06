package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person("hhmin", 23);
        Person personB = new Person("Steve", 22);

//        System.out.println("설정 전 이름: " + personA.name);
//        System.out.println("설정 전 이름: " + personB.name);
//        personA.name = "hhmin";
//        personB.name = "Steve";
//        System.out.println("설정 전 이름: " + personA.name);
//        System.out.println("설정 전 이름: " + personB.name);
        int result1 = personA.sum(1,2);
        int result2 = personB.sum(3,4);
        System.out.println("personA = " + result1);
        System.out.println("personB = " + result2);
        
        String name = personB.getName();
        System.out.println("name = " + name);

        //세터 활용
        System.out.println("personA의 주소: " + personA.adress);
        personA.setAdress("서울");
        System.out.println("personA의 주소: " + personA.adress);
    }
}
