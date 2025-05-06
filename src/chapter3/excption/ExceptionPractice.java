package chapter3.excption;

import java.rmi.server.ExportException;

public class ExceptionPractice {
    // 언체크 호출
    public void calluncheckedException(){
        if (true) {
            System.out.println("언체크 예외 발생");
            throw new RuntimeException();
        }
//        try {
//            if (true) {
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e){
//            System.out.println("언체크 예외 처리");
//        }
    }

    // 체크 호출
    public void callCheckedException(){
        try {
            if (true) {
                System.out.println("체크예외");
                throw new Exception();
            }
        } catch (Exception e){
            System.out.println("체크 예외처리");
        }
    }
}
