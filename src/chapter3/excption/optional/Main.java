package chapter3.excption.optional;

import com.sun.jdi.connect.spi.TransportService;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
//        Student steve = new Student("Steve");
//        camp.setStudent(steve);

        Optional<Student> studentOptional =  camp.getStudent();
        boolean flag = studentOptional.isPresent();

        if(flag){
            Student student = studentOptional.get();
            String studenName = student.getName();
            System.out.println("studenName = " + studenName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }

//        Student student = camp.getStudent();
//        System.out.println("student = " + student);
//
//        String studentName;
//        if (student != null){
//            studentName = student.getName();
//        } else{
//            System.out.println("등록된 학생이 아닙니다.");
//        }


        // NullPointerException
//        String studentName = student.getName();
//        System.out.println("student = " + student);
    }
}