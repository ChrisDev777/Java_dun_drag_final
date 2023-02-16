import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(game, scanner);
        menu.run();
    }
}

