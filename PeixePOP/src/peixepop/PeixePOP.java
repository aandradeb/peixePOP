/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peixepop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Developer
 */
public class PeixePOP {
    
    
    public static void main(String[] args) {
        
        Acuario acuario = new Acuario("PeixePOP");
        
        // Creamos un String con el nombre del archivo con los datos
        String data = "Datos.txt";
        
        // Creamos un String con la ruta absoluta del archivo que le pasamos
        String rutaAbsoluta = new File(data).getAbsolutePath();
        
        // Para ver la ruta del archivo usado para datos descomentar la siguiente línea
        //System.out.println(rutaAbsoluta);
        File archivo = new File(rutaAbsoluta);

        acuario.clasificarObjetos(archivo);
        acuario.mostrarInventario();
        //estanques.get(0).setPeces(peces);
        //estanques.get(0).setPlanta(plantas.get(0));
        //salas.get(0).setEstanques(estanques);
        
    }
}
