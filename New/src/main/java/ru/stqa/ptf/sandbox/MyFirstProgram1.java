package ru.stqa.ptf.sandbox;



public class MyFirstProgram1 {
    public static void main (String[] args){

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь квадрата со стороной " + r.a + " и " + r.b + " = " + r.area());


    }
}
