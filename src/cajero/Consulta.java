package cajero;

public class Consulta extends Operaciones {
    @Override
    public void ejecutarOperacion() {
        System.out.println("-------------------------------------------\n"+"El saldo es " + getSaldo()+"\n"+"-------------------------------------------");
    }
}
