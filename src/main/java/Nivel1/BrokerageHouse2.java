package Nivel1;

public class BrokerageHouse2 implements Observer {
    @Override
    public void update(double price) {
        System.out.println("BrokerageHouse2 the value Price updated to: " + price);

    }
}
