public class Board {
    private Square[][] board;

    public Board() {
        initializeBoard();
    }

    public void initializeBoard() {
        this.board = new Square[8][8];

        // initialization commences
        
        // Black - back row
        this.board[7][0] = new Square("A8", new Rook());
        this.board[7][0] = new Square("B8", new Knight());
        this.board[7][0] = new Square("C8", new Bishop());
        this.board[7][0] = new Square("D8", new Queen());
        this.board[7][0] = new Square("E8", new King());
        this.board[7][0] = new Square("F8", new Bishop());
        this.board[7][0] = new Square("G8", new Knight());
        this.board[7][0] = new Square("H8", new Rook());

        // Black - front row
        for (int i = 0; i < 8; i++) {
            Character asciiToChar = (char)(i + 65);
            String id = asciiToChar.toString() + 7;
            this.board[1][i] = new Square(id, new Pawn());
        }

        // White - back row
        this.board[7][0] = new Square("A1", new Rook());
        this.board[7][0] = new Square("B1", new Knight());
        this.board[7][0] = new Square("C1", new Bishop());
        this.board[7][0] = new Square("D1", new Queen());
        this.board[7][0] = new Square("E1", new King());
        this.board[7][0] = new Square("F1", new Bishop());
        this.board[7][0] = new Square("G1", new Knight());
        this.board[7][0] = new Square("H1", new Rook());

        // White - front row
        for (int i = 0; i < 8; i++) {
            Character asciiToChar = (char)(i + 65);
            String id = asciiToChar.toString() + 2;
            this.board[6][i] = new Square(id, new Pawn());
        }
    }
}
