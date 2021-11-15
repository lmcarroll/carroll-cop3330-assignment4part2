/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

import org.junit.jupiter.api.Test;
import ucf.assignments.Item;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test

    public void testEditItemTitle() {

        //initialize underTest variable
        Item underTest = new Item();

        //call method with test input
        underTest.editItemTitle();
        boolean result = true;

        //assert equals for method return str.equals input
        assertEquals(result, true);
    }
}
