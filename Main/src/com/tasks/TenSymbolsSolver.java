package com.tasks;

public class TenSymbolsSolver implements IMainUseable, ICheckable{
    private int length = 10;
    private String s;

    public TenSymbolsSolver(String s){
        this.s = stringCheck(s);
    }

    public String stringCheck(String s){
        if(s != null && s != "" && s.length() > 5)
            return s;
        else {
            System.out.println("String is null or empty!\nThe line value is set as \"default\"\n");
            return new String("default");
        }
    }
    @Override
    public void mainMethod() {
        String line = new String();

        for (int i = 0, j = 0; i < 10; i++) {
            if (i % 2 == 0){
                line += i;
            } else{
                line += s.charAt(j);
                j++;
            }
        }

        System.out.println(line);
    }
}//Сформировать строку из 10 символов. На четных позициях должны находится четные цифры, на нечетных позициях - буквы.
