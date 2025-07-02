package com.blog.qh.demo;


/**
 * 2. 两数相加
 * https://leetcode.cn/problems/add-two-numbers
 *
 * 核心是 %10、/10 进位那部分
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class OneNumAdd {

    public static void main(String[] args) {
        OneNumAdd oneNumAdd = new OneNumAdd();
//        ListNode l1 = new ListNode();
//
//        l1.val= 2;
//        ListNode l2 = new ListNode();
//        l2.val = 4;
//        ListNode l3 = new ListNode();
//        l3.val = 3;
//
//        l1.next = l2;
//        l2.next = l3;
//
//        ListNode a1 = new ListNode();
//        a1.val= 5;
//        ListNode a2 = new ListNode();
//        a2.val = 6;
//        ListNode a3 = new ListNode();
//        a3.val = 4;
//
//        a1.next = a2;
//        a2.next = a3;

//        l1 = [2,4,3], l2 = [5,6,4]
//        linkedListAdd.addTwoNumbers(l1,a1);
//        linkedListAdd.addTwoNumbers2(l1,a1);

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);


        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        oneNumAdd.addTwoNumbers(l1,l2);

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode temp = result;


        int sum = 0;
        int carry = 0;
        while(l1 != null || l2 != null) {
            if(l1 != null) {
                sum+=l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum+=l2.val;
                l2 = l2.next;
            }

            ListNode listNode = new ListNode(sum % 10);
            sum  = sum >=10 ? 1 :0;
            temp.next = listNode;
            temp = temp.next;
        }


        class ListNode {
            int val;
            OneNumAdd.ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, OneNumAdd.ListNode next) { this.val = val; this.next = next; }
        }

        if(sum == 1) {
            temp.next = new OneNumAdd.ListNode(sum);
        }

        return result.next;

    }




     static class ListNode {
      int val;
      ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
