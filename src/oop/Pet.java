package oop;

import oop.pet.Whale;

public class Pet {
    // 메인 메소드
    public static void main(String[] args) {
        Whale whale = new Whale(); // 객체 타입 = class 명
        Whale whale2 = new Whale(20);
        Whale whale3 = new Whale(30, "meerkat");
        whale.swimming(); // Whale에 있는 메소드 swimming 불러오기
                        // .(점)으로 연결

        System.out.println(whale.mySum(1, 2)); //3

        long long1 = 1;
        long long2 = 2;
        long sum2 = whale.mySum(long1, long2); // 타입에러

    }



}
