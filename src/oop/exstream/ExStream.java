package oop.exstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExStream {
    public static void main(String[] args) {
        BoardDTO board1 = new BoardDTO(1,"title1", "content1");
        BoardDTO board2 = new BoardDTO(2,"title2", "content2");
        BoardDTO board3 = new BoardDTO(3,"title3", "content3");

        List<BoardDTO> boards = new ArrayList<BoardDTO>();
        boards.add(board1);
        boards.add(board2);
        boards.add(board3);

        // 스트림 생성
        //  List가 Stream으로 변경된거
        Stream<BoardDTO> streamBoards = boards.stream();
        // 필터로 할경우 조건을 제시해주면 됨.
        // 사용한 메소드를 보고 기능을 확인 할 수 있음
        List<BoardDTO> filterList =
                streamBoards
                        .filter(board -> board.getBoardId() %2 == 0 )
                        .toList();

        // for문으로 바꾸기
        List<BoardDTO> exList = new ArrayList<>();

        // 향상된 for문, board = 요소를 저장
        for (BoardDTO board : filterList) {
            if(board.getBoardId() %2 == 0){
                exList.add(board);
            }
        }
    }
}

// 자바는 데이터를 DTO라는 클래스에 담음
// 이게 DTO 객체
// 하나의 레코드에 대한 정보만 들어있음
class BoardDTO {
    private long boardId;
    private String boardTitle;
    private String boardContent;


    public BoardDTO(long boardId, String boardTitle, String boardContent) {
        this.boardId = boardId;
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
    }

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }
}
