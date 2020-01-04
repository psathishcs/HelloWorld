package org.hello.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SimpleSet {
    public static void main(String[] args){
        System.out.println("Simple Set.....");
        Set<Integer> set = new HashSet<Integer>();
        SortedSet<Integer> sortedSet = new TreeSet<Integer>();

        int count[] = {34, 22,10,60,30,22};
        for (int i = 0; i< 5 ; i++)
            set.add(count[i]);
        System.out.println(set);


        sortedSet.addAll(set);
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.subSet(10, 30));
        System.out.println("...............");

    }
}
