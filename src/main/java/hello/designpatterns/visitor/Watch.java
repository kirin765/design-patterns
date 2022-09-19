package hello.designpatterns.visitor;

public class Watch implements Device{
    @Override
    public void print(Circle circle) {
        System.out.println("print circle on Watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle on Watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print trianble on Watch");
    }
}
