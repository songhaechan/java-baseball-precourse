package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;

public class BaseballService {

  public List<Integer> createSystemNumbers(){
    return Randoms.pickUniqueNumbersInRange(
            BaseballConst.MINIMUM_NUMBER.getValue(),
            BaseballConst.MAXIMUM_NUMBER.getValue(),
            BaseballConst.BASEBALL_NUMBER.getValue());
  }

  public GameResult compareNumbers(final String userNumber, final List<Integer> systemNumbers) {
    GameResult gameResult = new GameResult();
    StringBuilder stringBuilder = new StringBuilder();
    systemNumbers.forEach(stringBuilder::append);
    String systemNumber = stringBuilder.toString();
    compare(userNumber, systemNumber, gameResult);
    return gameResult;
  }

  private void compare(final String userNumber, final String systemNumber, final GameResult gameResult) {
    for (int i = 0; i < 3; i++) {
      if (systemNumber.charAt(i) == userNumber.charAt(i)) {
        gameResult.increaseStrike();
      }
      if (systemNumber.charAt(i) != userNumber.charAt(i)) {
        gameResult.increaseBall();
      }
    }
    gameResult.checkNumberMatching();
  }
}
