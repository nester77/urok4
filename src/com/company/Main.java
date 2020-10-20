package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rect1=new Rectangle (7);
        Rectangle rect2=new Rectangle (5,3);
        Rectangle rect3=new Rectangle (8,2);

        rect1.printArea();
        rect2.printArea();
        rect3.printArea();

        rect1.printRectangleKind();
        rect2.printRectangleKind();
        rect3.printRectangleKind();

        System.out.print(rect1.isTheSameRectangle(rect2)) ;
    }
}
