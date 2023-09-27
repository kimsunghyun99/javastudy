package com.test.exam01;

public class Pyramid {
    public static void main(String[] args) {
        
        int num = 10;
        System.out.println("왼쪽에서 오른쪽으로 *이 하나씩 증가");

        for(int i =0; i<num; i++) {
            for(int j =0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("오른쪽에서 왼쪽으로 *이 하나씩 증가");
        
        for(int i=0; i<num; i++) {
            for(int j=num; j>=num-i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        



    }

        
    
    
}
