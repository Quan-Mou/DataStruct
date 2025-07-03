package com.blog.qh.demo;


import java.util.HashSet;
import java.util.Set;

/**
 *3. 无重复字符的最长子串
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters
 */
public class MaxLenSubStr {

    public static void main(String[] args) {
//        "abcabcbb"
        MaxLenSubStr maxLenSubStr = new MaxLenSubStr();
//        maxLenSubStr.lengthOfLongestSubstring("abcabcbb");
        maxLenSubStr.lengthOfLongestSubstring2("abcabcbb");
//        maxLenSubStr.lengthOfLongestSubstring2("vpwwkew");
    }


    public int lengthOfLongestSubstring2(String s) {

        Set<Character> window = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            // 打印当前窗口状态
            System.out.println("\n当前 right 指向: '" + c + "'，窗口: " + s.substring(left, right));
            System.out.println("当前 Set: " + window);

            // 如果遇到重复字符，缩小窗口
            while (window.contains(c)) {
                System.out.println("重复字符 '" + c + "'，移除 '" + s.charAt(left) + "'，left 从 " + left + " → " + (left + 1));
                window.remove(s.charAt(left));
                left++;
            }

            window.add(c);
            int currentLen = right - left + 1;
            if (currentLen > maxLen) {
                maxLen = currentLen;
                System.out.println("✨ 更新最大长度为 " + maxLen + "，当前最长子串为：" + s.substring(left, right + 1));
            }

            right++;
        }

        System.out.println("\n✅ 最终结果：最长不重复子串长度为 " + maxLen);
        return maxLen;

    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

}
