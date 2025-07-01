package com.blog.qh.demo;


import java.util.ArrayList;
import java.util.Queue;

/**
 *  232. 用栈实现队列
 * https://leetcode.cn/problems/implement-queue-using-stacks?envType=problem-list-v2&envId=stack
 * 栈：先进后出
 * 队列：先进先出
 */
class MyQueue {

    private ArrayList<Integer> queue = new ArrayList();

    public MyQueue() {

    }


    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        return queue.remove(0);
    }
    
    public int peek() {
        return queue.get(0);
    }
    
    public boolean empty() {
       return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */