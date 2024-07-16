package Nivel2;

public class PasarellaDePago {

    public void procesarPago(Pago metodoPago, int precio){
        System.out.println("Procesando pago...");
        metodoPago.pagar(precio);

        System.out.println(".... Pago procesado correctamente");
    }
}
