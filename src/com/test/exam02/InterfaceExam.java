package com.test.exam02;

interface InterfaceTest {  //실행부 사용못하고 메서드만 적음
    
        public void print1();
        public void print2();
}

class InterfaceChild implements InterfaceTest { 

    @Override
    public void print1() {
        
        System.out.println("#1 출력");

    }

    @Override
    public void print2() {
        
        System.out.println("#2 출력");
    }

}

public class InterfaceExam {

    public static void main(String[] args) {
            InterfaceChild interfaceChild = new InterfaceChild();
            interfaceChild.print1();
            interfaceChild.print2();

        }

}
