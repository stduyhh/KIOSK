import javax.lang.model.SourceVersion;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        //[자료형] [변수 이름];
        int a;
        a = 2;
        a = 4;
        System.out.println("a= "+ a);

        // 논리형
        boolean booleanBox = true ;
        booleanBox = false;
        System.out.println("booleanBox = " + booleanBox);

        //문자형
        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox = " + charBox);
        
        //큰 정수형
        long longBox = 1;
        longBox = 13;
        System.out.println("longBox = " + longBox);



        // 입력(Scanner)
        System.out.println("좋아하는 문장을 입력하세요:  ");
        Scanner scannner = new Scanner(System.in);
        String sentence = scannner.nextLine();
        System.out.println("sentence = " + sentence);
    }
}