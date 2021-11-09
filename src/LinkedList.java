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
    public void addNumbers() {
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        int num=0;
        for (int j = 1; j<=i; j++) {
            System.out.println("Enter " + j + " number");
            num = sc.nextInt();

            Node newNode = new Node(num);      //Creating new node
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
    }
    /*
    * Prime numbers generated are in Descending order converting into Ascending order using sortList Method
    * */
    public void sortNumbers()
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