public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setRadius(3);

        System.out.println(c1.getRadius());
        System.out.println(c1.getCircLength());
        System.out.println(c1.getCircleS());
        System.out.println(c1.getDiameter());

        c1.setDiameter(7);

        System.out.println(c1.getRadius());
        System.out.println(c1.getCircLength());
        System.out.println(c1.getCircleS());
        System.out.println(c1.getDiameter());

    }

}
