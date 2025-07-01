package com.blog.qh.demo;

import java.util.ArrayList;

/**
 * @author: 权某人
 * @create: 2025-06-30 18:05
 * @Description:
 * https://leetcode.cn/problems/add-two-numbers
 */
public class LinkedListAdd {

    public static void main(String[] args) {
        LinkedListAdd linkedListAdd = new LinkedListAdd();
        ListNode l1 = new ListNode();
        l1.val= 2;
        ListNode l2 = new ListNode();
        l2.val = 4;
        ListNode l3 = new ListNode();
        l3.val = 3;

        l1.next = l2;
        l2.next = l3;

        ListNode a1 = new ListNode();
        a1.val= 5;
        ListNode a2 = new ListNode();
        a2.val = 6;
        ListNode a3 = new ListNode();
        a3.val = 4;

        a1.next = a2;
        a2.next = a3;

//        l1 = [2,4,3], l2 = [5,6,4]
//        linkedListAdd.addTwoNumbers(l1,a1);
        linkedListAdd.addTwoNumbers2(l1,a1);

    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        // l1 = reverse(l1);
        // l2 = reverse(l2);
        int t=0;
        ListNode head = new ListNode();
        ListNode cur = head;
        while(l1!=null || l2!=null) {
            if(l1!=null) {
                t += l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                t += l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(t%10);
            t = t/10;
            cur = cur.next;
        }
        if(t!=0) {
            cur.next = new ListNode(t%10);
        }
        cur = head.next;
        head=null;
        return cur;
    }




    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1Str = new StringBuilder();
        StringBuilder l2Str = new StringBuilder();
        int l1Sum = 0;
        int l2Sum = 0;
        while(l1 != null || l2 != null) {
            if(l1!= null) {
                l1Str.append(l1.val);
                l1Sum+=l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                l2Str.append(l2.val);
                l2Sum += l2.val;
                l2 = l2.next;
            }
        }

        int totalSum = l1Sum + l2Sum;


        String l1reverse = l1Str.reverse().toString();
        String l2reverse = l2Str.reverse().toString();

        String addResult = (Long.parseLong(l1reverse) + Long.parseLong(l2reverse)) + "";

        StringBuilder additionAfter = new StringBuilder();
        for(int i = addResult.length() -1; i>=0;i--) {
            char c = addResult.charAt(i);
            additionAfter.append(c);
        }

        ListNode result = null;
        ListNode temp = null;

        for(int i = 0;i<additionAfter.length();i++) {
            int val = additionAfter.charAt(i) - '0';

            ListNode listNode = new ListNode(val);
            if(result == null) {
                result = listNode;
                temp = listNode;
            }
            else {
                temp.next = listNode;
                temp = listNode;
            }
        }

        return result;
    }

      static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
