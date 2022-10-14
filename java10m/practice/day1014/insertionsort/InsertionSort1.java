package lionlike.java10m.practice.day1014.insertionsort;

import java.util.Arrays;

public class InsertionSort1 {
    public int[] Sort1(int[] arr){
        int i = 1;
        int temp;
        if (arr[i] < arr[i-1]) { //arr[1] < arr[0]
            temp = arr[i-1]; // 0 <-5
            arr[i-1] = arr[i];
            arr[i] = temp;

        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};

        InsertionSort1 is = new InsertionSort1();
        int[] result = is.Sort1(arr);
        System.out.println(Arrays.toString(result));
    }
}
