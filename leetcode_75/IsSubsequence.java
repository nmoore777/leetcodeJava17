package leetcode_75;

import java.util.ArrayList;

/*
given two strings s and t,
return true if s is a subsequence of t
and false if not

a subsequence of a string is a new string that is formed from
the original string by deleting some (can be none) of the
characters without disturbing the relative positions of the
remaining characters. (i.e., "ace" is a subsquence of "abcde"
while "aec" is not)

constraints:
    0 <= s.length <=100
    0 <= t.length <= 100
    s and t consist of only lowercase English letters
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        //create a set of pointers to loop through respective strings
        int s_index = 0, t_index = 0;
        //increment the s pointer when the pointer at t lands on an index with the same character
        //if we reach the end of t before the end of s bail out and should return false as default
        while (s_index < s.length() && t_index < t.length()) {
            if (s.charAt(s_index) == t.charAt(t_index))
                s_index++;
            t_index++;
        }
        //if the s pointer is equal to the array length then we know all characters have been found
        if (s_index == s.length())
            return true;
        //if we reach this point the string provided in s is not a substring of t
        return false;
    }

    public static void getIsSubsequenceSolution(){
        ArrayList<String> input_s = new ArrayList<>();
        ArrayList<String> input_t = new ArrayList<>();
        input_s.add("abc"); input_s.add("axc");
        input_t.add("ahbgdc"); input_t.add("ahbgdc");
        for(int i = 0; i < input_s.size(); i++){
            System.out.println(String.valueOf(isSubsequence(input_s.get(i),input_t.get(i))));
        }
    }
}
