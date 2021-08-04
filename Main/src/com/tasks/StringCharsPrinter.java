package com.tasks;

/**
 * Prints some symbols from the input line.
 */
public class StringCharsPrinter implements IMainUseable, ICheckable{
    private String s;

    public StringCharsPrinter(String s){
        this.s = stringCheck(s);
    }

    /**
     * Prints first, middle (if it is) and last characters of the string.
     */
    @Override
    public void mainMethod() {
        System.out.print(String.format("Chars is: %c %c %c", s.charAt(0), (s.length() % 2 != 0 ? s.charAt(s.length()/2) : '_'), s.charAt(s.length()-1)));
    }
}//Дана строка. Вывести первый, последний и средний (если он есть)) символы.
