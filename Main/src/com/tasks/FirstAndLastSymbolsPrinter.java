package com.tasks;

public class FirstAndLastSymbolsPrinter implements IMainUseable, ICheckable{
    private String s;
    public FirstAndLastSymbolsPrinter(String s){
        this.s = stringCheck(s);
    }
    @Override
    public void mainMethod() {
        String result = "";

        if (s.length() > 5) {
            String firstThree = s.substring(0, 3);
            String lastThree = s.substring(s.length() - 3);
            System.out.println(firstThree.concat(lastThree));
            return;
        }
        for (int i = 0; i < s.length(); i++)
            result += s.charAt(0);

        System.out.println(result);
    }
}//Дана строка. Вывести первые три символа и последний три символа, если длина строки больше 5. Иначе вывести первый символ столько раз, какова длина строки.
