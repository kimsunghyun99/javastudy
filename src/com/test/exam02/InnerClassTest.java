package com.test.exam02;

public class InnerClassTest {
    public static void main(String[] args) {
        
    
    OutClass outClass = new OutClass(); // 1. 내부클래스를 인스턴스화 시킨다. 클래스변수 outClassㅇ 정의

    // OutClass의 내부 클래스인 InClass를 인스턴스화해서 메모리에 생성하고 그 클래스 변수 이름을 inClass라고함.
    OutClass.InClass inClass = outClass.new InClass(); // 1에서 만든 외부클래스 변수 new 내부 클래스명생성자
    inClass.inTest();
    outClass.usingClass();

    System.out.println("inClass.inNum = " + inClass.inNum);

    }
}


class OutClass{

private int num = 10;  // outclass의 멤버변수
private static int sNum = 20; // outclass의 멤버변수
private InClass inClass; // outclass의 멤버변수 

public OutClass() {     // outclass의 생성자
	inClass = new InClass(); // 내부 클래스를 인스턴스화 시켜 outclass가 인스턴스화해서 생성될때 같이 생성되도록 함
}


// outclass의 메소드
public void usingClass() {
		inClass.inTest();
    }

// outclass의 내부클래스
class InClass{

int inNum = 100;  // outclass의 내부 클래스인 inclass의 멤버변수

void inTest() {
	System.out.println("외부 클래스의 인스턴스 변수 : " + num);
	System.out.println("외부 클래스의 정적 변수 : " + sNum);
}
	}
	

}
