package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MoreList {
    public static void main(String[] args){
        String[] items ={"apples","bananas", "milk", "eggs"};

        List<String> list = List.of(items);   // List.of() is a static method on List ; it's a factory(return new instance) method that returns a List of String element back
            // List.of()  this method transfer array of String to List of String
        System.out.println(list);    //[apples, bananas, milk, eggs]
        // List is not ArrayList

        System.out.println(list.getClass().getName());  //java.util.ImmutableCollections$ListN
                                                       // list is a imuttable list // we can't add item in it
       // list.add("yogurt");  // Exception in thread "main" java.lang.UnsupportedOperationException

        // but we can create ArrayList using List
        // ArrayList is mutable

        ArrayList<String> groceries = new ArrayList<>(list);  // it will take the element of list and make a ArrayList of item
                                                               // now ArrayList is mutable so we can add element in it (resize it)
        groceries.add("yogurt");
        System.out.println(groceries);

        System.out.println(groceries.getClass().getName());   //java.util.ArrayList

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","muserd","cheese")
        );

        System.out.println(nextList);
        groceries.addAll(nextList);   // adding ArrayList nextList to ArrayList grocerries
        System.out.println(groceries);   // [apples, bananas, milk, eggs, yogurt, pickles, muserd, cheese]
    }
}
