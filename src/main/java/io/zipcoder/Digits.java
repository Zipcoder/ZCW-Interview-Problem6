package io.zipcoder;

public enum Digits {

    ZERO_ZERO(0, "Zero Zero"),
    ZERO_ONE(1, "Zero One"),
    ZERO_TWO(2, "Zero Two"),
    ZERO_THREE(3, "Zero Three"),
    ZERO_FOUR(4, "Zero Four"),
    ZERO_FIVE(5, "Zero Five"),
    ZERO_SIX(6, "Zero Six"),
    ZERO_SEVEN(7, "Zero Seven"),
    ZERO_EIGHT(8, "Zero Eight"),
    ZERO_NINE(9, "Zero Nine"),
    TEN(10, "Ten"),
    ELEVEN(11, "Eleven"),
    TWELVE(12, "Twelve"),
    THIRTEEN(13, "Thirteen"),
    FOURTEEN(14, "Fourteen"),
    FIFTEEN(15, "Fifteen"),
    SIXTEEN(16, "Sixteen"),
    SEVENTEEN(17, "Seventeen"),
    EIGHTEEN(18, "Eighteen"),
    NINETEEN(19, "Nineteen"),
    TWENTY(20, "Twenty"),
    TWENTY_ONE(21, "Twenty One"),
    TWENTY_TWO(22, "Twenty Two"),
    TWENTY_THREE(23, "Twenty Three"),
    TWENTY_FOUR(24, "Twenty Four"),
    TWENTY_FIVE(25, "Twenty Five"),
    TWENTY_SIX(26, "Twenty Six"),
    TWENTY_SEVEN(27, "Twenty Seven"),
    TWENTY_EIGHT(28, "Twenty Eight"),
    TWENTY_NINE(29, "Twenty Nine"),
    THIRTY(30, "Thirty"),
    THIRTY_ONE(31, "Thirty One"),
    THIRTY_TWO(32, "Thirty Two"),
    THIRTY_THREE(33, "Thirty Three"),
    THIRTY_FOUR(34, "Thirty Four"),
    THIRTY_FIVE(35, "Thirty Five"),
    THIRTY_SIX(36, "Thirty Six"),
    THIRTY_SEVEN(37, "Thirty Seven"),
    THIRTY_EIGHT(38, "Thirty Eight"),
    THIRTY_NINE(39, "Thirty Nine"),
    FORTY(40, "Forty"),
    FORTY_ONE(41, "Forty One"),
    FORTY_TWO(42, "Forty Two"),
    FORTY_THREE(43, "Forty Three"),
    FORTY_FOUR(44, "Forty Four"),
    FORTY_FIVE(45, "Forty Five"),
    FORTY_SIX(46, "Forty Six"),
    FORTY_SEVEN(47, "Forty Seven"),
    FORTY_EIGHT(48, "Forty Eight"),
    FORTY_NINE(49, "Forty Nine"),
    FIFTY(50, "Fifty"),
    FIFTY_ONE(51, "Fifty One"),
    FIFTY_TWO(52, "Fifty Two"),
    FIFTY_THREE(53, "Fifty Three"),
    FIFTY_FOUR(54, "Fifty Four"),
    FIFTY_FIVE(55, "Fifty Five"),
    FIFTY_SIX(56, "Fifty Six"),
    FIFTY_SEVEN(57, "Fifty Seven"),
    FIFTY_EIGHT(58, "Fifty Eight"),
    FIFTY_NINE(59, "Fifty Nine");

    final int digitsInt;
    final String digitsString;

    Digits(int digitsInt, String digitsString) {
        this.digitsInt = digitsInt;
        this.digitsString = digitsString;
    }

    public int toInt() {
        return digitsInt;
    }

    public String toString() {
        return digitsString;
    }

}
