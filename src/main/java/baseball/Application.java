package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
  public static void main(String[] args) {
    BaseballService baseballService = new BaseballService();
    List<Integer> systemNumbers = baseballService.createSystemNumbers();
    while (true) {
      View.printInputInformation();
      String userInput = Console.readLine();
      InputValidator.validateInput(userInput);
      GameResult gameResult = baseballService.compareNumbers(userInput,systemNumbers);
      View.printResult(gameResult.getResult());
    }
  }
}
