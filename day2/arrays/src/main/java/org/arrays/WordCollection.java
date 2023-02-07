package org.arrays;

public class WordCollection {
    private String[] someWords;

    public WordCollection(){
        this.someWords = new String[5];
    }
    public int getWordCount(){
        return this.someWords.length;
    }

    public void add(String word){
        this.someWords[0] = word;
    }
}
