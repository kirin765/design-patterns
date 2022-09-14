package hello.designpatterns.bridge;

public class App2 {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillE();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.move();
    }
}
