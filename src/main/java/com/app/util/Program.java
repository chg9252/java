package com.app.util;

public class Program {
    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(3);
        list.add(5);
        list.add(6);
        int size = list.size();
        System.out.printf("size: %d\n",size); // 2 -> 3

        list.clear();
        size = list.size();
        System.out.printf("clear이후size: %d\n",size); // empty -> 0

        list.add(8);
        int num = list.get(0);
        System.out.printf("num: %d\n",num); // 8
        num = list.get(1); // IndexOutOfBoundsException


    }
}
