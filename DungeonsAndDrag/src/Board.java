public class Board {
    private Square[] squares;

    public Board() {
        squares = new Square[64];
        for (int i = 0; i < 64; i++) {
            squares[i] = new Square(i);
        }
    }

    public Square getSquare(int number) {
        return squares[number];
    }
}


