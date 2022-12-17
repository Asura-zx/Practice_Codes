//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.

package AbstractionPractice;
abstract class Shape{
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape{
    void RectangleArea(double length, double breadth){
        System.out.println(length*breadth);
    }
    void SquareArea(double side){
        System.out.println(side*side);
    }
    void CircleArea(double radius){
        System.out.println(Math.PI*radius*radius);
    }
}
public class absPrac6 {
    public static void main(String[] args) {
        Area area=new Area();
        area.RectangleArea(5, 5);
        area.SquareArea(4);
        area.CircleArea(1);
    }    
}
