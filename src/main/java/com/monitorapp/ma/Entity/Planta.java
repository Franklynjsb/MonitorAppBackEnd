package com.monitorapp.ma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String Pais;

    private String nombrePlanta;

    private int Lecturas;

    private int AlertasMedias;

    private int AlertasRojas;

    //Constructor
    public Planta() {
    }

    public Planta(String pais, String nombrePlanta, int lecturas, int alertasMedias, int alertasRojas) {
        Pais = pais;
        this.nombrePlanta = nombrePlanta;
        Lecturas = lecturas;
        AlertasMedias = alertasMedias;
        AlertasRojas = alertasRojas;
    }

    //Getter y Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlertasRojas() {
        return AlertasRojas;
    }

    public void setAlertasRojas(int alertasRojas) {
        AlertasRojas = alertasRojas;
    }

    public int getAlertasMedias() {
        return AlertasMedias;
    }

    public void setAlertasMedias(int alertasMedias) {
        AlertasMedias = alertasMedias;
    }

    public int getLecturas() {
        return Lecturas;
    }

    public void setLecturas(int lecturas) {
        Lecturas = lecturas;
    }

    public String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }
}
