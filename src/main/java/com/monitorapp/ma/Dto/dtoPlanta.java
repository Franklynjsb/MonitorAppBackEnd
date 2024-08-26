package com.monitorapp.ma.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPlanta {

    @NotBlank
    private String Pais;

    @NotBlank
    private String nombrePlanta;

    @NotBlank
    private int Lecturas;

    @NotBlank
    private int AlertasMedias;

    @NotBlank
    private int AlertasRojas;

    //Constructor

    public dtoPlanta() {
    }

    public dtoPlanta(String pais, String nombrePlanta, int lecturas, int alertasMedias, int alertasRojas) {
        Pais = pais;
        this.nombrePlanta = nombrePlanta;
        Lecturas = lecturas;
        AlertasMedias = alertasMedias;
        AlertasRojas = alertasRojas;
    }

    //Getter y Setter

    public @NotBlank String getPais() {
        return Pais;
    }

    public void setPais(@NotBlank String pais) {
        Pais = pais;
    }

    public @NotBlank String getNombrePlanta() {
        return nombrePlanta;
    }

    public void setNombrePlanta(@NotBlank String nombrePlanta) {
        this.nombrePlanta = nombrePlanta;
    }

    @NotBlank
    public int getLecturas() {
        return Lecturas;
    }

    public void setLecturas(@NotBlank int lecturas) {
        Lecturas = lecturas;
    }

    @NotBlank
    public int getAlertasRojas() {
        return AlertasRojas;
    }

    public void setAlertasRojas(@NotBlank int alertasRojas) {
        AlertasRojas = alertasRojas;
    }

    @NotBlank
    public int getAlertasMedias() {
        return AlertasMedias;
    }

    public void setAlertasMedias(@NotBlank int alertasMedias) {
        AlertasMedias = alertasMedias;
    }
}
