package oop.generics;

public class ExGenerics {
    public static void main(String[] args) {

        Whale whale = new Whale();
        ResponseDTO<Whale> responseDTO = new ResponseDTO();
        //  ResponseDTO<Whale> responseDTO = new ResponseDTO<Whale>(); // 생략 가능
        responseDTO.setMessage("Hello World");
        responseDTO.setSuccess(true);
        responseDTO.setData(whale);

        Hamo hamo = new Hamo();
        ResponseDTO<Hamo> responseHamo = new ResponseDTO();
        responseHamo.setMessage("Hamo");
        responseHamo.setSuccess(true);
        responseHamo.setData(hamo); // Whale 안에는 data 만,, -> responseDTO를 새로 생성
    }
}
//responseDTO.setData(hamo); 이 에러를 해결하기 위해 -> 제너릭스
class ResponseDTO<T> {
    private boolean success;
    private String message;
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    // -------------------------------------------------

// 캡슐화 때문에 이렇게 함.
    // 캡슐화 하는 이유 : 프로퍼티 값을 보호하기 위해
//    public boolean getSuccess() {
//        return success; //this를 생략할 수 있음
//    }
//
//    public void setSuccess(boolean success) {
//        this.success = success;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Whale getData() {
//        return data;
//    }
//
//    public void setData(Whale whale) {
//        this.data = whale;
//    }
}

class Whale {}
class Hamo {}
class Squirrel {}
