package Nivel2;

public class PasarellaDePago {

    public void procesarPago(Pago metodoPago){
        System.out.println("Procesando pago...");
        metodoPago.pagar();

        System.out.println("Pago procesado correctaeamente con : " + metodoPago);
    }
}
