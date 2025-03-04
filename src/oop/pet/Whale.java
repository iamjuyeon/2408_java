package oop.pet; //namespaced

public class Whale {
    // 접근제어 지시자 public private protected(상속관계에서 사용가능) default(동일 패키지 내에서만 사용가능)
    // 프로퍼티, 메소드  : php랑 동일
    // int age;
    // public static String name; //정적 프로퍼티(class 변수)
    // public String name;
    
    private int age; //인스턴스 변수
    private String name;

    // 생성자 : 클래스 명과 동일
    public Whale() {
        this(10);
    }
    public Whale(int age) {
//        this.age = age; // 인스턴스 생성시에 딱한번 실행할
//        this.name = "Whale";

        this(age, "John");
    }
    public Whale(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // -------메소드 --------
    public void swimming() { 
        // void 를 적어주는 이유 : void 없이 return를 하면 데이터 타입을 자동으로 확인 못함
        
        String test = "test"; // 지역 변수(메소드안에서만 접근 가능)
        System.out.println("Swimming");
    }
    public int mySum(int a) {
        return a + 1;
    }

    public int mySum(int a, int b) {
        return a +b;
    }

    // 오버로딩 : 똑같은 메소드명을 가지고 있지만 파라미터 타입이 다를 경우 사용가능
    public long mySum(long a, long b) {
        return a +b;
    }
}
