package Nivel2;

public class PagoCuentaBancaria implements Pago {

    private int numeroCuenta;
    private String nombreTitular;
    private String entidadBancaria;

   public PagoCuentaBancaria(int numeroCuenta, String nombreTitular, String entidadBancaria){
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.entidadBancaria = entidadBancaria;
    }

    @Override
    public void pagar(int precio) {
        System.out.println("Realizando pago a traves cuenta bancaria");
    }
}
