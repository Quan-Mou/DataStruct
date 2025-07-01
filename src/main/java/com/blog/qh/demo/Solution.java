package com.blog.qh.demo;

import java.util.ArrayList;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> val = new ArrayList<>();
        for(int i = 0;i<operations.length;i++) {
            switch(operations[i]) {
                case "+" :
                    if(val.size() >= 2) {
                        Integer current = val.get(val.size() - 1);
                        Integer pre = val.get(val.size() - 2);
                        val.add(current + pre);
                    }
                break;
                case "D" :
                    val.add(val.get(val.size() - 1) * 2);
                    break;
                case "C" :
                    if(val.size() >= 1) {
                        val.remove(val.size() -1);
                    }
                    break;
                default :
                    val.add(Integer.parseInt(operations[i]));
                    break;

            }
        }


        int sum = 0;
        for (Integer integer : val) {
            sum += integer;
        }

        return sum;
    }


    public static void main(String[] args) {
        Integer[] temp = new Integer[1000];
        temp[0] = 1;
        temp[1] = -10;
//
        String[] opers  = {"5","2","C","D","+"};
        Solution solution = new Solution();
        System.out.println(solution.calPoints(opers));

    }

}



