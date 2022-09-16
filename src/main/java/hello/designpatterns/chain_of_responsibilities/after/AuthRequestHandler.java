package hello.designpatterns.chain_of_responsibilities.after;

import hello.designpatterns.chain_of_responsibilities.Request;

public class AuthRequestHandler extends RequestHandler{
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("auth okay?");
        super.handle(request);
    }
}
