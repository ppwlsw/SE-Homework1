import java.util.Scanner;

class MGame {
    private int roundCnt;
    private Die[] dice;
    private Board board;
    private Player[] players;
    private int numPlayer;
    private Scanner input = new Scanner(System.in);
    private int totalRounds;

    public MGame(Die[] dice, int numPlayers, int totalRounds) {
        this.dice = dice;
        this.numPlayer = numPlayers;
        this.players = new Player[numPlayers];
        this.board = new Board();
        this.roundCnt = 0;
        this.totalRounds = totalRounds;
        playerInit(numPlayers);
    }

    private void playerInit(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Player %d name: ", (i + 1));
            String name = input.nextLine();
            players[i] = new Player(name, board, dice);
        }
    }

    public void playGame() {
        for (; roundCnt < totalRounds; roundCnt++) {
            System.out.printf("\n==== Round %d ====\n", roundCnt + 1);

            playRound();
        }
    }

    private void playRound() {
        for (Player player : players) {
            System.out.printf("\n--------- %s's Turn ---------\n", player.getName());

            player.takeTurn();
        }
    }
}
