package chapter3.excption.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        //컬랙션
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        
        //arrylist 활용
        ArrayList<String> names = new ArrayList<>();
        //데이터 추가
        names.add("sparta");
        names.add("steve");
        names.add("isac");
        names.add("1");
        System.out.println("names = " + names);
        
        //중복 데이터 허용
        names.add("sparta");
        System.out.println("names = " + names);

        //데이터 단건 조회
        String name1 = names.get(0);
        System.out.println("name1 = " + name1);

        names.remove("isac");
        System.out.println("name = " + names);
        
        //HashSet
        HashSet<String> uniqueNames = new HashSet<>();
        
        //데이터 추가
        uniqueNames.add("spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Isac");
        uniqueNames.add("1");
        uniqueNames.add("2");
        uniqueNames.add("3");

        System.out.println("uniqueNames = " + uniqueNames);
        
        //중복 불가
        uniqueNames.add("spartan");
        System.out.println("uniqueNames = " + uniqueNames);
        
    }
}
