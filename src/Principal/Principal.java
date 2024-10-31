package Principal;
import Clases.ConsultaMoneda;
import Clases.ConvierteMoneda;
import Clases.GenArchivo;
import Clases.Menu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        ArrayList<ConsultaMoneda> historial = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu();
        GenArchivo archivo = new GenArchivo();
        ConvierteMoneda conversion = new ConvierteMoneda();
        int consecutivo = 0;
        boolean salir;
        do {
            menu1.mostrarMenuUsuario();
            try {
                ConsultaMoneda objetoRespuesta = conversion
                        .convierteMoneda(menu1
                                .getMoneda1(), menu1
                                .getMoneda2(), sc
                                .nextDouble());
                System.out.println(objetoRespuesta);
                historial.add(objetoRespuesta);
                archivo.genArchivo(historial.get(consecutivo),
                        consecutivo+"-"+menu1.getMoneda1()+"-a-" + menu1.getMoneda2());
            } catch (IOException | InterruptedException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
            salir = menu1.mostrarPreguntaSalidaMenu();
            consecutivo++;
        } while (salir);
        archivo.genArchivo(historial,"historial");
        System.out.println(historial);
    }
}
