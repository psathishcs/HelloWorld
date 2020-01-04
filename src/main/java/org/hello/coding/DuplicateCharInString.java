package org.hello.coding;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String text = "Java is a programming language";

        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] chars = text.toCharArray();
        for(Character ch : chars){
            if (dupMap.containsKey(ch)) {
                dupMap.put(ch, dupMap.get(ch) +1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        dupMap.forEach((k, v) -> System.out.println(k + " : " + v ));
    }
}
