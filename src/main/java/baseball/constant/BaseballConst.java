package baseball.constant;

public enum BaseballConst {
    BASEBALL_NUMBER_SIZE(3),
    MINIMUM_NUMBER(1),
    MAXIMUM_NUMBER(9),
    RESTART(1),
    TERMINATE(2);

    private final int value;

    public int getValue(){
        return value;
    }

    BaseballConst(final int value) {
        this.value = value;
    }
}
