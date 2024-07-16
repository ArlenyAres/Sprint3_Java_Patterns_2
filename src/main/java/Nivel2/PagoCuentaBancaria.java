package Nivel2;

public class PagoCuentaBancaria implements Pago {
    @Override
    public void pagar() {
        System.out.println(" Realizando pago con cuenta bancaria");
    }
}
