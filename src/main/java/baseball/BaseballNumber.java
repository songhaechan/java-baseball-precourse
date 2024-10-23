package baseball;

import baseball.constant.BaseballConst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BaseballNumber {

    private final List<Integer> userNumbers;

    public BaseballNumber(final List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public BaseballNumber(final String inputNumber){
        validate(inputNumber);
        this.userNumbers = Arrays.stream(inputNumber.split(""))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }

    public BaseballGameResult compareAndGetGameResult(final List<Integer> systemNumbers){
        BaseballGameResult baseballGameResult = new BaseballGameResult();
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(systemNumbers.get(i), userNumbers.get(i))) {
                baseballGameResult.increaseStrike();
            }
            if (!Objects.equals(systemNumbers.get(i), userNumbers.get(i))) {
                baseballGameResult.increaseBall();
            }
        }
        return baseballGameResult;
    }

    private void validate(final String userInput){
        validateInputSize(userInput);
        validateCharacter(userInput);
    }

    private void validateInputSize(final String userInput) {
        if(userInput.length()> BaseballConst.BASEBALL_NUMBER_SIZE.getValue()){
            throw new IllegalArgumentException("3자리 초과 입력");
        }
    }

    private void validateCharacter(final String userInput) {
        for(int i = 0; i<BaseballConst.BASEBALL_NUMBER_SIZE.getValue(); i++){
            if(userInput.charAt(i) <= 48  || userInput.charAt(i) > 57){
                throw new IllegalArgumentException("1-9가 아닌 문자는 입력 불가능");
            }
        }
    }
}
