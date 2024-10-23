package baseball;

import baseball.constant.ViewMessage;

public class BaseballViewResolver {

    private static boolean isGameContinue = true;

    public static String resolve(final BaseballGameResult result) {
        if (result.isNothing()) {
            return ViewMessage.NOTHING.getMessage();
        } else if (result.isStrikeOnly()) {
            return String.format(ViewMessage.STRIKE.getMessage(), result.getStrikeCount());
        } else if (result.isBallOnly()) {
            return String.format(ViewMessage.BALL.getMessage(), result.getBallCount());
        } else {
            return String.format(
                    ViewMessage.BALL_STRIKE.getMessage(),
                    result.getBallCount(),
                    result.getStrikeCount());
        }
    }
}
