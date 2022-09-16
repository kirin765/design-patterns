package hello.designpatterns.chain_of_responsibilities.after;

import hello.designpatterns.chain_of_responsibilities.Request;

public class LogginRequestHandler extends RequestHandler{
    public LogginRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("logging--");
        super.handle(request);
    }
}
