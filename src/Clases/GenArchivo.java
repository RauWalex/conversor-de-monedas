package Clases;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenArchivo {

   public void genArchivo (ArrayList<ConsultaMoneda> nuevaconsulta, String nombreArchivo)  {
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
       FileWriter gen1 = null;
       try {
           gen1 = new FileWriter(nombreArchivo + ".json");
           gen1.write(gson.toJson(nuevaconsulta));
           gen1.close();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }

    public void genArchivo(ConsultaMoneda consultaMoneda, String nombreArchivo) {
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter archivoNuevo = new FileWriter(nombreArchivo +".json");
            archivoNuevo.write(gson.toJson(consultaMoneda));
            archivoNuevo.close();
            System.out.println("Archivo generado con exito");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
            throw new RuntimeException(e);
        }
    }

    /*public void genArchivo(ArrayList<ConsultaMoneda> nuevaConsulta, String nombreArchivo) throws IOException {
        // Crear instancia de Gson con pretty printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Uso de try-with-resources para cerrar automáticamente el FileWriter
        try (FileWriter gen1 = new FileWriter(nombreArchivo + ".json")) {
            gson.toJson(nuevaConsulta, gen1);  // Escribir JSON en el archivo
            System.out.println("Archivo " + nombreArchivo + ".json creado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
            throw e;  // Propagamos la excepción si es necesario manejarla en otro lugar
        }
    }*/
}


