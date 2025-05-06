package basic;

public class Course {
    //속성
    String session;


    //생성자
    public Course(String session){

        this.session = session;
    }

    //기능
    public void lesson(){
        this.session = session;
        System.out.println(session + "을/를 수업합니다.");
    }
}
