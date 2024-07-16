package Nivel2;

public class TiendaZapatos {
    public static void main(String[] args) {

        PasarellaDePago pasarellaDePago = new PasarellaDePago();

        Pago pagoCuentaBancaria = new PagoCuentaBancaria();
        System.out.println("Pagar con cuenta bancaria");
        pasarellaDePago.procesarPago(pagoCuentaBancaria);

        Pago pagoPayPal = new PagoPayPal();
        System.out.println("Pagar con PayPal");
        pasarellaDePago.procesarPago(pagoPayPal);

        Pago pagoTarjetaCredito = new PagoTarjetaCredito();
        System.out.println("Pagar con tarjeta de crédito");
        pasarellaDePago.procesarPago(pagoTarjetaCredito);

    }
}
