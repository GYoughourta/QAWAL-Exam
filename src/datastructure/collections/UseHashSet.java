package datastructure.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseHashSet {

    /*
     *
     * demonstrate how to use HashSet that includes add,remove elements
     * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
     * use for each loop to print out data
     * print out the number of the elements of your HashSet
     *
     */

    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();
        int count = 0;
        //add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(1);
        list.add(0);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(9);
        list.add(8);
        //use for each loop to print out data
        Iterator<Integer> it = list.iterator();
        System.out.println("out data is: ");
        while (it.hasNext())
            System.out.println(it.next());

        //print out the number of the elements of your HashSet
        System.out.println("the number of the elements "+list.size());





    }
}
