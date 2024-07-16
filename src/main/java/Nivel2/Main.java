package Nivel2;

public class Main {
    public static void main(String[] args) {

        PasarellaDePago pasarellaDePago = new PasarellaDePago();
        PagoCuentaBancaria pagoCuentaBancaria = new PagoCuentaBancaria();
        PagoPayPal pagoPayPal = new PagoPayPal();
        PagoTarjetaCredito pagoTarjetaCredito = new PagoTarjetaCredito();

        pasarellaDePago.procesarPago(pagoCuentaBancaria);
        pasarellaDePago.procesarPago(pagoPayPal);
        pasarellaDePago.procesarPago(pagoTarjetaCredito);
    }
}
