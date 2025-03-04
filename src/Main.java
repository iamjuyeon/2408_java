import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");

//        String a = "Hello World";
//        String b = "Hello World";
//        //System.out.println(a == b); // string pool 이라서 결과는 true로 나옴
//        System.out.println(a.equals(b)); // string 비교할때 euqals가 가장 정확하다

//        for(int i =1; i <= 5; i++) {
//            if(i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }

        // 1~100, 3과 7 배수 찾기
//        for(int i=1; i <=100; i++) {
//            if( i %3 == 0 || i %7 == 0) {
//                System.out.println(i);
//            }
//        }

        // 배열(reference 타입)
        int[] arrInt = new int[10]; // 방이 10개가 있는 배열을 선언
        int[] arrInt2 = {1, 2, 3, 4, 5}; // arrInt2 배열안에 객체 1,2,3,4,5 넣음
        String[] arrString = {"a", "b", "c", "d", "e"}; // 처음에 데이터 값을 넣고 싶을때 중괄호로
        // arrInt[0] = "45"; // 이거 안됨, 타입이 달라서
        int[] arrInt3 = Arrays.copyOf(arrInt2, arrInt2.length);

        // int[] arrInt3 = arrInt2;

        arrInt3[0] = 100;
        System.out.println(Arrays.toString(arrInt2)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arrInt3)); //[100, 2, 3, 4, 5]
    }

    // 연산자
    // 같다 : (1 == 1);
    // ( 1 == "1") 이거 안됨
    // 같지 않다 : (1 != 1);
    // * 문자열 비교

}
