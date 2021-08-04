package com.main;

import com.tasks.*;


//Tasks form: http://www.itmathrepetitor.ru/prog/zadachi-na-stroki/

/**
 * Program entry point
 */
public class Main {
    public static void main(String[] args) {
        IMainUseable stringTaskSolver = new WordsReplacer("Words consist of letters!");
        try {
            stringTaskSolver.mainMethod();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }
}
