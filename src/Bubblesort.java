import java.util.Scanner;

public class Bubblesort {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();             //Creating object of Linked List
        System.out.print("Enter How many numbers we need to sort : ");
        list.addNumbers();                              //Calling addNumbers() method to add numbers to LinkedList.
        list.sortNumbers();                             //Calling sortNumbers() method to sort given numbers.
        System.out.print("The numbers after Sorting : ");
        list.show();                                    //Calling show() method to show elements in Linked List after sorting.
    }
}