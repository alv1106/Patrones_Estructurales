package Adapter;
public class App {
    public static void main(String[] args) throws Exception {
        PasarelaLegada legada = new PasarelaLegada();
        ProcesadorPagos adaptador = new AdaptadorPasarelaLegada(legada);

        Tienda tienda = new Tienda(adaptador);
        tienda.vender("Teclado", 85000.50);
    }
}
