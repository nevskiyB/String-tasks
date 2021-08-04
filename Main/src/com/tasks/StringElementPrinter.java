package com.tasks;

public class StringElementPrinter implements IMainUseable, ICheckable{
    private String s;

    public StringElementPrinter(String s){
        this.s = this.stringCheck(s);
    }

    public String stringCheck(String s) {
        if (s != null && s != "" && s.length() >= 3)
            return s;
        else {
            System.out.println("String is null or empty!\nThe line value is set as \"default\"\n");
            return new String("default");
        }
    }

    @Override
    public void mainMethod(){
        for (int i = 2; i < s.length(); i+=3) {
            System.out.println(s.charAt(i));
        }
    }
}//Дана строка. Показать третий, шестой, девятый и так далее символы.
