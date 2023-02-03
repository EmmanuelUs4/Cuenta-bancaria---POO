
public class Banco {
    private String cuentaTransfiere;
    private String cuentaRecibe;
    private double monto;

    private double transferido;
    //Traigo  las cuentas a Banco   para hace uso  de estas
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    //constructor
    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    /*Necesito una funcion  de transferencia en la que establezco el  monto  a transferir
    de cuenta 1 a cuenta 2,  para ello  utilizo  un setter de transferencia
     */


    //.
    double setTransferencia(Cuenta cuenta1, Cuenta cuenta2, double monto) {
        if (this.cuenta1.getSaldoDeCuenta() - monto > 0) {
            System.out.println(cuenta1.setRetiro(monto));
            transferido = cuenta2.setIngresos(monto);
        } else {
            System.out.println("Error en la transferencia");
        }
        return transferido;
    }

    public String getNumeroCuenta(){
        String mensaje= "Número de cuenta de Balduino: " + this.cuenta1.getNumerosDeCuentas()+ " y número de cuenta de Juana: " + this.cuenta2.getNumerosDeCuentas();
        System.out.println(mensaje);
        return mensaje;

    }


}
