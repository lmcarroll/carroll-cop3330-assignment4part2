/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

import org.junit.jupiter.api.Test;
import ucf.assignments.DueDate;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DueDateTest {

    @Test

    public void testEditDueDate() {

        //initializes underTest variable
        DueDate underTest = new DueDate();

        //call method with test input
        underTest.editDueDate();
        int result = 1;

        //assert equals for method return str.equals input
        assertEquals(result, true);
    }
}
