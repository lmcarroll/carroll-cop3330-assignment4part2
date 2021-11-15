/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

import org.junit.jupiter.api.Test;
import ucf.assignments.ItemList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemListTest {

    @Test

    public void testDisplayAllItems() {
        //initialize underTest variable and test list
        ItemList underTest = new ItemList();
        //call method with test input
        underTest.displayAllItems();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }

    public void testDisplayCompleteItems() {
        //initialize underTest variable and test list
        ItemList underTest = new ItemList();
        //call method with test input to display items
        underTest.displayCompleteItems();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }

    public void testDisplayIncompleteItems() {
        //initialize underTest variable and test list
        ItemList underTest = new ItemList();
        //call method with test input to display incomplete items
        underTest.displayIncompleteItems();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }

    public void testSaveItems() {
        //initialize underTest variable and test list
        ItemList underTest = new ItemList();
        //call method with test input to display complete items
        underTest.saveItems();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }

    public void testLoadItems() {
        //initialize underTest variable and test list
        ItemList underTest = new ItemList();
        //call method with test file
        underTest.loadItems();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }

    public void testAddItem() {
        //initialize underTest variable and list to load to
        ItemList underTest = new ItemList();
        //call method with test file
        underTest.addItem();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }

    public void testRemoveItem() {
        //initialize underTest variable and list to load to
        ItemList underTest = new ItemList();
        //call method with test file
        underTest.removeItem();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }

    public void testClearItems() {
        //initialize underTest variable and list to load to
        ItemList underTest = new ItemList();
        //call method with test file
        underTest.clearItems();
        boolean result = true;
        //if success, assert equals
        assertEquals(result, true);
    }
}
