/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import co.avsoft.persistence.entity.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Contador
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Parametro.buscarXnombre", query = "SELECT p FROM Parametro p WHERE p.nombre = :nombre")
})
public class Parametro extends AbstractEntity {
    
    public static final String PreguntasXPartida  = "Preguntas por Partida";
    
    private String nombre;
    private String valor;

    public Parametro() {
    }

    public Parametro(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
