package Nivel2;

public class PagoTarjetaCredito implements Pago{

    private int numeroTarjeta;
    private String nombreTitular;
    private String fechaExpiracion;
    private int cvv;

    public PagoTarjetaCredito(int numeroTarjeta, String nombreTitular, String fechaExpiracion, int cvv){
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    @Override
    public void pagar(int precio){
        System.out.println("Realizando Pago con tarjeta de credito");
    }
}
