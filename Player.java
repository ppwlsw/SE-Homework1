//6510450658 Pinpawat Limsuwat


class Player {
    private String name;
    private Board board;
    private Piece piece;
    private Die[] dice;

    public Player(String name, Board board, Die[] dice) {
        this.name = name;
        this.board = board;
        this.piece = new Piece();
        this.piece.setLocation(board.getSquares()[0]);
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public void takeTurn() {
        int fvTotal = 0;
        System.out.printf("Player %s rolls the dice!\n", name);

        for (Die die : dice) {
            int faceValue = die.roll();
            System.out.printf("Rolled a %d\n", faceValue);
            fvTotal += faceValue;
        }
        System.out.printf("Total FaceValue is %d\n", fvTotal);

        Square oldLoc = this.piece.getLocation();
        Square newLoc = this.board.getSquare(oldLoc, fvTotal);
        this.piece.setLocation(newLoc);

        System.out.printf("%s moved %d squares!\n", name, fvTotal);
        System.out.printf("%s's old location: %s\n", name, oldLoc.getName());
        System.out.printf("%s's new location: %s\n", name, newLoc.getName());
        System.out.println();
    }
}
