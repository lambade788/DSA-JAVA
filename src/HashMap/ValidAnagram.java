package HashMap;

import java.util.HashMap;

public class ValidAnagram {
    static HashMap<Character, Integer> makefre(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int frequency = mp.get(ch);
                mp.put(ch, frequency + 1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        HashMap<Character,Integer> mp1= makefre(a);
        HashMap<Character,Integer> mp2= makefre(b);

        return mp1.equals(mp2);

    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> mp = makefre(s);

        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);

            if (!mp.containsKey(ch)) return false;

            int currFreq = mp.get(ch);
            mp.put(ch, currFreq - 1);
        }
        for (Integer i : mp.values()) {
            if (i != 0) return false;
        }

        return true;
    }
}
