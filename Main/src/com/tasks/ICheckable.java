package com.tasks;

/**
 * Contain the check method for {@link String}
 */
public interface ICheckable {
    /**
     * Checking a string value
     * @param s checked line.
     * @return If the input string is invalid then the method returns "default". If the value is valid, it is returns.
     */
    default String stringCheck(String s){
        if(s != null && !s.isBlank())
            return s;
        else {
            System.out.println("String is null or empty!\nThe line value is set as \"default\"\n");
            return new String("default");
        }
    }
}
