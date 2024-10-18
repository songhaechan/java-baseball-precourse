package baseball;

public enum BaseballConst {
    BASEBALL_NUMBER(3),
    MINIMUM_NUMBER(1),
    MAXIMUM_NUMBER(9);

    private final int value;

    BaseballConst(final int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
