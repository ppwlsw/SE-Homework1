import java.util.Random;

class Die {
    private int faceValue;
    private Random rand;

    public Die() {
        rand = new Random();
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int roll() {
        faceValue = rand.nextInt(6) + 1;
        return faceValue;
    }
}
