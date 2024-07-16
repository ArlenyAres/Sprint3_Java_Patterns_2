package Nivel2;

public class PagoPayPal implements Pago{

    @Override
    public void pagar(){
        System.out.println("Realizando Pago con PayPal");
    }
}
