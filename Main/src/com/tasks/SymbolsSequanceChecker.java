package com.tasks;

public class SymbolsSequanceChecker implements IMainUseable, ICheckable{
    private String s;

    public SymbolsSequanceChecker(String s){
        this.s = stringCheck(s);
    }

    /**
     * Prints first, middle (if it is) and last characters of the string.
     */
    @Override
    public void mainMethod() {
        String str = s.toLowerCase();
        int wIndex = str.indexOf('w');
        int xIndex = str.indexOf('x');

        if (xIndex < 0 || wIndex < 0)
            System.out.println("The character is absent!");
        else
            System.out.println(xIndex < wIndex ? "'x' character is first" : "'w' character is first");
    }
}//Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'. Если какого-то из символов нет, вывести сообщение об этом.
