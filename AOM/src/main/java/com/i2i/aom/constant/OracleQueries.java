package com.i2i.aom.constant;

public class OracleQueries {
    public final static String SELECT_ALL_PACKAGES = "SELECT PACKAGE_ID,PACKAGE_NAME,PRICE,AMOUNT_MINUTES,AMOUNT_DATA,AMOUNT_SMS,PERIOD FROM PACKAGE";
    public final static String SELECT_PACKAGE_DETAILS = "SELECT AMOUNT_MINUTES, AMOUNT_SMS, AMOUNT_DATA FROM PACKAGE WHERE PACKAGE_NAME = ?";

}
