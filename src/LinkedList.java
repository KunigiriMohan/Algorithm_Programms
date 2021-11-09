import java.util.Scanner;

class LinkedList {

    Node head;
    Node tail;
    /*
     * show() method to show elements present in Linked List
     * */
    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public void prime(){
        int maxNumber= 1000;

        System.out.println("List of the prime number between 1 - " + maxNumber);

        for (int num = 2; num <= maxNumber; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true ) {
                //Node temp = head;
                Node newNode = new Node(num);      //Creating new node
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                }
                else
                {
                    newNode.next = head;
                    head = newNode;
                }
            }
        }
    }
    /*
    * Prime numbers generated are in Descending order converting into Ascending order using sortList Method
    * */
    public void sortList()
    {

        // Node current will point to head
        Node currentNode = head;
        Node nextNode = null;

        int temp;

        if (head == null)
        {
            return;
        }
        else
        {
            while (currentNode != null)
            {
                // nextNode will point to node next to
                // currentNode will point to current Node
                nextNode = currentNode.next;

                while (nextNode != null)
                {
/*
* If currentNode node's data is greater than nextNode node data, swap the data between them
 */
                    if (currentNode.data > nextNode.data)
                    {
                        temp = currentNode.data;
                        currentNode.data = nextNode.data;
                        nextNode.data = temp;
                    }
                    nextNode = nextNode.next;
                }
                currentNode = currentNode.next;
            }
        }
    }
}