import java.util.*;

//6510450658 Pinpawat Limsuwat

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many players? (2-8): ");
        int numPlayer = input.nextInt();
        if (numPlayer >= 2 && numPlayer < 9) {
            System.out.print("How many rounds? : ");
            int numRound = input.nextInt();
            Die[] dice = {new Die(), new Die()};
            MGame mgame = new MGame(dice, numPlayer, numRound);
            mgame.playGame();
        } else {
            System.err.println("Invalid number of players (requires between 2-8 players)");
            System.exit(0);
        }
        input.close();
    }
}
