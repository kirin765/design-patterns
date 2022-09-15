package hello.designpatterns.proxy;

public class DefaultGameService implements GameService{
    @Override
    public void startGame(){
        System.out.println("Game Start");
    }
}
