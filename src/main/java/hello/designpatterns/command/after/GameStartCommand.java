package hello.designpatterns.command.after;

import hello.designpatterns.command.Game;
import hello.designpatterns.command.Light;

public class GameStartCommand implements Command{

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}
