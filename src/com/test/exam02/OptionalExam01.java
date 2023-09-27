package com.test.exam02;

import java.util.Optional;

/*
 * 
 *   Option 객체란? 
 *   - Null Point Exception 에러를 방지하기 위한 wrapper 클래스 
 * 
 * 
 * 
 * 
 * 
 */

public class OptionalExam01 {
    public static void main(String[] args) {


        String str1 = null;
        String str2 = "010-2222-3333";

        String phoneNumber = str1 == null? "NO": str1.replace("-", "");

        //  String phoneNumber = Optional.ofNullable(str1).orElse("NO");

        //  if(phoneNumber.equals("NO")) {
        //     phoneNumber = "잘못된 번호";
        //     System.out.println("고객에게 전화번호 제대로 입력하라고 얘기하세요");
        //  }


     
        // String phoneNumber = str1.replace("-", "");
        System.out.println("전화번호 = " + phoneNumber);

      

        // try {
        //     if(str2.equals(str1)) {
        //     System.out.println("str1과 str2가 같네요");
        //      }
        // } catch(NullPointerException e) {
        //     System.out.println("str2가 null이네요...");
        // }
    
            

    }
    
}
