package Nivel2;

public class PagoPayPal implements Pago{

    private String email;
    private String password;

    public PagoPayPal(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public void pagar(int precio){
        System.out.println("Realizando Pago a traves de PayPal ");
    }
}
