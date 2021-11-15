/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

package ucf.assignments;

import java.util.Scanner;

public class DueDate {

    //declare dueDate String attribute
    String dueDate;
    //constructor: create class parameter: dueDate String
    public DueDate() {
        //assign parameter to ucf.assignments.DueDate class attribute
        this.dueDate = dueDate;
    }

    public void editDueDate() {
        //Scanner input
        Scanner input = new Scanner(System.in);
        //this.itemTitle assigned to input
        this.dueDate = input.nextLine();
    }

}
