/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */

package ucf.assignments;

import java.util.List;
import java.util.Scanner;

public class Item extends ItemList {

    //declare itemTitle String attribute
    String itemTitle;

    //constructor: create class parameter: itemTitle String
    public Item() {
        //assign parameter to ucf.assignments.Item class attribute
        this.itemTitle = itemTitle;
    }

    public void editItemTitle() {
        //Scanner input
        Scanner input = new Scanner(System.in);
        //this.itemTitle assigned to input
        this.itemTitle = input.nextLine();
    }

}
