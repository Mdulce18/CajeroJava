package cajero;

public class Depositar extends Operaciones {
    @Override
    public void ejecutarOperacion() {
        setCantidad(pedirDatos());
        setSaldo(getSaldo() + getCantidad());
        System.out.println("-------------------------------------------\n"+"Usted a deposito $" + getCantidad());
    }
}
