/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

package ucf.assignments;

import java.util.Scanner;

public class Description {

    //declare description String attribute
    String description;
    //constructor: create class parameter: description String
    public Description() {
        //assign parameter to ucf.assignments.Description class attribute
        this.description = description;
    }

    public void editDescription() {
        //Scanner input
        Scanner input = new Scanner(System.in);
        //this.description assigned to input
        this.description = input.nextLine();
    }

}
