package com.stackroute.unittest.pe5;
import java.util.*;
import java.io.*;
import java.util.*;

public class ChangeArrayElement {

    public ArrayList<String> changingArrayElement(ArrayList<String> fruitsList) {

        for (int i = 0; i < fruitsList.size(); i++) {
            if (fruitsList.get(i).equalsIgnoreCase("Apple")) {
                fruitsList.set(i, "Kiwi");
            }
        }
        return fruitsList;
    }
}
