/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import co.avsoft.persistence.entity.AbstractEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Contador
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Entidad.EntidadXAcronimo", query = "SELECT e.acronimo from Entidad e order by e.acronimo")
})
public class Entidad extends AbstractEntity {

    @Column(nullable = false, length = 15, unique = true)
    private String acronimo;
    @Column(nullable = false, length = 150, unique = true)
    private String nombre;
//    private Image imagen;

    public Entidad() {
    }

    public Entidad(String acronimo, String entidad) {
        this.acronimo = acronimo;
        this.nombre = entidad;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Entidad{" + "entidad=" + nombre + ", imagen=" + ", preguntas=";
    }

}
