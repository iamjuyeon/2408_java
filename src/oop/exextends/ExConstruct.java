package oop.exextends;

public class ExConstruct {
    public static void main(String[] args) {
        Whale2 whale2 = new Whale2(); //인스턴스화
        whale2.print();
    }
}

// 자바의 상속관계에서
class Animal {
    protected String name = "Mammals";

    //해결방법 1 : 부모에게 default 생성자를 준다
    //public Animal() {}

    public Animal(int a) {
        System.out.println("Animal");
    }
}
// 같은 패키지에 같은 클래스명 사용 못함

class Mammel2 extends Animal {
    protected String name = "Mammal";
    public Mammel2() {
        //super(); 부모의 default 생성자를 출력

        // 해결방법 2: 자식에서 부모의 생성자를 호출 super메소드로(주의할 점 : 슈퍼메소드는 항상 앞에)
        super(1);
        System.out.println("Mammel2");
    }
}

class Whale2 extends Mammel2 {
    protected String name = "Whale2";

    public Whale2() {
        //super(); //생략
        System.out.println("Whale2");
    }

    public void print() {
        String name = "print";
        System.out.println(name); //지역변수 : 동일 메소드 안
        System.out.println(this.name); // 자식에 접근
        System.out.println(super.name); // 부모에 접근
    }
}
