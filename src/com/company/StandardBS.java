package com.company;

public class StandardBS {
    public int findTarget(int[] array, int target) {
        int n = array.length;
        int left = 0, right = n -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(array[mid] == target) {
                return mid;
            } else if(array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
