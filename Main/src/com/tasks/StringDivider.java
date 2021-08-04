package com.tasks;

import javax.security.auth.callback.CallbackHandler;
import java.security.spec.ECField;

public class StringDivider implements IMainUseable, ICheckable{
    private String s;

    public StringDivider(String s){
        this.s = this.stringCheck(s);
    }

    @Override
    public void mainMethod() throws Exception {
        String[] lines = getDividedString(s, 3);
        lines = insertRandomMiddleChar(lines);
        printArrayString(lines);
    }

    private String[] getDividedString(String line, int step) throws Exception {
        if (step < 1)
            throw new Exception();

        int unit = s.length() / step;
        int len = (s.length() % step) == 0 ? unit : unit + 1;

        String[] newLines = new String[len];

        for (int i = 0; i < newLines.length; i++) {
            int startIndex = i * step;
            int endIndex = startIndex + step;

            if(endIndex < s.length())
                newLines[i] = s.substring(startIndex, endIndex);
            else
                newLines[i] = s.substring(startIndex, s.length());
        }

        return newLines;
    }
    private String[] insertRandomMiddleChar(String[] strings) throws Exception {
        String[] newArray = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            int midIndex = strings[i].length()/2; //Middle element index
            int randChar = (int)(Math.random() * 255); // Random character code
            char c = (char)randChar; //Convert code to char type

            while(strings[i].indexOf(c) != -1) {
                randChar = (int) (Math.random() * 255);
                c = (char)randChar;
            } //If the string contains this value, then values generated again

            newArray[i] = insert(strings[i], c, midIndex);
        }

         return newArray;
    }
    private String insert(String str, char insertChar, int index) throws Exception {
        if (index > str.length() - 1 || index < 0)
            throw new Exception();

        String newLine = "";

        for (int i = 0; i < str.length(); i++) {
            if (i != index)
                newLine += str.charAt(i);
            else
                newLine += insertChar;
        }

        return newLine;
    }
    private void printArrayString(String... lines){
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }

   /*     Дана строка. Разделить строку на фрагменты по три подряд идущих символа.
          В каждом фрагменте средний символ заменить на случайный символ, не
          совпадающий ни с одним из символов этого фрагмента. Показать фрагменты,
          упорядоченные по алфавиту.
    * */
}
