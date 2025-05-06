package repeat;

public class Main1 {    // 속성

    // 생성자

    // 기능
    public static void main(String[] args) {

        // JVM 메모리 영역 3가지
        // 1. Stack
        // 2. Heap
        // 3. Method Area(static)
        // 클래스 -> 객체(인스턴스): 객체화(인스턴스화)


        // 객체 생성
        Character characterA = new Character();
        Character characterB = new Character("nameA", 1, true);

        // 기능 활용
        characterA.dance();
        characterB.dance();

        String target = characterA.hunt("사슴");
        System.out.println("target = " + target);

        int ret = characterB.sum(1, 2);
        System.out.println("ret = " + ret);

        // HEAP 의 상황...
        /// ---characterA-----
        // - name = "Steve"
        // - age
        // - isAdult
        /// ------------------
        /// ---characterB-----
        // - name = "nameA"
        // - age = 1
        // - isAdult = true
        /// ------------------

        // 세터 활용
        characterA.setName("gy");
        characterA.setName("Steve");
//        characterA.setName("Alice");
//        characterA.setName("Isac");
        characterA.setAge(17);
        characterA.setIsAdult(false);
//        characterA.name = "볼트모트";
        characterA.setName("볼트모트");

        String box = characterA.getName();
        System.out.println("box = " + box);

        // 게터 활용
    }
}
