//A dynamic array is the one where we don't have to worry about the size of the array
package com.DSA.Arrays;

public class DynamicArray {

    private int nextIndex;
    private int[] array;

    public DynamicArray() {
        array = new int[5];
        nextIndex = 0;
    }

    public int getNextIndex() {
        return nextIndex;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public int size() {
        return nextIndex;
    }

    public void add(int element) {
        if (nextIndex == array.length) {
            restructure();
        }
        array[nextIndex] = element;
        nextIndex++;


    }

    private void restructure() {
        if (nextIndex == array.length) {
            int[] temp = array;
            array = new int[2 * array.length];
            for (int i = 0; i < temp.length; i++) {
                array[i] = temp[i];
            }
        }

    }

    public void set(int index, int value) {

        if (index > nextIndex)
            return;
        if (index < nextIndex) {
            array[index] = value;

        } else
            add(value);

    }

    public int get(int index) {
        if (index <= nextIndex)
            return array[index];
        else
            return -1;
    }

    public int removeLast(){
        int temp=array[nextIndex-1];
        array[nextIndex]=0;
        nextIndex--;
        return temp;

    }

}
