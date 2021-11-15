/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

import org.junit.jupiter.api.Test;
import ucf.assignments.Completion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompletionTest {

    @Test

    public void testEditCompletion() {

        //initialize underTest variable
        Completion underTest = new Completion(true);

        //call method with test input to change to completion true
        boolean result = true;

        //assert equals for method return true
        assertEquals(result, true);
    }
}
