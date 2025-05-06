package repeat;

public class Character {
    // 속성 = 변수로 표현할 수 있다.
    // 이름 "Steve", "John"
    // int: 정수(숫자)
    // String: 문자열
    // boolean: 논리(true, false)
    private String name;
    private int age;
    private boolean isAdult;

    // 생성자 - 조립설명서
    // 1. 클래스 이름과 동일하다.
    // 2. 반환 데이터 타입이 존재하지 않는다.
    // 3. 여러개 존재할 수 있다.
    // 기본생성자
    public Character() {
    }

    public Character(String name, int age, boolean isAdult) {
        if (name.equals("볼트모트")) {
            System.out.println("생성이 불가능합니다..");

        } else {
            this.name = name;
            this.age = age;
            this.isAdult = isAdult;
        }
        // 접근할 수 있는 변수의 개수는 몇개?
    }

    // 기능 - method
    public void dance() {
        String name = this.name;
        System.out.println(name + "이 춤을 춥니다.");
    }

    // 사냥
    public String hunt(String target) {
        return target + "을 사냥합니다.";
    }

    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    // 세터(setter) 활용
    public void setName(String name) {
        // 접근 제어 로직 넣어 줄 수 있다.
        if (name.equals("볼트모트")) {
            System.out.println("설정 불가");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    // 게터(getter)
    // 이름 조회하는 기능
    public String getName() {
        return this.name;
    }

}
