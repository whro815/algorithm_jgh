package com.jgh.test.article.article_2023.article_3;

public class ex_1 {
    public static void main(String[] args) {
        A b = new B();  // B의 객체
        b.paint();
        b.draw();
        // 출력값 : BDCDD
    }
}

class A {
    public void paint() {
        System.out.print("A");
        draw();
    }
    public void draw() {
        System.out.print("B");  // 위치 1
        draw();                 // B 클래스의 draw()
    }
}

class B extends A {
    public void paint() {
        super.draw();          // A 클래스의 draw()
        System.out.print("C"); // 위치 3
        this.draw();           // B 클래스의 draw()
    }
    public void draw() {
        System.out.print("D"); // 위치 2, 4, 5
    }
}