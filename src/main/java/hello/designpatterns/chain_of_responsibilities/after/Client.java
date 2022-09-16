package hello.designpatterns.chain_of_responsibilities.after;

import hello.designpatterns.chain_of_responsibilities.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("this is the request");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        AuthRequestHandler chain = new AuthRequestHandler(new LogginRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
