package hello.designpatterns.abstract_factory;

import hello.designpatterns.factory_method.Ship;
import hello.designpatterns.factory_method.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());

        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor());
        System.out.println(ship.getWheel());
    }
}
