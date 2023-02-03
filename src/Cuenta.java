public class Cuenta {
    private double saldoDeCuenta;

    private String nombreDelTitular;

    private long numeroDeCuenta;
    private long numeroAleatorio;
    //private long numeroAleatorio = (long) (Math.random()*100000000+999999999);
    public Cuenta(double saldoDeCuenta, String nombreDelTitular, long numeroAleatorio) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroAleatorio = numeroAleatorio;
    }

    public double setIngresos(double nuevoIngreso) {

        return saldoDeCuenta += nuevoIngreso;
    }

    public double setRetiro(double nuevoRetiro) {

        return saldoDeCuenta -= nuevoRetiro;
    }


    public void getSaldoCuenta(){

        System.out.println("El  Saldo de la cuenta es de: "  + this.saldoDeCuenta);
    }

    public void getDatosCuenta() {
        System.out.println( "El saldo de la cuenta es: "+ this.saldoDeCuenta + ". El dueño de la cuenta es: " + this.nombreDelTitular + " y el número de cuenta es: " + numeroAleatorio);

    }


    public double  getSaldoDeCuenta(){
        return this.saldoDeCuenta;
    }

    public Long getNumerosDeCuentas(){
        return this.numeroAleatorio;
    }
}