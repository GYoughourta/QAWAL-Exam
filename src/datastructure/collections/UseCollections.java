package datastructure.collections;

import java.util.*;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */

    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};


        Set<Integer> result = new HashSet<>();
        //1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
        for (int c : array1) {
            if(!result.contains(c)){
                result.add(c);
            }
        }

        for (int c : array2) {
            if(!result.contains(c)){
                result.add(c);
            }
        }
        System.out.println("union of the two arrays: "+result);


        //find the intersection of the two arrays. output: [0, 1, 3, 4]

        Set<Integer> result2 = new HashSet<>();
        Set<Integer> inter = new HashSet<>();

        for (int c : array1) {
            result2.add(c);
        }
        for (int c : array2) {
            if (result2.contains(c)) {
                inter.add(c);
            }
        }
        System.out.println("the intersection of the two arrays: "+inter);

        //find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
        Set<Integer> def = new HashSet<>();
        for (int c: result) {
            if (!inter.contains(c)) {
                def.add(c);
            }
        }
        System.out.println("difference of the two arrays is: "+def);
        result2.clear();
        result.clear();
        inter.clear();
        def.clear();
        

    }

}
