public class Square extends Rectangle{
    Square(){}

    Square(double side){
        this.width = side;
        this.length = side;
    }



    Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    public void quake(){
        System.out.println(this.toString());
    }
}