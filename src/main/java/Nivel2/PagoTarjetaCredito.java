package Nivel2;

public class PagoTarjetaCredito implements Pago{
    @Override
    public void pagar(){
        System.out.println(" Realizando Pago con tarjeta de credito");
    }
}
