package day3.zigzagsequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result {
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2 - 1;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}

public class ZigZagSequence {
    public static void main(String[] args) {
        Result.findZigZagSequence(new int[] {2, 3, 5, 4, 1}, 5);
    }
}
