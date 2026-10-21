package Adapter;
public class Tienda {

    private final ProcesadorPagos procesador;
<<<<<<< HEAD
    public Tienda(ProcesadorPagos procesador){
=======

    public Tienda(ProcesadorPagos procesador) {
>>>>>>> db864a4 (implementacion bridge)
        this.procesador = procesador;
    }

    public void vender(String producto, double precio) {
        boolean ok = procesador.pagar(precio);
        System.out.println("Venta de " + producto + ": " + (ok ? "exitosa" : "fallida"));
    }
}
