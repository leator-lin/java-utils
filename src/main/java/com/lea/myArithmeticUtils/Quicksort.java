package com.lea.myArithmeticUtils;

/*partition(A, p, r) {
    pivot := A[r]
    i := p
    for j := p to r-1 do {
        if A[j] < pivot {
            swap A[i] with A[j]
            i := i+1
        }
    }
    swap A[i] with A[r]
    return i*/
public class Quicksort {
    public static void main(String[] args) {

    }

    public int partition(int[] A, int p, int r) {
        int pivot = A[r];
        int i = p;
        for(int j = p; j < r - 1; j++) {
            if(A[j] < pivot) {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
                i++;
            }
        }
        int tmp = A[i];
        A[i] = A[r];
        A[r] = tmp;
        return i;
    }
}
