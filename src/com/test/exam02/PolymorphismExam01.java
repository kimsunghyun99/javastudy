package com.test.exam02;

class Animal {
    public void move() {   //  가상 메소드
        // System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다");
    }

}

class Tiger extends Animal {
    @Override
     public void move() {
        System.out.println("호랑이가 네발로 걷습니다.");
    }

}

class Eagel extends Animal {
     @Override
     public void move() {
        System.out.println("독수리가 하늘을 납니다.");
     }

}

// 다형성은 하나의 코드가 여러 자료형으로 구현되어 실행되는 것을 말함
// 즉 , 같은 코드에서 여러 실행 결과가 나오는 것을 의미함
public class PolymorphismExam01 {
    public static void main(String[] args) {

        PolymorphismExam01 animalTest = new PolymorphismExam01();
        animalTest.moveAnimal1(new Human());
        animalTest.moveAnimal1(new Tiger());
        animalTest.moveAnimal1(new Eagel());
        
        

        // 여기서 메모리에 로딩되어 실행 , Animal 클래스를 메모리내에 생성하고 그 생성된 메모리의 주소를 인자로 넘겨 준다. 
        // 인자로 클래스를 전달하기 위해서 메모리에 클래스를 생성하여야 하는데 이를 위해서 
        // new 지시어와 생성자를 사용한다.

    }

    public void moveAnimal1(Animal animal) {  // 메서드의 틀만 만들어져 있는 것임.
        animal.move();
    }


}


