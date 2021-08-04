package com.tasks;

public class CharCounter implements IMainUseable, ICheckable{
    private String s;

    public CharCounter(String s){
        this.s = stringCheck(s);
    }

    @Override
    public void mainMethod() {
        System.out.println(String.format("Amount of plus and minuses: %d\nAmount of characters before zeros: %d", getCountPlusAndMinus(), getCountPreviousZeroChars()));
    }
    private int getCountPlusAndMinus(){
        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '+' || s.charAt(i) == '-')
                count++;

        return count;
    }
    private int getCountPreviousZeroChars(){
        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '0' && i != 0)
                count++;

        return count;
    }
}//Дана строка. Определите общее количество символов '+' и '-' в ней. А так же сколько таких символов, после которых следует цифра ноль.
