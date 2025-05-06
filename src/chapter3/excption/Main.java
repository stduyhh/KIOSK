package chapter3.excption;

public class Main {
    public static void main(String[] args) {
        // 의도하지 않은 예외
//        int ret = 10/0;
//        System.out.println("ret = " + ret);
//        System.out.println("프로그램 종료");

        // 의도적인 예외
//        int age = 10;
//        if (age < 18) {
//            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
//        }
//

        ExceptionPractice exceptionPractice = new ExceptionPractice();
//           try {
//               exceptionPractice.calluncheckedException();
//            if (true) {
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e){
//            System.out.println("언체크 예외 처리");
//        }
        //체크 예외 처리
        exceptionPractice.callCheckedException();

        System.out.println("프로그램 종료");
    }
}
