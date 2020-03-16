package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(stringToInteger("1000"));

    }

    //input a string and return the integer
    public static int stringToInteger(String s) {
        if (s == "" || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int sign = 1;
        int ans = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1, len);
        } else if(s.charAt(0) == '+') {
            sign = 1;
            s = s.substring(1, len);
        }
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] < 48 || a[i] > 57) {
                return 0;
            }
            ans = ans * 10 + a[i] - 48;
        }
        ans *= sign;

        return ans;
    }
}



