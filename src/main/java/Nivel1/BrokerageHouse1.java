package Nivel1;

public class BrokerageHouse1 implements Observer {
    @Override
    public void update(double price) {
        System.out.println("BrokerageHouse1 the value Price updated to: " + price);

    }
}
