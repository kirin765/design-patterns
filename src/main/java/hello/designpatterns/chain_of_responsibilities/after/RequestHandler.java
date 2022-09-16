package hello.designpatterns.chain_of_responsibilities.after;

import hello.designpatterns.chain_of_responsibilities.Request;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
