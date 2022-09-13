package hello.designpatterns.abstract_factory;

public interface ShipPartsFactory {
    Anchor createAnchor();

    Wheel createWheel();
}
