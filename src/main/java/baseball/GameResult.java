package baseball;

public class GameResult {
  private int ballCount;
  private int strikeCount;
  private boolean isNothing;

  private static final String NOTHING = "낫싱";
  private static final String BALL = "%d 볼";
  private static final String STRIKE = "%d 스트라이크";
  private static final String BALL_STRIKE = "%d 볼 %d 스트라이크";

  public GameResult() {
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

  public void checkNumberMatching() {
    if (ballCount== BaseballConst.BASEBALL_NUMBER.getValue()) {
      isNothing = true;
    }
  }

  public String getResult(){
    if(isNothing){
      return NOTHING;
    }else if(strikeCount== 0){
      return String.format(STRIKE, strikeCount);
    }else if(ballCount==0){
      return String.format(BALL, ballCount);
    }else{
      return String.format(BALL_STRIKE,ballCount,strikeCount);
    }
  }
}
