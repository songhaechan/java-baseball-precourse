package baseball;

public class InputValidator {

    public static void validateInput(final String userInput){
        validateInputSize(userInput);
        validateCharacter(userInput);
    }

    private static void validateCharacter(final String userInput) {
        for(int i=0; i<BaseballConst.BASEBALL_NUMBER.getValue(); i++){
            if(userInput.charAt(i) <= 48  || userInput.charAt(i) > 57){
                throw new IllegalArgumentException("1-9가 아닌 문자는 입력 불가능");
            }
        }
    }

    private static void validateInputSize(final String userInput) {
        if(userInput.length()>BaseballConst.BASEBALL_NUMBER.getValue()){
            throw new IllegalArgumentException("3자리 초과 입력");
        }
    }
}
