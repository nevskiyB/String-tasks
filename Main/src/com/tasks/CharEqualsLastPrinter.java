package com.tasks;

public class CharEqualsLastPrinter implements IMainUseable, ICheckable{
    private String s;

    public CharEqualsLastPrinter(String s){
        this.s = stringCheck(s);
    }

    @Override
    public void mainMethod(){
        char lastSymbol = s.charAt(s.length() - 1);

        for (int i = 0; i < s.length() - 1; i++)
            System.out.println((lastSymbol == s.charAt(i)) ? i : "");
    }
}//Дана строка. Показать номера символов, совпадающих с последним символом строки.
