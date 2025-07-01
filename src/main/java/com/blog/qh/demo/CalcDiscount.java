package com.blog.qh.demo;


import java.util.ArrayList;

/**
 * 1475. 商品折扣后的最终价格
 * https://leetcode.cn/problems/final-prices-with-a-special-discount-in-a-shop?envType=problem-list-v2&envId=stack

 */
public class CalcDiscount {

    public int[] finalPrices(int[] prices) {
        /***
         i 可以得到与 数组里某个元素的的折扣，前提满足：这个元素下标大于i，并且这个元素小于 [i] 这个元素。


         看了半天终于看明白了,就是找到当前值后面第一个小于等于当值的数,并相减放入结果队列


         输入：prices = [8,4,6,2,3]
         输出：[4,2,4,2,3]
         */

        ArrayList<Integer> disCountAfterPrice = new ArrayList<>();
        int[] disCount = new int[prices.length];



        for(int i = 0;i<prices.length;i++) {
            for(int j = i+1;j<prices.length;j++) {
//                System.out.println("hello");
                if(prices[i]>=prices[j]) {
//                    disCountAfterPrice.add(prices[i] - prices[j]);

                    disCount[i] = prices[i] - prices[j];
                    break;
                }

                if(j == prices.length -1) {
//                    disCountAfterPrice.add(prices[i]);
                    disCount[i] = prices[i];
                }
//                else {
//                    disCountAfterPrice.add(prices[i]);
//                }
//                System.out.println("i:" + i + ";" + "j" + j);
            }
//          最后一个元素，没有折扣，直接原价
            if(i == prices.length -1) {
//                disCountAfterPrice.add(prices[i]);
                disCount[i] = prices[i];
            }

        }

        System.out.println(disCountAfterPrice);
//        return disCountAfterPrice;
          return disCount;
    }
    public static void main(String[] args) {
        CalcDiscount calcDiscount = new CalcDiscount();
//        new int{8,4,6,2,3};
//        int[] number = ;


        System.out.println(calcDiscount.finalPrices(new int[]{8, 4, 6, 2, 3}));
        System.out.println(calcDiscount.finalPrices(new int[]{1, 2, 3, 4, 5}));
        System.out.println(calcDiscount.finalPrices(new int[]{10, 1, 1, 6}));


    }


}
