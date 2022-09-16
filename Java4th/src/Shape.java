public abstract class Shape {

    protected String color ;
    protected boolean filled;

    Shape(){}

    Shape(String color, boolean filled){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    public String toString(){
        return String.format("{Color: %s, isFilled: %b}", color, filled);}
}
