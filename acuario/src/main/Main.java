package main;

import java.io.File;
import acuario.Acuario;
import tienda.Tienda;

/**
 * Clase deonde se ejecuta el programa
 * @author Angel, Jose, Miguel, Paulo
 */
public class Main {
    
    public static void main(String[] args) {
        // Creamos un String con el nombre del archivo con los datos
        String fichero = "Datos.txt";
      
        // Ruta absoluta del fichero que contiene los datos
        try {
            String rutaFichero = new File(fichero).getAbsolutePath();
        
            // Creamos nuestro objeto acuario
            Acuario acuario = new Acuario("PeixePOP", rutaFichero);
            // Recogemos los datos del fichero y los metemos en el inventario
            acuario.rellenarInventario();
        
            // Asignar a cada sala sus estanques y tiburones correspondientes
            acuario.asignarJerarquia();
        
            // Se muestra como está diseñado el acuario
            acuario.mostrarJeraquia();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Tienda tienda=Tienda.getInstance();
        tienda.dataDump();
        tienda.test();
    }
}
