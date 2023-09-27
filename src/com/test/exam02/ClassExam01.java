package com.test.exam02;

import com.test.member.Member;

public class ClassExam01 {   // 하나의 자바 파일내에 여러개의 클래스가 있을 경우엔 파일명과 같은 클래스가 반드시 있어야 하고 
    // 그 클래스에만 public을 붙일 수 있음
    public static void main(String[] args) {
        /* 
        Sum sum1 = new Sum();   // 클래스 참조형 변수 선언 및 정의 --> 인스턴스화  
        System.out.println(sum1);
        System.out.println(sum1.sumA);
        System.out.println(sum1.sumB);
         sum1.sumA = 3;
         sum1.sumB = 4;
        System.out.println(sum1.sumA);
        System.out.println(sum1.sumB);
        
    
        Sum sum2 = new Sum();
        System.out.println(sum2);
        System.out.println(sum1 == sum2);

        sum2.sumA =13;
        sum2.sumB =15;
        */

        Sum sum = new Sum();
        sum.setSumA(3);
        sum.setSumB(4);

         System.out.println("Sum 클래스의 멤버변수 sumA =  " + sum.getSumA());
         System.out.println("Sum 클래스의 멤버변수 sumA =  " + sum.getSumB());
         
         Member member = new Member("김철수", "남성",34);
        //  member.Setname("김철수");
        //  member.Setgender("남성");
        //  member.Setage(34);
         System.out.println("이름 : " + member.getname() + "\t" + "성별 : " + member.getgender() + "\t" + "나이 : " + member.getage());



         new Member(); // 익명 객체 생성
         new Member("김민수");

         

        // System.out.println("Sum 클래스의 멤버변수 b =  " + sum.b);
        // System.out.println("4와 5의 합은 " + sum.sum(4,5) + "입니다.");
    }
    
}

class Sum {  // 객체의 속성과 액션을 코드화한 템플리트(틀)
     int sumA;   // 멤버변수
     int sumB;   // 멤버변수


    public int getSumA() {     // 이러한 네이밍 규칙으로 private 멤버변수의 값을 가져오는 메소드를 getter 메소드라고 함.
        return this.sumA; // this 자신이 속한 클래스...
    }
    
    public void setSumA (int sumA) {     // Setter 메소드
        this.sumA = sumA;
    }

    public int getSumB() {
            return this.sumB;
    }

    public void setSumB(int sumB) {
        this.sumB = sumB;
    }
 

    public int sum(int a, int b) {
        final int k = 3;
        System.out.println(k);
        return a + b;
    }
}
