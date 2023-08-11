abstract class Shape {
int numSides;  
Shape(int numSides)
 {
     this.numSides = numSides;
 }
abstract double getArea();
abstract double getPerimeter();
}
class Rectangle extends Shape {
     double width;
     double height;
    
Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }
    
     double getArea() {
        return width * height;
    }
    
     double getPerimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
     double width;
     double height;
    
    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }
    
     double getArea() {
        return 0.5 * width * height;
    }
    
    public double getPerimeter() {
        
        return 0;
    }
}

public class week1_Postlab1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Triangle tri = new Triangle(3, 6);
        
        System.out.println("Rectangle area: " + rect.getArea());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter());
        System.out.println("Triangle area: " + tri.getArea());
        System.out.println("Triangle perimeter: " + tri.getPerimeter());
    }
}