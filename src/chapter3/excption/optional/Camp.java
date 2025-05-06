package chapter3.excption.optional;

import java.util.Optional;

public class Camp {
    //속성
    Student student;

    //생성자


    //기능
    public Optional<Student> getStudent(){
        return Optional.ofNullable(student);
//        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }
}
