package com.company;

public class Main {
    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
