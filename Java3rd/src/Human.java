public class Human {

    private double height;
    private String race;
    private String gender;

    private Head head;
    private Leg leg;
    private Hand hand;

    Human(double height, String race, String gender){
        this.height = height;
        this.race = race;
        this.gender = gender;
    }

    private class Head{
        String eyeColor;
        String hairColor;
        boolean hasBeard;

        Head(String eyeColor, String hairColor, boolean hasBeard){
            this.eyeColor = eyeColor;
            this.hairColor = hairColor;
            this.hasBeard = hasBeard;
        }
    }

    private class Leg{
        double length;
        int size;

        Leg(double length, int size){
            this.length = length;
            this.size = size;
        }

    }

    private  class Hand{

        double length;

        Hand(double length){
            this.length = length;
        }
    }

    public void setHead(String eyeColor, String hairColor, boolean hasBeard){
        this.head = new Head(eyeColor, hairColor, hasBeard);
    }

    public void setLeg(double length, int size){
        this.leg = new Leg(length, size);

    }

    public void setHand(double length){
        this.hand = new Hand(length);

    }

    public String getHead() {
        return String.format("{Eye color: %s; Hair color: %s; Has beard: %b}", this.head.eyeColor, this.head.hairColor, this.head.hasBeard);
    }

    public String getLeg(){
        return String.format("{Length: %s; Size: %s}", this.leg.length, this.leg.size);

    }

    public String getHand(){
        return String.format("{Length: %s}", this.hand.length);
    }

}

