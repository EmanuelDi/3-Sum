package com.practice;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ThreeSum {

    public static int count(int[] a) {
        int objective = 0;
        int n = a.length;
        int count = 0;
        Arrays.sort(a);


        for (int i = 0; i <= n-2; i++) {

            if (i > 0 && a[i] == a[i-1]) {
                System.out.println("primer if");
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = a[i] + a[left] + a[right];
                System.out.println( a[i] + " " + a[left] + " " + a[right] + " " + sum);
                if (sum == objective) {
                    count++;

                    while (left < right && a[left] == a[left+1]) {
                        left++;
                        System.out.println(left + " left");
                    }

                    while (left < right && a[right] == a[right-1]) {
                        right--;
                        System.out.println(right + " right");
                    }

                    left++;
                    right--;
                    System.out.println("R " + right);
                    System.out.println("L " + left);
                    System.out.println("I" + i);
                } else if (sum < objective) {
                    left++;
                } else {
                    right--;
                }

            }

        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = StdIn.readAllInts();
        StdOut.println(count(nums));
    }
}
