package com.api.smtp.utility;


import com.api.smtp.model.MyCustomException;

public class CheckArraysUtils {

    public static void checkArrayIndex(int index, int length) throws MyCustomException {
        if (index < 0 || index >= length) {
            throw new MyCustomException("Index out of bounds");
        }
    }
}
