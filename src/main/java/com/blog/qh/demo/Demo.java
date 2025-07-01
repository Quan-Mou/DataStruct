package com.blog.qh.demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {


//        new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
//        ListNode listNode = reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null)))));
//        ListNode p = listNode;
//        while (null != p) {
//            System.out.println(p.val);
//            p = p.next;
//        }


        while (true) {

            System.out.println(1);
            if( 1 == 1) break;
        }

    }


    public static ListNode reverseList(ListNode head) {
        ListNode newNode = null;
        ListNode o = head;
        while (o != null) {
            newNode = new ListNode(o.val,newNode);
            o = o.next;
        }

        return newNode;
    }



//    单链表
   static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }



    public static int minSubArrayLen(int s, int[] nums) {
//        int sum = 0;
//        int len = 0;
//        int tmpIndex = 0;
//
//        int result = 0;
//        for(int i = 0;i<nums.length;i++) {
//            sum += nums[i];
//            while (sum >= target) {
//                result = i - tmpIndex + 1;
//                sum -= nums[tmpIndex++];
//
//            }
//        }
//
//        return tmpIndex == 0?0:len;


        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;



    }


    public  static  int searchInsert(int[] nums, int target) {

        int i = 0;
        int insertPosition = 0;
        while(true) {

            if(i >= nums.length) {
                if(insertPosition == 0) {
                    return i;
                }
                return insertPosition;
            }
            if(nums[i] == target) {
                return i;
            }

            if(target < nums[i]) {
                if(insertPosition == 0) {
                    insertPosition = i;
                }
            }

            i++;
        }
    }


    public static boolean isValid(String s) {
        return false;
    }


    /**
     *     /
     *        杨辉三角
     *        @param numRows
     *        @return
     *       /
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {

            List<List<Integer>> list = new ArrayList<>();
            if(numRows == 1) {
                List<Integer> val = new ArrayList<>();
                val.add(1);
                list.add(val);
                return list;
            }

//            for(int i = 0;i<numRows;i++) {
//                new
//            }

            return null;
    }

    /**
     *     /
     *        爬楼梯
     *        @param n
     *        @return
     *       /
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
            if(n <= 1){
                return 1;
            }
            return climbStairs(n - 1) + climbStairs(n - 2);
        }


    /**
     *   /
     *        最后一个单词的长度
     *        @param s
     *        @return
     *       /
     * @param s
     * @return
     */
    public static  int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        while(len >= 0 && s.charAt(len) == ' '){
            len--;
        }
        if(len < 0) {
            return 0;
        }
        int start = len;
        while(start >= 0 && s.charAt(start) != ' ') {

            start--;

        }
        return len - start;
    }








    public static int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        for (; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[left + 1] = nums[right];
                left++;
            }
        }
        return left + 1;
    }

}
