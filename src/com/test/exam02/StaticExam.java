package com.test.exam02;

public class StaticExam {
    public static void main(String[] args) {
         Number number1 = new Number();
        // Number number2 = new Number();

        // number1.b = 3;
        // System.out.println(number2.b);


        // number1.a =5;
        // System.out.println(number2.a);

        // number1.print2();
        // Number.print1();
        number1.print2();
        
        StaticExam staticExam = new StaticExam();
        staticExam.sayHello(); // main 메소드는 static 메소드이므로 실행 즉시 인스턴스화 과정을 거치지 않고 바로 메모리에 로딩되어 실행되지만, 
                     // sayHello 메소드는 일반 메소드인 관계로 인스턴스화가 되지않으면 생성 자체가 되지 않아서 main 메소드에서 실행 불가  
    }
    
    public void sayHello() {
        System.out.println("안녕");
    }

}


    class Number {
        static int a = 0;   //  static 변수
        int b = 0;

        public static void print1() { //  static 메소드 : 인스턴스화 시킬 필요없이 바로 메모리에 로딩
            System.out.println("static method test ! ! ! ");
        }
        
        public void print2() {
            System.out.println("instance method test ! ! !");
            hello();
             }

        public void hello() {
            System.out.println("Hello~~~");
        }
       

    
         

    }