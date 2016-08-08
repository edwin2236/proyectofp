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
    @NamedQuery(name = "Participante.findByNuip", query = "SELECT p FROM Participante p WHERE p.nuip = :nuip")
})
public class Participante extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private Long nuip;
    @Column(nullable = false, length = 255)
    private String nombre;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false)
    private Integer telefono;
    @Column(nullable = false, length = 100)
    private String profesion;
    @Column(nullable = false, length = 100)
    private String ciudad;
//    @Column(nullable = false)
//    @OneToOne
//    private Partida partida;

    public Participante() {
    }

    public Participante(Long nuip, String nombre, String email, Integer telefono, String profesion, String ciudad) {
        this.nuip = nuip;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.profesion = profesion;
        this.ciudad = ciudad;
//        this.partida = null;
    }

    public Long getNuip() {
        return nuip;
    }

    public void setNuip(Long nuip) {
        this.nuip = nuip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

//    public Partida getPartida() {
//        return partida;
//    }
//
//    public void setPartida(Partida partida) {
//        this.partida = partida;
//    }
    @Override
    public String toString() {
        return "Partcipane : \n"
                + "numero de identifiacaion: " + nuip + "\n"
                + "Nombre y Apellido: " + nombre + "\n"
                + "Email: " + email + "\n"
                + "Telfono: " + telefono + "\n"
                + "Ciudad: " + ciudad + "\n"
                + "Profesion: " + profesion + "\n" //                + partida.toString()
                ;
    }

}
