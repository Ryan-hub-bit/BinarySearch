package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here


        int[] arr = {1, 2, 3, 4, 5, 6};
        StandardBS sbs = new StandardBS();
        int index3 = sbs.findTarget(arr, 3);
        System.out.println(index3);

        int[] arr2 = {3, 4, 5, 1, 2};
        FindLeftBoundary flb = new FindLeftBoundary();
        int min = flb.findLeft(arr2);
        System.out.println(min);

        FindRightBoundary frb = new FindRightBoundary();
        int max = frb.findRight(arr2);
        System.out.println(min);
    }

}
