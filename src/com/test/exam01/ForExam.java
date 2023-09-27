package com.test.exam01;

public class ForExam {
    public static void main(String[] args) {
        
        int a = 3;
        if(a > 5)  {
            System.out.println("5보다 크네요...");
            System.out.println("값이 뭔가요?");
        }
          else if (a>3) {
            System.out.println("3보다 크네요...");
          System.out.println("값이 뭔가요?");
          }
            else if (a > 2)
            { System.out.println("2보다 크네요...");
            System.out.println("값이 뭔가요?");
        }
        int b;
        b = a==3?5:6;
        System.out.println("b의 값은 " + b + "입니다.");
        
        int c = 4;
        char d = 'A';

        switch(a) {
            case 3: System.out.println("3입니다.");
            break; // 조건에 맞으면 블록에서 빠져 나옴
            case 4: System.out.println("4입니다.");
            // break; 
            default: System.out.println("무슨 값인지 모르겠습니다."); // 생략가능
        }

        ///////////// 반복문 예제 ////////////////////////////

        int i = 0;
        int sum = 0;
        for(i =0; i<=100; i++) {
            sum = sum+i;
        }
        System.out.println("\n" + "#1 for문을 이용하여 1부터 100까지 합 구하기 #1 = " + sum);  

        sum = 0;
        for(i=0; i<=100; sum+= i++);
        System.out.println("\n" + "#1 for문을 이용하여 1부터 100까지 합 구하기 #2 = " + sum);

        //while(true) {
            i = 0; sum = 0;
        while(true) {
            sum += i ++;
            if(i<= 100) continue;
            else break;

        }
      System.out.println("\n" + "#1 while문을 이용하여 1부터 100까지 합 구하기 #2 = " + sum);

      // do - while문 : do {} while (조건)
      i=0; sum = 0; 
      do {
        sum += i++;
      }while(i<=100);
         System.out.println("\n" + " do - while 문을 이용하여 1부터 100까지 합 구하기 #2 = " + sum);
    }
}
