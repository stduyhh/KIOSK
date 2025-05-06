package repeat;

public class Main5 {
    public static void main(String[] args) {
        Library library = new Library();

        String library1 = library.reservation(2333);
        System.out.println(library1);

        String library2 = library.bookName(200, "나의라임오렌지나무");
        System.out.println(library2);

        String library3 = library.user("홍길동", 99);
        System.out.println(library3);
    }
}