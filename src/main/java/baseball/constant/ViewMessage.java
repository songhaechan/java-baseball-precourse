package baseball.constant;

public enum ViewMessage {
    INPUT_MESSAGE("숫자를 입력해주세요 :"),
    NOTHING("낫싱"),
    BALL("%d 볼"),
    STRIKE("%d 스트라이크"),
    BALL_STRIKE("%d 볼 %d 스트라이크"),
    TERMINATION("3개의 숫자를 모두 맞히셨습니다! \n 게임 종료 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String message;

    ViewMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
