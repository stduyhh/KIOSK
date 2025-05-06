package repeat;

public class Library {

    //속성
    int bookNumber;
    String bookName;
    int computeNum;
    String name;


    //생성자
    public Library(){
    }

    public Library(int bookNumber, String bookName, int computeNum, String name){
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.computeNum = computeNum;
        this.name = name;
    }

    //기능
    String reservation(int bookNumber){
        return bookNumber + "번 책을 예약했습니다.";
    }

    String bookName(int bookNumber, String bookName){
        return bookNumber + "번 책의 이름은 " + bookName;
    }

    String user(String name, int bookNumber){
        return bookNumber + "번의 예약자는 : " + name + "입니다.";
    }


}
