public class Player {
    private String playerId;
    PlayingSide side;

    enum PlayingSide {
        WHITE,
        BLACK
    }

    public Player(String playerId, int playingSide) {
        this.playerId = playerId;
        PlayingSide[] values = PlayingSide.values();
        this.side = playingSide == 2 ? values[(int)(Math.random() + 0.1)] : values[playingSide];
    }

    public Player.PlayingSide getPlayingSide() {
        return this.side;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    @Override
    public String toString() {
        return playerId;
    }
}