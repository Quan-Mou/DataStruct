package com.blog.qh.demo;

import java.util.Objects;

public class StackDemo {


    public static void main(String[] args) {
        boolean bracket = isBracket("()");
        System.out.println(bracket?"true":"false");
    }

   public static boolean isBracket(String s) {
        if(Objects.isNull(s)) {
            return false;
        }
       String[] ss =  s.split("");
       String first = String.valueOf(s.charAt(0));
       String last = ss[ss.length - 1];

       int index = 0;
       int startIndex = 0;

       while (index >= s.length()) {
           if(ss[startIndex].equals(")")) {
               if(startIndex == 0) {
                   return false;
               }
               return true;


           }else if (ss[startIndex].equals("]")) {
               if(startIndex == 0) {
                   return false;
               }
               return true;
           }else if(ss[startIndex].equals("}")) {
               if(startIndex == 0) {
                   return false;
               }
               return true;
           }
           startIndex++;
           index++;
       }
       return false;
//
//       if(first.equals(")")) {
//           if(last)
//           return false;
//       } else if (first.equals("]")) {
//           return false;
//       } else if (first.equals("}")) {
//           return false;
//       }
//       return true;
   }


}
