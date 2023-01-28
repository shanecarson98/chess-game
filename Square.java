public class Square {
    private String id;

    private Piece piece;

    public Square(String id, Piece piece) {
        this.id = id;
        this.piece = piece;
    }

    public boolean isSquareOccupied() {
        return this.piece != null;
    }
    
    public String getId() {
        return this.id;
    }
}
