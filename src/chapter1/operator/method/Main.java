package chapter1.operator.method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 객체화
        Calculator calculator = new Calculator();

        // 함수 호출
        int result = calculator.sum(1, 2);
        System.out.println("result = " + result);
    }
}
