/**
 * Time : O(N) ; Space: O(1)
 * @tag : Hash Table; Two Pointers; String
 * @by  : Steven Cooks
 * @date: Jul 22, 2015
 ***************************************************************************
 * Description:
 * 
 * Given a string, find the length of the longest substring without repeating 
 * characters. For example, the longest substring without repeating letters 
 * for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest 
 * substring is "b", with the length of 1.
 * 
 ***************************************************************************
 * {@link https://leetcode.com/problems/longest-substring-without-repeating-characters/ }
 */
package _003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int lengthOfLongestSubstring(String a) {
    int maxlen=0;
    int start=0;
    Map<Character, Integer> map=new HashMap<>();
    for (int cur = 0; cur < a.length(); cur++) {
      char ch=a.charAt(cur);
      if(map.containsKey(ch)&&map.get(ch)>=start){
        start=map.get(ch)+1;
      }
      else{
        maxlen=Math.max(maxlen,cur-start+1);
      }
      map.put(ch, cur);
    }
    return maxlen;
  }

}
