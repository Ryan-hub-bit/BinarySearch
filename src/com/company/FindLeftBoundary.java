package com.company;

public class FindLeftBoundary {

    public int findLeft(int[] array) {
        int n = array.length;
        int left = 0, right = n - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(array[mid] < array[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return array[left];
    }

}
