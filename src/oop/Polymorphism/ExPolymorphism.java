package oop.Polymorphism;

public class ExPolymorphism {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        whale1.birth();
        whale1.swimming();
        //다형성
        Mammal whale2 = new Whale();
        // 부모의 클래스에 저장하고 있기 때문에 부모 타입으로 변겯됨, 그래서 자식에는 접근이 안됨
        // 그래서 whale.swimming(); 이거 안됨
        whale2.birth();
        // whale2.swimming(); // 안됨

        // ** 다운 캐스팅 **
        // 업캐스팅 된 것을 다운 캐스팅 할 수 있음
        // Whale mammal = new Mammal(); // 이거 안됨 : 부모는 최상위기 때문에
        Whale mammal = (Whale) whale2;

        // 여러개의 데이터 타입을 한 배열에 넣어 줄 수 있음 -> 다형성
        Mammal[] mammals = {new Whale(), new Whale(), new Squirrel()};

        Whale testWhale = (Whale) mammals[0];
        testWhale.swimming();

    }
}

// 업캐스팅 : 자식이 부모의 메소드를 가질때
// 다운캐스팅 : 부모가 자식의 메소드를 가질때
// php에서는 고려 안함 : 변수를 저장할 때 데이터 타입을 고려하지 않기 때문에

class Mammal {
    public void birth() {
        System.out.println("출산한다");
    }
}

// whale 과 Mammel 의 형태를 띄고 있음 -> 다형성
class Whale extends Mammal {
    public void swimming() {
        System.out.println("수영한다");
    }
}

class Squirrel extends Mammal {
    public void flying() {
        System.out.println("다람쥐 날다");
    }
}
