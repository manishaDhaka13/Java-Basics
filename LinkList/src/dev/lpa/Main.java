package dev.lpa;

import java.util.LinkedList;

public class Main {
    // An ArrayList is implement on top of array , behind the scene the address of value in ArrayList is stored
    // in Array

    // LinkedList is a doubly linked list
    // both implement list method but linkedList also implements the Queue and Stack method as well
    // queue is FIFO structure
    // stack is LIFO structure
    // in stack the the first top element of Stack is first element of LinkedList
    // we have to import java.util.LinkedList to use LinkedList
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

          placesToVisit.add("sydney");  // add to end of list
          placesToVisit.add(0,"Canberra");
          System.out.println(placesToVisit);
          addMoreElements(placesToVisit);
          System.out.println(placesToVisit);
         removeElements(placesToVisit);
         System.out.println(placesToVisit);
         addMoreElements(placesToVisit);
         System.out.println(placesToVisit);
         geetingElements(placesToVisit);
    }

    // LinkedList method

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Drawin");  // only on LinkedList not on ArrayList
        list.addLast("Hobart");

        // Queue Method
        list.offer("Melbourne");   // add to end of Linkedlist
        list.offerFirst("Brisbane"); // add to start of Linkedlist
        list.offerLast("Toowoomba");  // add to end of Linkedlist

        // Stack method

        list.push("Alice Springs");  // add element to start of list

    }
    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1= list.remove(); // no argument only on LinkedList  // remove first element in LinkedList //  remove element from start of LinkedList // return remove element
       System.out.println(s1 + " was removed");
       System.out.println(list);
        String s2= list.removeFirst(); // remove first element
        System.out.println(s2 + " was removed");
        System.out.println(list);
        String s3= list.removeLast(); // remove last element
        System.out.println(s3 + " was removed");
        System.out.println(list);

        // Queue / Deque poll methods

        String p1 = list.poll();  // remove the first element
        System.out.println(p1 + " was removed");
        System.out.println(list);
        String p2 = list.pollFirst();  // remove the first element
        System.out.println(p2 + " was removed");
        System.out.println(list);
        String p3 = list.pollLast();  // remove the last element
        System.out.println(p3 + " was removed");

        // pushing the element
        list.push("Sydeny");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        // pop method
        String p4 = list.pop(); // remove first element
        System.out.println(p4+ " was removed");
        System.out.println(list);
    }
    private static void geetingElements(LinkedList<String> list){
        System.out.println(" 5th element of list "+list.get(4));
        System.out.println("First Element = "+list.getFirst());   // LinkedList method to get first element
        System.out.println("Last element = "+list.getLast());     // LinkedList method to get last element

        System.out.println("Darwin is at position "+ list.indexOf("Darwin"));
        System.out.println("Darwin is at position "+ list.indexOf("Melbourne"));

        //  Queue retrieval method FIFO

        System.out.println("Element from element() = "+ list.element());    // list.element() retrieve/get  starting element
        System.out.println(list);

        // Stack retrieval Method LIFO

        System.out.println(" Element from peek() = " + list.peek());   // list.peek() get element from start of LinkedList
        System.out.println(" Element from peekFirst() = "+ list.peekFirst());
        System.out.println(" Element from peekLast() = " + list.peekLast());   // last element of LinkedList
    }
}