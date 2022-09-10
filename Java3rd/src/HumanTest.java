public class HumanTest {
    public static void main(String[] args) {
        Human person = new Human(187, "european", "male");

        person.setHead("Brown", "Black", true);
        person.setHand(90.0);
        person.setLeg(100.0, 40);

        System.out.println(person.getHead());
        System.out.println(person.getHand());
        System.out.println(person.getLeg());
    }
}
