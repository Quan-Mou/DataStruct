package com.blog.qh.demo;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: 权某人
 * @create: 2025-06-26 09:14
 * @Description: 66. 加一
 * https://leetcode.cn/problems/plus-one/description/
 */
public class SumOne {

    public static void main(String[] args) {
        SumOne sumOne = new SumOne();
//        for (int i : sumOne.plusOne(new int[]{1, 2, 3})) {
//            System.out.println(i);
//        }
        sumOne.plusOne1(new int[]{1,0,9,9});


//        String str = "123";
//        Integer number = 123;
//        System.out.println(number.toString().charAt(0));
//        System.out.println((Integer.parseInt(String.valueOf(number.toString().charAt(0)))));


    }


    public int[] plusOne(int[] digits) {

        //            [1,2,3,4]
//            [9]
//            [9,9,9,9]
//            [1,0,9,9] -> [1,1,0,0]

        for(int i = digits.length-1; i>=0;i--) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public int[] plusOne1(int[] digits) {
        for(int i = digits.length -1 ; i >= 0;i--){
            //跳出循环的情况是当前数组元素的值不是9，也就是不再需要进位的情况

            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            //如果到这说明当前元素的值9，所以直接将当前的值设为0，因为9+1=10，末尾0，需要继续参与循环
            digits[i] = 0;
        }
        //到这说明整个数组都是9，其实主要是第一位是9，也就是数组需要扩张，这里有个比较巧妙的小地方吧，不用指定其他位置的值，因为初始化后的数组，所有的值都是0，只需要在第一位设置为1，也就是原来如果是9999，新数组就是10000,，其他位默认为0
        int temp[] = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
