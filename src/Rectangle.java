public class Rectangle {

    double x;
    double y;

    public Rectangle (double a, double b) {
        x=a;
        y=b;
    }

    public Rectangle (double a) {
        x=a;
        y=a;
    }

    double calculateArea (){
        double s=x*y;
        return s;
    }
    void printArea(){
        System.out.println(calculateArea());
    }
    void printRectangleKinde(){
        if (x==y){

            System.out.println("Это квадрат");}
        else
            System.out.println("Это прямоугольник");
    }
    boolean isTheSameRectangle (Rectangle rectangle ){
        return this.x==rectangle.x && this.y==rectangle.y;

    }


}
