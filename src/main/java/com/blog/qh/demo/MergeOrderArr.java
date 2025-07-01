package com.blog.qh.demo;

/**
 * @author: 权某人
 * @create: 2025-06-26 15:17
 * @Description:
 *
88. 合并两个有序数组
https://leetcode.cn/problems/merge-sorted-array?envType=problem-list-v2&envId=array
 */
public class MergeOrderArr {


    public static void main(String[] args) {
        MergeOrderArr mergeOrderArr = new MergeOrderArr();
        mergeOrderArr.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {

//       1.先合并为一个数组
        for(int i = m, j = 0; i<(m+n); i++, j++) {
            nums1[i] = nums2[j];
        }
//       2.冒泡排序
//        [2,1]
        for(int i = 0;i<nums1.length;i++) {
            for(int j = i+1;j<= nums1.length - 1;j++) {
                if(nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }

    }








}
