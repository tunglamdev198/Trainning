package com.lamnt.trainning;

import java.util.*;

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

    public static int getFirstCharacter(String s, char character) {
        return s.indexOf(character);
    }

    public static int getLastCharacter(String s, char character) {
        return s.lastIndexOf(character);
    }

    public static int getCharAt(String s, char character, int n) {
        int length = s.length();
        int index = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == character) {
                count++;
                if (count == n) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static String genStringFromList(List<String> strings) {
        return String.join(",", strings);
    }

    public static List<String> genListFromString(String s) {
        String[] arrResult = s.split(",");
        List<String> result = Arrays.asList(arrResult);
        return result;
    }

    public static char findCharacterMostAppear(String s) {
        HashMap<Character, Integer> filter = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (!filter.containsKey(s.charAt(i))) {
                filter.put(s.charAt(i), 1);
            } else {
                int a = filter.get(s.charAt(i));
                filter.put(s.charAt(i), a + 1);
            }
        }
        List<Integer> integers = new ArrayList<>();
        for (Map.Entry<Character, Integer> map : filter.entrySet()) {
            integers.add(map.getValue());
        }
        char result = 0;
        int max = Collections.max(integers);
        System.out.println("" + max);
        System.out.println(integers.toString());
        for (Map.Entry<Character, Integer> map : filter.entrySet()) {
            if (map.getValue() == max) {
                result = map.getKey();
            }
        }
        return result;
    }

    public static HashMap<String, Integer> getAllSubString(String s) {
        HashMap<String, Integer> result = new HashMap<>();
        int length = s.length();
        String sb = "";
        for (int i = 0; i < length - 1; i++) {
            sb += s.charAt(i);
            for (int j = i + 1; j < length; j++) {
                sb += s.charAt(j);
                if (sb.length() != length) {
                    if (!result.containsKey(sb)) {
                        result.put(sb, 1);
                    } else {
                        int a = result.get(sb);
                        result.put(sb, a + 1);
                    }
                }
            }
            sb = "";
        }
        return result;
    }

    public static String replaceString(String s, String from, String to) {
        return s.replace(from, to);
    }
}
