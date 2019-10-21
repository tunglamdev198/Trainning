package com.lamnt.trainning;

import java.util.Collections;
import java.util.List;

public class Bai1 {
    // Tong n so tu nhien lien tiep tu 0 den n
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    // Sap xap day int tang dan
    public static void sort(List<Integer> list) {
        Collections.sort(list);
    }
}
