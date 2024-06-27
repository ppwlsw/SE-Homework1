import java.util.ArrayList;

class Board {
    private static final int TOTAL_SQUARES = 40;
    private Square[] squares;

    public Board() {
        squares = new Square[TOTAL_SQUARES];
        for (int i = 0; i < TOTAL_SQUARES; i++) {
            squares[i] = new Square("" + i);
        }
    }

    public Square[] getSquares() {
        return squares;
    }

    public Square getSquare(Square oldLoc, int fvTotal) {
        int oldLocation = Integer.parseInt(oldLoc.getName());
        int newLocation = (oldLocation + fvTotal) % TOTAL_SQUARES;
        return squares[newLocation];
    }
}