package com.barmin;

/**
 * Design a custom datastructure that can store numbers like a dynamically sized array and supports all of the following operations
 * get(int index)
 * set(int idx, int value)
 * setAll(int value)
 */
/*
 * // Assuming that you named your data-structure as "CustomDS"
 * CustomDS customDS = new CustomDS();
 * customDS.set(0,100); // should set the element at index 0 to value 100
 * customDS.set(1,200); // should set the element at index 1 to value 200
 * get(0); // will return the value at index 0. in our case it will return 100
 * setAll(1000);  // should set all the elments in the datastructure to value 1000,
 *
 * get(0) -> 1000
 * set(0, 20)
 * get(0) -> 20
 * get(n) -> 1000
 */
public class CustomDS {

    private int currentSetAll = 0;
    private int[] array;
    private int[] state;

    CustomDS(int size) {
        array = new int[size];
        state = new int[size];
    }


    int get(int index) {
        if (state[index] != currentSetAll) {
            return currentSetAll;
        }
        return array[index];
    }

    void set(int index, int value) {
        array[index] = value;
        state[index] = currentSetAll;
    }


    void setAll(int value) {
        currentSetAll = value;
    }
}
