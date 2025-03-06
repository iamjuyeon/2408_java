package oop.enumeration;

public class ExEnum {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        System.out.println(day);
        System.out.println(day.getDayName());
    }
}

enum Days {
    // public static final SUNDAY = new Days("일요일"); // 원래 이게 생략되어 있음, 생성자를 만들어야함
    // 외부에서 인스턴스 할 수 없음
    SUNDAY("일요일", 0)
    ,MONDAY("월요일", 1)
    ,TUESDAY("화요일", 2)
    ,WEDNESDAY("수요일", 3)
    ,THURSDAY("목요일", 4)
    ,FRIDAY("금요일", 5)
    ,SATURDAY("토요일", 6);

    private final String dayName;
    private final int dayNum;

    private Days(String dayName, int dayNum) {
        this.dayName = dayName;
        this.dayNum = dayNum;
    }
    public String getDayName() {
        return this.dayName;
    }

    public int getDayNum() {
        return this.dayNum;
    }
}


