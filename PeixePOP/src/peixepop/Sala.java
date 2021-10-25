/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peixepop;

import java.util.ArrayList;

/**
 *
 * @author Developer
 */
public class Sala {
    
    private final int maxEstanques = 2;
    private final int maxPlanta = 1;
    
    private String codigo;
    private String tipo;
    private String nombre;
    private int numEstanques;
    private Planta planta;
    private ArrayList<Estanque> estanques;

    public Sala(String codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estanques = new ArrayList<Estanque>();
        this.planta = null;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estanque> getEstanques() {
        return estanques;
    }

    public void setEstanques(ArrayList<Estanque> estanques) {
        this.estanques = estanques;
    }
    
    
}
