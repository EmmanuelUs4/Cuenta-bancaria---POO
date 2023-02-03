public class Main {
    public static void main (String[] args) {

        long numeroAleatorio = (long) (Math.random()*100000000+999999999);
        long numeroAleatorio2 = (long) (Math.random()*100000000+999999999);
        //Primera cuenta
        Cuenta cuenta1 = new Cuenta(100, "Balduino IV", numeroAleatorio);
        System.out.println(cuenta1.setIngresos(100));
        //System.out.println(cuenta1.setRetiro(50));
        cuenta1.getSaldoCuenta();
        cuenta1.getDatosCuenta();
        //segunda cuenta
        Cuenta cuenta2 = new Cuenta(200,"Juana De Arco", numeroAleatorio2);
        System.out.println(cuenta2.setIngresos(200));
        //System.out.println(cuenta2.setRetiro(1));
        cuenta2.getSaldoCuenta();
        cuenta2.getDatosCuenta();


        //transfer
        Banco banco = new Banco(cuenta1, cuenta2);
        System.out.println( banco.setTransferencia(cuenta1, cuenta2, 59));

        banco.getNumeroCuenta();

    }
}
