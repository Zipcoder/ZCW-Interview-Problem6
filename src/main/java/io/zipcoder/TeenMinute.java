package io.zipcoder;

public enum TeenMinute {

    TEN(0),
    ELEVEN(1),
    TWELVE(2),
    THIRTEEN(3),
    FOURTEEN(4),
    FIFTEEN(5),
    SIXTEEN(6),
    SEVENTEEN(7),
    EIGHTEEN(8),
    NINETEEN(9);

    private final int value;

    TeenMinute(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
