package Nivel1;

public class Main {
    public static void main(String[] args) {
        BrokerObservable broker = new BrokerObservable();

        BrokerageHouse1 brokerageHouse1 = new BrokerageHouse1();
        BrokerageHouse2 brokerageHouse2 = new BrokerageHouse2();
        BrokerageHouse3 brokerageHouse3 = new BrokerageHouse3();

        broker.addObserver(brokerageHouse1);
        broker.addObserver(brokerageHouse2);
        broker.addObserver(brokerageHouse3);


        broker.setPrice(100);
        broker.setPrice(200);
        broker.setPrice(300);
    }
}
