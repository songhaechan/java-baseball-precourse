package baseball;

import baseball.constant.BaseballConst;
import baseball.constant.ViewMessage;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class BaseballGameRunner {

    private static boolean isGameContinue = true;

    public static void run(){
        List<Integer> systemNumbers = createSystemNumbers();
        while(isGameContinue){
            printInputMessage();
            BaseballNumber userBaseballNumber = new BaseballNumber(Console.readLine());
            BaseballGameResult result = userBaseballNumber.compareAndGetGameResult(systemNumbers);
            String message = BaseballViewResolver.resolve(result);
            printResult(message);
            if(retryCheck(result)){
                systemNumbers = createSystemNumbers();
            }
        }
    }

    public static boolean retryCheck(final BaseballGameResult result){
        if(result.isThreeStrike()){
            printRetryMessage();
            String input = Console.readLine();
            isGameContinue = input.equals("1");
            return true;
        }
        return false;
    }

    public static void printRetryMessage(){
        System.out.print(ViewMessage.TERMINATION.getMessage());
    }

    public static void printInputMessage(){
        System.out.print(ViewMessage.INPUT_MESSAGE.getMessage());
    }

    public static void printResult(final String message){
        System.out.println(message);
    }

    public static List<Integer> createSystemNumbers(){
        return Randoms.pickUniqueNumbersInRange(
                BaseballConst.MINIMUM_NUMBER.getValue(),
                BaseballConst.MAXIMUM_NUMBER.getValue(),
                BaseballConst.BASEBALL_NUMBER_SIZE.getValue());
    }
}
