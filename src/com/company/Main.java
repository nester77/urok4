package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rect1=new Rectangle (7);
        Rectangle rect2=new Rectangle (5,3);
        Rectangle rect3=new Rectangle (8,2);
        Rectangle rect4=new Rectangle (2,8);

        rect1.printArea();
        rect2.printArea();
        rect3.printArea();
        rect4.printArea();

        rect1.printRectangleKind();
        rect2.printRectangleKind();
        rect3.printRectangleKind();
        rect4.printRectangleKind();

        System.out.println(rect1.isTheSameRectangle(rect2)) ;
        System.out.println(rect2.isTheSameRectangle(rect3)) ;
        System.out.println(rect3.isTheSameRectangle(rect4)) ;
    }
}
