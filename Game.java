import java.io.File;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Lettuce Commence the game!!");
        System.out.println("Which side will you be getting it in on: 0 --> Black,  1 --> White, 2 --> Random");

        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int res = scan.nextInt();
            Player user = new Player("User", res);
            System.out.println(user.toString() + " will be playing " + user.getPlayingSide().toString());

            int playingSide = 0;
            if (user.getPlayingSide() == Player.PlayingSide.BLACK) {
                playingSide = 1;
            }

            Player cpu = new Player("CPU", playingSide);

            System.out.println(cpu.toString() + " will be playing " + cpu.getPlayingSide().toString());

            Board board = new Board();
            System.out.println("Board has been initialized, White goes first...");

            // Turn based

        }



    }
}