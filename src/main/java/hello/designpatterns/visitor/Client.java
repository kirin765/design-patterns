package hello.designpatterns.visitor;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.accept(new Phone());
    }
}
