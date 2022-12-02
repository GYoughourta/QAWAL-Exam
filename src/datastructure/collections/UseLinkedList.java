package datastructure.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        //that includes add elements
        list.add("jugu");
        list.add("amer");
        list.add("jack");

        //that includes remove elements
        list.remove(2);

        //for loop (2) and (3) while loop with Iterator to retrieve and print out data
        System.out.println("with for loop");
        for (int i= 0; i<list.size();i++ )
            System.out.println(list.get(i));

        Iterator<String> it = list.iterator();
        System.out.println("with while loop");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
