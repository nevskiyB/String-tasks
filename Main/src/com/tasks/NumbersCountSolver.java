package com.tasks;

public class NumbersCountSolver implements IMainUseable, ICheckable{
    private String s;

    public NumbersCountSolver(String s){
        this.s = stringCheck(s);
    }

    @Override
    public void mainMethod() throws Exception {
        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
                count++;

        System.out.println("Amount of numbers in string \"" + s + "\" is: " + count);
    }
}//В данной строке найти количество цифр.
