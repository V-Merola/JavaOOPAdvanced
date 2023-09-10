package AbstractClasses;

public class Circle extends Shape {
    public Circle(double height, double width) {
        super(height, width);
    }

    public double calculateArea(){
        double area = Math.PI * Math.pow((getHeight() / 2), 2);
        return area;
    }
}
