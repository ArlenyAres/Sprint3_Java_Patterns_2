package Nivel1;

public class BrokerageHouse3 implements Observer {
    @Override
    public void update(double price) {
        System.out.println("BrokerageHouse3 the value Price updated to: " + price);

    }
}
