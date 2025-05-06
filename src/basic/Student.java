package basic;

import java.util.SplittableRandom;

public class Student {
    //속성
    int grade;
    String name;
    int age;
    Course course;

    //생성자
    public Student(String name, int grade, int age, Course course){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.course = course;
    }

    //기능
    public String study(){
         return name + "이(가) 공부합니다.";
    }
}
