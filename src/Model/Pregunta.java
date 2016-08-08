/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import co.avsoft.persistence.entity.AbstractEntity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Contador
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Pregunta.buscarXAcronimo&&Dificultad",query = "SELECT p FROM Pregunta p WHERE p.entidad.acronimo = :acronimo AND p.dificultad = :dificultad")
})
public class Pregunta extends AbstractEntity {

    @Column(nullable = false, length = 255, unique = true)
    private String enunciado;

    @Column(nullable = false, unique = false)
    private byte dificultad;

    @Column(nullable = false)
    private List<String> alternativas;
    
     
    @ManyToOne(fetch = FetchType.LAZY)
    private Entidad entidad;

    public Pregunta() {
    }

    public Pregunta(String enunciado, ArrayList<String> alternativas) {
        this.enunciado = enunciado;
        this.alternativas = new ArrayList<>();
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<String> alternativas) {
        this.alternativas = alternativas;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }
    
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setAlternativas(ArrayList<String> alternativas) {
        this.alternativas = alternativas;
    }
    
    public void AgregarAlternativa(String Alternativa) throws Exception{
        throw new Exception("no se ha implementado el metodo agregar alternativa");
    }

    public byte getDificultad() {
        return dificultad;
    }

    public void setDificultad(byte dificultad) {
        this.dificultad = dificultad;
    }
    
    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", alternativas=" + alternativas + ", preguntas=" + '}';
    }

}
