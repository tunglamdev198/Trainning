package com.lamnt.trainning;

import java.util.Arrays;
import java.util.List;

public class StringExam {
    public static int countCharacter(String s, char character) {
        int count = 0;
        s = s.toLowerCase();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }

    public static char getFirstCharacter(String s) {
        return s.charAt(0);
    }

    public static char getLastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static char getCharAt(String s, int n) {
        return s.charAt(n);
    }

    public static String genStringFromList(List<String> strings) {
        int size = strings.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                sb.append(strings.get(i));
            } else {
                sb.append(strings.get(i)).append(",");
            }
        }
        return sb.toString();
    }

    public static List<String> genListFromString(String s) {
        String[] arrResult = s.split(",");
        List<String> result = Arrays.asList(arrResult);
        return result;
    }

    public static String replaceString(String s, String from, String to) {
        return s.replace(from, to);
    }
}
