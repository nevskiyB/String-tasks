package com.tasks;

public class ReplacementFirstThreeStmbolsSolver implements IMainUseable, ICheckable{
    private String s;

    public ReplacementFirstThreeStmbolsSolver(String s){
        this.s = this.stringCheck(s);
    }

    @Override
    public void mainMethod(){
        String newString;

        if(s.startsWith("abc"))
            newString = "www" + s.substring(3);
        else
            newString = s + "zzz";

        System.out.println(newString);
    }
}//Дана строка. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.
