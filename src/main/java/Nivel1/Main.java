package Nivel1;

public class Main {
    public static void main(String[] args) {
        BrokerObservable broker = new BrokerObservable();

        BrokerageHouse brokerageHouse1 = new BrokerageHouse();
        BrokerageHouse brokerageHouse2 = new BrokerageHouse();
        BrokerageHouse brokerageHouse3 = new BrokerageHouse();

        broker.addObserver(brokerageHouse1);
        broker.addObserver(brokerageHouse2);
        broker.addObserver(brokerageHouse3);


        broker.setPrice(100);
        broker.setPrice(200);
        broker.setPrice(300);
    }
}
