package hello.designpatterns.chain_of_responsibilities;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
