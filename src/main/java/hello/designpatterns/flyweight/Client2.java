package hello.designpatterns.flyweight;

public class Client2 {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character2 c1 = new Character2('h', "white", fontFactory.getFont("nanum:12"));
        Character2 c2 = new Character2('e', "white", fontFactory.getFont("nanum:12"));
        Character2 c3 = new Character2('l', "white", fontFactory.getFont("nanum:12"));
        Character2 c4 = new Character2('l', "white", fontFactory.getFont("nanum:12"));
        Character2 c5 = new Character2('o', "white", fontFactory.getFont("nanum:12"));
    }
}
