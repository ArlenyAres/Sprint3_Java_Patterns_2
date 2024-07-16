package Nivel2;

public class TiendaZapatos {
    public static void main(String[] args) {

        PasarellaDePago pasarellaDePago = new PasarellaDePago();

        Pago pagoCuentaBancaria = new PagoCuentaBancaria( 1234567890, "Cosita", "Banco de la CostaDorada");
        System.out.println("Pagar con cuenta bancaria");
        pasarellaDePago.procesarPago(pagoCuentaBancaria, 1000);

        Pago pagoPayPal = new PagoPayPal("cosita@cosita.com", "123456");
        System.out.println("Pagar con PayPal");
        pasarellaDePago.procesarPago(pagoPayPal, 2000);

        Pago pagoTarjetaCredito = new PagoTarjetaCredito( 1234567890, " Akira Kira", "12/2022", 123);
        System.out.println("Pagar con tarjeta de crédito");
        pasarellaDePago.procesarPago(pagoTarjetaCredito, 3000);

    }
}
