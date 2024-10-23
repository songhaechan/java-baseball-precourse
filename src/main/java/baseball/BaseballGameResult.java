package baseball;

import baseball.constant.BaseballConst;

public class BaseballGameResult {
    private int ballCount;
    private int strikeCount;
    private boolean isNothing;

    public BaseballGameResult() {
        this.ballCount = 0;
        this.strikeCount = 0;
        this.isNothing = false;
    }

    public void increaseBall() {
        ballCount++;
    }

    public void increaseStrike() {
        strikeCount++;
    }

    public boolean isNothing(){
        return isNothing;
    }

    public boolean isStrikeOnly(){
        return ballCount == 0;
    }

    public boolean isBallOnly(){
        return strikeCount == 0;
    }

    public boolean isThreeStrike(){
        return strikeCount == 3;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
}
