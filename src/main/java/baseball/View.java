package baseball;

import camp.nextstep.edu.missionutils.Console;

public class View {
    private final static String NUMBER_INPUT = "숫자를 입력해주세요 : ";

    public static void printInputInformation(){
        System.out.print(NUMBER_INPUT);
    }

    public static void printResult(final String result){
        System.out.println(result);
    }
}
