/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Liam Carroll
 */


package ucf.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemList {
    //declare List of items attribute
    List<Item> listOfItems = new ArrayList<>();

    //constructor: create class parameter: List of items
    public ItemList() {
        this.listOfItems = listOfItems;
    }

    //assign parameter to ucf.assignments.ItemList class attribute

    public void displayAllItems() {
        //print List this.items into GUI
        System.out.println(Arrays.toString(this.listOfItems.toArray()));
    }

    public void displayCompleteItems() {
        //for 'i = 0' is less than length of List this.items (i++),
        //if indexed item at i within list has a subclass within the ucf.assignments.Item
        //class ucf.assignments.Completion where boolean completion is equal to integer value zero,
        //print this.item into GUI
        for (int i = 0; i < 100; i++) {
            //if item is complete at index 'i', print in GUI
            }
        }
    }

    public void displayIncompleteItems() {
        //for 'i = 0' is less than length of List this.items (i++),
        //if indexed item at i within list has a subclass within the ucf.assignments.Item
        //class ucf.assignments.Completion where boolean completion is equal to integer value zero,
        //print this.item into GUI
        for (int i = 0; i < 100; i++) {
            //if item is incomplete at index 'i', print in GUI
            }
    }

    public void saveItems() {
        //prints this.ucf.assignments.ItemList items to inputted file
    }

    public List loadItems() {
        //initialize new List as "loadedItemList"
        List<Item> loadedItemList = new ArrayList<>();

        //reads inputted file and returns all Items through "loadedItemList"

        return loadedItemList;
    }

    public void clearItems() {
        //removes all items from list
        listOfItems.clear();
    }

    public void addItem() {
        //initialize new item
        Item blank = new Item();

        //adds blank item to list
        listOfItems.add(blank);
    }

    public void removeItem() {
        //removes given item from list
        listOfItems.remove(itemTitle);
    }
}
