package leetcode_75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
given two string s and t, determine if they isomorphic
two strings s and t are isomorphic if the characters in s can be replaced
to get t
all occurances of a character must be replaced with another character while
preserving the order of characters.
no two characters may map to the same character, but a character may map to itself

1 <= s.length <= 5 * 10^4
t.length == s.length
s and t consist of any valid ascii character
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        //if the length of the two strings does not match they are not isomorphic
        if (s.length() != t.length())
            return false;
        //create hash maps for each string
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        //loop through the strings and map the chars to each other
        for (int i = 0; i < s.length(); i++) {
            //grab a char from both strings at the same index
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //if the maps for s and t do not already contain the character at current index, add them to the map
            //if they do contain the character check to make sure that the value associated with the key stored
            //matches the character in the opposing string
            //if the value does not match the char at the current index of the opposing string
            //the strings are not isometric
            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (tMap.containsKey(tChar)) {
                    return false;
                }
                sMap.put(sChar, tChar);
                tMap.put(tChar, sChar);
            }
            //if we are able to iterate through both strings and not bail out
            //the strings must be isomorphic
        }
        return true;
    }

    public static void getIsomorphicStringsSolution(){
        ArrayList<String> input_s = new ArrayList<>();
        ArrayList<String> input_t = new ArrayList<>();
        input_s.add("egg"); input_s.add("foo"); input_s.add("paper");
        input_t.add("add"); input_t.add("bar"); input_t.add("title");

        for(int i = 0; i < input_s.size(); i++){
            boolean answer = IsomorphicStrings.isIsomorphic(input_s.get(i),input_t.get(i));
            System.out.println(String.valueOf(answer));
        }
    }

}
