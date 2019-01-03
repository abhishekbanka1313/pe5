package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class ChangeArrayElementTest {

    ChangeArrayElement obj;
    @Before
    public void setUp() throws Exception {
        obj=new ChangeArrayElement();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void addRemoveArray() {
        ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList("Apple", "Grape", "Melon", "Berry"));
        ArrayList<String> changedFruitsList = new ArrayList<String>(Arrays.asList("Kiwi", "Grape", "Melon", "Berry"));

//        ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList( "Apple","Grape","Melon","Berry") );
//        ArrayList<String> resultList = new ArrayList<String>(Arrays.asList( "Kiwi","Grape","Melon","Berry"));
        assertEquals(changedFruitsList,obj.changingArrayElement(fruitsList));
    }
}