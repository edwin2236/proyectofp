/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import co.avsoft.persistence.entity.AbstractEntity;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Contador
 */
@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"fecha", "horaInicial", "horaFinal"})
})
public class Partida extends AbstractEntity {

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime horaInicial;

    @Column(nullable = false)
    private LocalTime horaFinal;

    @Column(nullable = false)
    private Short preguntasAcertadas;

    @Column(nullable = false)
    private Duration tiempo;

    @OneToOne(fetch = FetchType.EAGER)
    private Participante participante;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Pregunta> preguntas;

    public Partida() {
    }

    public Partida(Short preguntasAcertadas, Duration tiempo, Participante participante) {
        this.fecha = LocalDate.now();
        this.horaInicial = LocalTime.now();
        this.horaFinal = LocalTime.now();
        this.preguntasAcertadas = preguntasAcertadas;
        this.tiempo = tiempo;
        this.participante = participante;
        this.preguntas = new LinkedList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(LocalTime horaInicial) {
        this.horaInicial = horaInicial;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal() {
        this.horaFinal = LocalTime.now();
    }

    public Short getPreguntasAcertadas() {
        return preguntasAcertadas;
    }

    public void setPreguntasAcertadas(Short preguntasAcertadas) {
        this.preguntasAcertadas = preguntasAcertadas;
    }

    public Duration getTiempo() {
        return tiempo;
    }

    public void setTiempo(Duration tiempo) {
        this.tiempo = tiempo;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void AgregarPregunta(Pregunta pregunta) throws Exception {
        throw new Exception("no se ha implementado el metodo agregar pregunta");
    }

    @Override
    public String toString() {
        return "Partida{" + "fecha=" + fecha + ", horaInicial=" + horaInicial + ", horaFinal=" + horaFinal + ", preguntasAcertadas=" + preguntasAcertadas + ", tiempo=" + tiempo + ", participante=" + participante + ", preguntas=" + preguntas + '}';
    }

}
