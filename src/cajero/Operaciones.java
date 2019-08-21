package cajero;//escaneo en este metodo

import java.util.Scanner;

public abstract class Operaciones {
    private double cantidad;
    private static double saldo; //Estatico para que en cada objeto valga siempre lo mismo, sino valdra 0 al crearlos
    //No necesito constructor
    private int valor;

    public void mostrarOpciones() {
        Scanner escaneo = new Scanner(System.in);
        do {
            System.out.println("-------------------------------------------\n"+"Ingrese opcion=\n" + "1:Depositar \n" + "2:Retirar dinero\n" + "3:Consultar saldo\n" + "4:Salir\n"+"-------------------------------------------");

            this.valor = escaneo.nextInt();

            switch (valor) {
                case 1:
                    System.out.println("Usted eligio depositar");  //depositar
                    Operaciones deposito = new Depositar();//Creo un objeto y llamo a su metodo sobreescrito.
                    deposito.ejecutarOperacion();
                    break;

                case 2:
                    System.out.println("Usted eligio retirar"); //retirar
                    Operaciones retiro = new Retirar();
                    retiro.ejecutarOperacion();
                    break;

                case 3:
                    System.out.println("Usted eligio consultar");//consultar
                    Operaciones consultar = new Consulta();
                    consultar.ejecutarOperacion();
                    break;

                case 4:
                    System.out.println("Se ha finalizado la gestion");//Finalizar
                    break;

            }
        } while (valor != 4 && valor < 4);
    }

    public double pedirDatos() {
        Scanner escaneo = new Scanner(System.in);
        System.out.println("Ingrese cantidad");
        double datoPedido = escaneo.nextDouble();
        return datoPedido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCantidad() {
        return cantidad; //2da prueba
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public abstract void ejecutarOperacion(); //Comentario de prueba

}