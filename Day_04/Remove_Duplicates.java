package com.xebia.training.Day_04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Remove_Duplicates {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 2, 3, 4, 4, 6, 7, 6, 6, 5, 2, 0};
        int n=arr.length;
        Arrays.sort(arr);
        int x;
        int j = 0;
        int temp[] = new int[8];


        System.out.println("  ");
        for (int i=0; i < (arr.length - 1); i++) {

            if (arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }

//            temp[j++] = arr[n-1];
        }
        temp[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i]);
        }



    }
}


