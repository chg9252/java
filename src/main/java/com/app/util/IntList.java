package com.app.util;

public class IntList {

    private int[] nums;
    private int current;


    public IntList() {
        nums = new int[3];
        current = 0;
    }


    public void add(int num) {
        nums[current] = num;
        current++;
    }

    public void clear() {
/*
        for (int i = 0; i < current; i++) {
           nums[i] = 0;
           [4][3][1][6]
        }
         nums = new int[3];
*/
        current = 0;
    }

    public int size() {
        return current;
    }

    public int get(int index) {
        if(index>=current)
            throw new IndexOutOfBoundsException();
        return nums[index];
    }
}
