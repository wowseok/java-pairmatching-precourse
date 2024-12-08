package pairmatching.view;

public class OutputView {

    public static final String ERROR_FORM = "[ERROR] %s%n";

    public void printErrorMessage(Throwable throwable) {
        System.out.printf(ERROR_FORM, throwable.getMessage());
        System.out.println();
    }

    public void printIntroMessage() {
        System.out.printf("기능을 선택하세요.\n"
                + "1. 페어 매칭%n"
                + "2. 페어 조회%n"
                + "3. 페어 초기화%n"
                + "Q. 종료%n");
    }

    public void printMatchingMessage() {
        System.out.printf("#############################################%n"
                + "과정: 백엔드 | 프론트엔드%n"
                + "미션:%n"
                + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임%n"
                + "  - 레벨2: 장바구니 | 결제 | 지하철노선도%n"
                + "  - 레벨3: %n"
                + "  - 레벨4: 성능개선 | 배포%n"
                + "  - 레벨5: %n"
                + "############################################%n"
                + "과정, 레벨, 미션을 선택하세요.%n"
                + "ex) 백엔드, 레벨1, 자동차경주%n");
    }

}
