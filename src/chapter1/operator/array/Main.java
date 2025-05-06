package chapter1.operator.array;

public class Main {
    public static void main(String[] args) {
        // 모험가 명단 관리;
/*        String name1 = "gggv";
        String name2 = "ggga";

        String name83 = "dggv";
        String[] adventurerList = {"gggv", "ggga","dggv"};

        // 배열 선언
//        int[] arr;
        // 배열 길이 할당
//        arr = new int[5];

//        int[] arr = new int[5];

        int[] arr = {10, 20, 30, 40, 50};
        int arrLength = arr.length;
        System.out.println("arrLength = " + arrLength);*/

        //문자열 배열
        String[] strArr= new String[5];
        //논리형 배열
        Boolean[] boolArr = new Boolean[5];

        //인덱스 활용
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("배열의 1번째 요소: " + arr[0]);
        System.out.println("배열의 2번째 요소: " + arr[1]);
        System.out.println("배열의 3번째 요소: " + arr[2]);
        System.out.println("배열의 4번째 요소: " + arr[3]);
        System.out.println("배열의 5번째 요소: " + arr[4]);

        arr[0] =100;
        arr[1] =200;
        arr[2] =300;
        arr[3] =400;
        arr[4] =500;
        System.out.println("배열의 1번째 요소: " + arr[0]);
        System.out.println("배열의 2번째 요소: " + arr[1]);
        System.out.println("배열의 3번째 요소: " + arr[2]);
        System.out.println("배열의 4번째 요소: " + arr[3]);
        System.out.println("배열의 5번째 요소: " + arr[4]);


        for (int i = 0; i < arr.length; i++){
            System.out.println("인덱스: " + i + "값: " + arr[i]);


            //향상된 for문
            for (int a : arr){
                System.out.println("값: " + a);
            }
        }


        boolean[][] board = new boolean[2][2];

    }
}
