package com.tasks;

/**
 * Class for print string task.
 * @version 0
 * @author Nevskiy Boris
 * @see IMainUseable
 */
public class PrintStrings implements IMainUseable, ICheckable{
    private String s;
    /**
     * Initialize input {@link String}
     * @param {@link String}
     * @see IMainUseable
     */
    public PrintStrings(String s){
        this.s = stringCheck(s);
    }

    /**
     * Print string 3 times and shows string length
     * @see IMainUseable#mainMethod()
     */
    @Override
    public void mainMethod() {
        for (int i = 0; i < 3; i++)
            System.out.print(s + (i < 2 ? ", " : " " + s.length()));
    }
}//Дана строка. Вывести ее три раза через запятую и показать количество символов в ней.
