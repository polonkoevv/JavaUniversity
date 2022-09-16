public class Circle extends Shape{

    private double radius;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2d * radius * Math.PI;
    }

    public String toString(){
        return String.format("{Color: %s, isFilled: %b, Radius: %f, Area: %.2f, Perimeter: %.2f}", color, filled, this.radius ,this.getArea(), this.getPerimeter());
    }
}
