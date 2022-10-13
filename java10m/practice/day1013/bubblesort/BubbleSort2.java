package lionlike.java10m.practice.day1013.bubblesort;

import java.util.Arrays;

public class BubbleSort2 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
//            int tem = arr[0];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        BubbleSort2 bb2 = new BubbleSort2();
        int[] result =bb2.sort(arr);
        System.out.println(Arrays.toString(result));


    }
}


