import java.util.Random;

//6510450658 Pinpawat Limsuwat

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
