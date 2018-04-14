package io.zipcoder;

public enum TenBasedMinute {

    ZERO(0),
    TWENTY(2),
    THIRTY(3),
    FORTY(4),
    FIFTY(5);

    private final int value;

    TenBasedMinute(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }


}
