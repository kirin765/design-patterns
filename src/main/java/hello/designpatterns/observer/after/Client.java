package hello.designpatterns.observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("11");
        User user2 = new User("22");

        chatServer.register("ss", user1);
        chatServer.register("ss", user2);

        chatServer.register("dd", user1);

        chatServer.sendMessage(user1, "ss", "sooso");
        chatServer.sendMessage(user2, "dd", "sksksks");
    }
}
