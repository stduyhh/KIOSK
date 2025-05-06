package repeat;

public class Main3 {
    public static void main(String[] args) {
        //noticeBoard 객체 생성
        noticeBoard noticeboard = new noticeBoard();
        noticeBoard noticeBoard2 = new noticeBoard(20, "제목", "본문", 5);

        // 기능 사용
        String board1 = noticeboard.notice(4);
        System.out.println(board1);

        String board2 = noticeboard.title("된장찌개를 좋아해");
        System.out.println(board2);

        String board3 = noticeboard.story("a~~~~~~~~~~~~~~~~b");
        System.out.println(board3);

        String board4 = noticeboard.number(120);
        System.out.println(board4);

        //세터
        String board5 = noticeboard.setStroy("zzzzzzzzzzzz");
        System.out.println(board5);

        //게터
        int number = noticeBoard2.getA();
        System.out.println(number);
    }
}
