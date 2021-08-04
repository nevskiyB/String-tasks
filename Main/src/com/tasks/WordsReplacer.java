package com.tasks;

public class WordsReplacer implements IMainUseable, ICheckable{
    private String s;

    public WordsReplacer(String s){
        this.s = this.stringCheck(s);
    }

    @Override
    public void mainMethod(){
        int startIndex = 0;
        String str = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str);

        while(true){
            startIndex = stringBuilder.indexOf("word", startIndex);

            if(startIndex >= 0){
                stringBuilder.delete(startIndex, startIndex + 4);
                stringBuilder.insert(startIndex, "letter");
                startIndex += 6;
            } else {
                break;
            }
        }

        System.out.println(String.format("New string is:\n\"%s\"", stringBuilder.toString()));
    }

}//Замените в строке все вхождения 'word' на 'letter'.
