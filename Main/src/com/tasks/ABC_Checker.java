package com.tasks;

import java.util.Locale;

public class ABC_Checker  implements IMainUseable, ICheckable{
    private String s;
    public ABC_Checker(String s){
        this.s = stringCheck(s);
    }
    @Override
    public void mainMethod() throws Exception{
        int startChar = 'a';
        int endChar = 'c';
        String str = s.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            int charCode = str.charAt(i);

            if(charCode < startChar || charCode > endChar){
                System.out.println("The string does not contain 'a' 'b' 'c' or it is contain other symbols!");
                return;
            }
        }

        System.out.println("The string consist of 'a' 'b' 'c' symbols!");
    }
}//Дана строка. Определить, содержит ли строка только символы 'a', 'b', 'c' или нет.
