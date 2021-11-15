/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

package ucf.assignments;

import java.util.Scanner;

public class Completion {

    //declare completion boolean attribute
    boolean completion;
    //constructor: create class parameter: completion boolean variable
    public Completion(boolean completion) {
        //assign parameter to ucf.assignments.Completion class attribute
        this.completion = completion;
    }
    
    public void editCompletion() {
        //Scanner input
        Scanner input = new Scanner(System.in);
        //this.completion assigned to input
        this.completion = input.nextBoolean();
    }

}
