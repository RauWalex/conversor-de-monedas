package Clases;

import java.util.ArrayList;

public record ConsultaMoneda(String base_code,
                             String target_code,
                             double conversion_rate,
                             double conversion_result) {

    @Override
    public String toString() {
        return "___________RESULTADO______________"+"\n"+
        "Moneda base   : " + base_code + "\n" +
        "Moneda destino: " + target_code + "\n" +
        "Tasa de cambio: $ "+ String.format("%.2f ",conversion_rate)+target_code+" Cada 1 "+ base_code + "\n"+
        "Tu resultado  : $ " + String.format("%.2f ", conversion_result)+target_code+ "\n" +
        "__________________________________"+"\n";
    }
}


