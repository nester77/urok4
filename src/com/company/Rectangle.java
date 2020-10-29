package com.company;


public class Rectangle {

    double x;
    double y;

    private static int createdRectangles=0;

    private final static String RUSSIAN_CLASS_NAME="Прямоугольник";
    private final static String ENGLISH_CLASS_NAME="Rectangle";

    public Rectangle (double a, double b) {
        x=a;
        y=b;
        createdRectangles++;
    }

    public Rectangle (double a) {
        x=a;
        y=a;
        createdRectangles++;
    }

    double calculateArea (){
        double s=x*y;
        return s;
    }
    void printArea(){
        System.out.println(calculateArea());
    }
    void printRectangleKind(){
        if (x==y){

            System.out.println("Это квадрат");}
        else
            System.out.println("Это прямоугольник");
    }
    boolean isTheSameRectangle (Rectangle rectangle ){
        return (this.x==rectangle.x && this.y==rectangle.y) || ((this.x==rectangle.y && this.y==rectangle.x));

    }

    static void printRectanglesCount(){
        System.out.println("Всего было создано " + createdRectangles + " прямоугольника(ов)");
    }

    static void printClassName (boolean printInRussian){
        if (printInRussian)System.out.println(RUSSIAN_CLASS_NAME);
        else System.out.println(ENGLISH_CLASS_NAME);
    }

}