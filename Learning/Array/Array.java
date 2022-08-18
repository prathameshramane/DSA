package Learning.Array;

import java.util.Arrays;

public class Array {
    int[] items;
    int size = 0;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int number) {

        if (size >= items.length) {
            int[] newItems = new int[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[size++] = number;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        for (int i = index + 1; i < items.length; i++) {
            items[i - 1] = items[i];
        }

        size--;
    }

    public int indexOf(int number) {
        for (int i = 0; i < items.length; i++) {
            if (number == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }
}
