package hello.designpatterns.visitor;

public class Phone implements Device{
    @Override
    public void print(Circle circle) {
        System.out.println("print circle on phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle on phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print trianble on phone");
    }
}
