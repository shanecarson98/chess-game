public class Piece {
    private String name;
    private String shortName;

    public Piece(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() {
        return this.name;
    }

    public String getShortName() {
        return this.shortName;
    }
}
