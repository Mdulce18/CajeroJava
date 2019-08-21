package cajero;

public class Retirar extends Operaciones {
    @Override
    public void ejecutarOperacion() {
        setCantidad(pedirDatos());
        if (getCantidad() < getSaldo()) {
            setSaldo(getSaldo() - getCantidad());
            System.out.println("Usted a retirado $" + getCantidad());
        } else {
            System.out.println("-------------------------------------------\n"+"Saldo insuficiente\n"+"-------------------------------------------\n");
        }
    }
}
