package ru.mirea.laboratory10;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Lab10 {
    public static <E> ArrayList<E> arrayToList(E[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Null array!");
        ArrayList<E> l = new ArrayList<>(arr.length);
        for (E element : arr) {
            l.add(element);
        }
        return l;
    }

    public static void main(String[] args) {
        String[] a = new String[]{"Hello", "world", "!"};
        ArrayList<String> l = arrayToList(a);
        System.out.println(l);
        System.out.println();
    }
}
