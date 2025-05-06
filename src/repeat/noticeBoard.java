package repeat;

public class noticeBoard {
    //속성
    int a;
    String titile;
    private String story;
    int b;

    //생성자
    public noticeBoard(){

    }
    public noticeBoard(int a, String title, String story, int b){
        this.a = a;
        this.titile = title;
        this.story = story;
        this.b = b;
    }

    //기능
    String notice(int x){
        return "게시판 번호는 " + x + "입니다.";
    }

    String title(String title){
        return  "게시판 제목은 " + title + " 입니다.";
    }
    String story(String story){
        return "본문 내용은 " + story + " 입니다.";
    }

    String number(int b){
        if(b < 50){
            return  "사용자가 찾는 게시판 번호는 " + b + " 입니다.";
        }
        return "번호를 초과해서 입력했습니다.";
    }

    //세터 활용
    String setStroy(String story){
        return "초기 본문은 " + story + "입니다.";
    }

    //게터 활용
    int getA(){
        return this.a;
    }

}
