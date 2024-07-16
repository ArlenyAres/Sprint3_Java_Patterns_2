package Nivel1;

public class BrokerageHouse implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Broker says the value Price updated to: " + price);

    }
}
