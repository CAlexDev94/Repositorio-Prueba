
package com.aerolinea;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Asociacion {
    
    private Avion avion;
    private Piloto piloto; // ¿Que son?  <---- Atributos de tipo objeto
    //¿Heredar atributos de la clase Piloto? <---- NO, no hereda nada
    private Date date; 
    private int numeroDui; // primitivo

    public Asociacion() {
    }

    public Asociacion(Avion avion, Piloto piloto, Date date) {
        this.avion = avion;
        this.piloto = piloto;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Asociacion{" + "avion=" + avion + ", piloto=" + piloto + ", date=" + date + '}';
    }

    
    
    
}
