package com.example.my_dictonary;

import java.util.HashMap;

public class DictonaryUsingHashmap {

    HashMap<String,String> dictionary;
    public DictonaryUsingHashmap()
    {
        dictionary= new HashMap<String,String>();
        addListOfWords();
    }


    public boolean addWord(String Word, String meaning)
    {
        dictionary.put(Word, meaning);
        return true;
    }

    public String FindMeaning (String word)
    {
        if(!dictionary.containsKey(word))
        {
            return "Given word not found";
        }
        else return dictionary.get(word);
    }
    private void addListOfWords (){
        addWord("God","The Supreme Person who possess all Opulances");
    }
}
