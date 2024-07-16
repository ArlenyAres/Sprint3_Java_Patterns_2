package Nivel2;

public class PagoCuentaBancaria implements Pago {
    @Override
    public void pagar() {
        System.out.println("Realizando pago a traves cuenta bancaria");
    }
}
