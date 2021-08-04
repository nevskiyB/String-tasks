package com.tasks;

public class StringLengthTimesPrinter implements IMainUseable, ICheckable{
    private String s1;
    private String s2;

    public StringLengthTimesPrinter(String s1, String s2){
        this.s1 = stringCheck(s1);
        this.s2 = stringCheck(s2);
    }

    @Override
    public void mainMethod() {
        int delta = s1.length() - s2.length();

        if (delta == 0)
            System.out.println("The strings length is equals");
        else
            System.out.println(delta > 0 ? s1.repeat(delta) : s2.repeat(Math.abs(delta)));
    }
}//Даны две строки. Вывести большую по длине строку столько раз, на сколько символов отличаются строки.
