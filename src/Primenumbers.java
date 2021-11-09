import java.util.Scanner;

public class Primenumbers {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();             //Creating object of LinkedList class
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime numbers from 1 to 1000 are: ");
        list.prime();                                       //Generating prime numbers by calling prime() method in LinkedList
        list.sortList();                                 //Sorting generated prime numbers
        list.show();                                    //printing prime numbers after sorting
    }
}
