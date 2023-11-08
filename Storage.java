package ru.vasilyev.egor;

import java.util.ArrayList;

public class Storage {
    private ArrayList<String> quoteList;
    Storage() {
        quoteList = new ArrayList<>();
        quoteList.add("Начинать всегда стоит с того, что сеет сомнения. \n\n Борис Стругацкий.");
        quoteList.add("80% успеха - это появиться в нужном месте в нужное время.\n\n Вуди Аллен");
        quoteList.add("Мы должны признать очевидное: понимают лишь те,кто хочет понять.\n\n Бернар Вербер");
    }

    String getRandQuote()
    {
        int randValue = (int) (Math.random() * quoteList.size());
        return quoteList.get(randValue);
    }
}
