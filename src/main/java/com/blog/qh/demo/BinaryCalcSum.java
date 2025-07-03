package com.blog.qh.demo;

/**
 * @author: 权某人
 * @create: 2025-07-03 19:05
 * @Description: 二进制求和
 *
 * https://leetcode.cn/problems/add-binary
 */
public class BinaryCalcSum {


    public static void main(String[] args) {
        BinaryCalcSum binaryCalcSum = new BinaryCalcSum();

        binaryCalcSum.addBinary("11","11");

    }
//    输入:a = "11", b = "1"
    public String addBinary(String a, String b) {

        int sum = 0;
        StringBuilder result = new StringBuilder();
//          11   11
//          01   11
//         100  110

        for(int i = a.length() - 1,j = b.length() - 1; i >= 0 || j >= 0;i--,j--) {
            sum += i>=0 ? a.charAt(i) - '0' : 0;
            sum += j>=0 ? b.charAt(j) - '0' : 0;
            result.append(sum % 2);
            sum = sum / 2;
        }

        result.append(sum == 1 ? "1" : "");
       return result.reverse().toString();
    }


}
