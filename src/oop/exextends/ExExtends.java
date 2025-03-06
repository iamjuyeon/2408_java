package oop.exextends;

public class ExExtends {
    public static void main(String[] args) {
        Whale whale = new Whale("고래", "바다");
        whale.breath();
    }
}

class Mammals {
    protected String name;
    protected String residence;

    // protected final int age; // 이때 age는 상수가 됨(class, property, method에 붙을 수 있음)


    public void breath() {
        System.out.println(this.name + "가 폐호흡합니다.");
    }
}

class Whale extends Mammals {
    public Whale(String name, String residence) {
        this.name = name; //다른 클래스에 있어도 상속되면 내것처럼 사용할 수 있음
        this.residence = residence;
    }
    @Override
    // 메소드 파라미터명이 같아야함
    // return 타입이 같아야함
    public void breath() {
        System.out.println("나는 ");
    }
}


