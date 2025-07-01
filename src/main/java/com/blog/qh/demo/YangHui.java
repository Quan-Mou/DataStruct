package com.blog.qh.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 权某人
 * @create: 2025-06-28 15:47
 * @Description:
 */
public class YangHui {


    public static void main(String[] args) {
//        List<List<Integer>> data = new ArrayList<>();
//        ArrayList<Integer> one = new ArrayList<Integer>();
//        one.add(1);
//        data.add(one);
//
//        ArrayList<Integer> tow = new ArrayList();
//        tow.add(1);
//        tow.add(1);
//        data.add(tow);
//        System.out.println(one);
//        System.out.println(data);

        YangHui yangHui = new YangHui();
        yangHui.generate(5);


    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> data = new ArrayList<>();
        for(int i = 0;i<numRows;i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0;j<=i;j++) {
                if(i == 0 || i == 1 || j == i || j == 0) {
                    row.add(1);
                } else {
                    row.add(data.get(i-1).get(j)  + data.get(i-1).get(j-1));
                }
            }
            data.add(row);
        }
        return data;
    }

}
