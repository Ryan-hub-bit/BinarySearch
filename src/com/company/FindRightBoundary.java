package com.company;

public class FindRightBoundary {
    public int findRight(int[] array) {
        int n = array.length;
        int left = 0, right = n - 1;
        while(left < right) {
            int mid = left + (right - left) / 2 + 1;
            if(array[mid] < array[right]) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return array[right];
    }
}
