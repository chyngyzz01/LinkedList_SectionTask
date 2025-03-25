package tasks_with_methods;

import java.util.Arrays;
import java.util.LinkedList;

public class Linked_List {

    public static void taskLinkedList(LinkedList<String> linkedList){
        //task 1 - get first element
        System.out.println("1 - linkedList.getFirst() = " + linkedList.getFirst());

        //task 2 - get last element
        System.out.println("2 -linkedList.getLast() = " + linkedList.getLast());

        //task 3 - get contains element in list
        System.out.println("3 - linkedList.contains(\"Alcha\") = " + linkedList.contains("Alcha"));

        //task 4 - add list to list
        String[] array = linkedList.toArray(new String[0]);
        System.out.println("4 - array = " + Arrays.toString(array));

        //task 5 - equals arrays
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("Alma", "Almurut", "Alcha", "Abrikos"));
        System.out.println("5 - linkedList.equals(array) = " + linkedList.equals(linkedList2));

        //task 6 - is empty list
        System.out.println("6 -linkedList.isEmpty() = " + linkedList.isEmpty());

        //task 7 - change list element
        System.out.println("7 - linkedList.set(3, \"Sliva\") = " + linkedList.set(3, "Sliva"));
        System.out.println(linkedList);

    }




}
