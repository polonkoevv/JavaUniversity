public class Circle {
    private double circLength;
    private double radius;
    private double diameter;
    private double circleS;

    Circle(){
        System.out.println("Object has been created.\n" +
                "ATTENTION: If you change one of the circle parameters, " +
                "the rest will change automatically. ");
    }

    public void setCircLength(double circLength) {
        this.circLength = circLength;
        this.radius = circLength / 2.0 * Math.PI;
        this.diameter = this.radius*2;
        this.circleS = Math.PI * Math.pow(this.radius,2);
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.circLength = 2 * radius * Math.PI;
        this.diameter = radius*2;
        this.circleS = Math.PI * Math.pow(radius,2.0);
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter/2.0;
        this.circLength = 2 * this.radius * Math.PI;
        this.circleS = Math.PI * Math.pow(this.radius,2.0);
    }

    public void setCircleS(double circleS) {
        this.circleS = circleS;
        this.radius = Math.sqrt(circleS / Math.PI);
        this.diameter = this.radius * 2.0;
        this.circLength = 2 * this.radius * Math.PI;
    }

    public double getCircLength() {
        return circLength;
    }

    public double getCircleS() {
        return circleS;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }
}

