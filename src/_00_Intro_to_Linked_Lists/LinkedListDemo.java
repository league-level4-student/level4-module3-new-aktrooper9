package _00_Intro_to_Linked_Lists;

import java.util.ArrayList;

public class LinkedListDemo {

    public static void main(String[] args) {

        /*
         * A LinkedList is a linear data structure, but unlike an ArrayList or
         * Array the data is not stored in contiguous memory locations.
         * 
         * Instead, each data node contains a reference that says where the next
         * node can be found.
         * 
         * Note: In the Node example provided there is also reference that
         * points back to the previous node. This is a referred to as a
         * doubly-linked list.
         * 
         * 1. Read through the LinkedList and Node classes.
         * 
         * 2. Create a LinkedList of any type you like.
         * 
         * 3. Try using some LinkedList methods to add, remove and print a few
         * elements.
         * 
         * 4. Save the head or tail reference into a Node Object and use
         * references to traverse through the list and perform an operation on
         * every element then print the list to see if it worked.
         * 
         * e.g. Multiply every element by something in a LinkedList containing
         * Integer nodes or make word upper case in a LinkedList containing
         * String nodes.
         * 
         */
    	LinkedList<Double> list = new LinkedList<Double>();
list.add(1.2);
list.add(1.4);
list.add(1.5);
list.add(1.3);
list.print();
//list.remove(2);
list.print();
Node<Double> node=list.getHead();
while(node!=list.getTail()) {
	double num= node.getValue();
	num=num*3;
	node.setValue(num);
	node=node.getNext();
}
double num= node.getValue();
num=num*3;
node.setValue(num);
list.print();
    }

}
