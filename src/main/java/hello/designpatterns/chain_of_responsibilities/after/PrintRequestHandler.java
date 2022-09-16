package hello.designpatterns.chain_of_responsibilities.after;

import hello.designpatterns.chain_of_responsibilities.Request;

public class PrintRequestHandler extends RequestHandler{
    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
