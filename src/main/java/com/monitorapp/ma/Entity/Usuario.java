package com.monitorapp.ma.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud de caracteres")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud de caracteres")
    private String apellido;

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotNull @Size(min = 1, max = 50, message = "No cumple con la longitud de caracteres") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull @Size(min = 1, max = 50, message = "No cumple con la longitud de caracteres") String nombre) {
        this.nombre = nombre;
    }

    public @NotNull @Size(min = 1, max = 50, message = "No cumple con la longitud de caracteres") String getApellido() {
        return apellido;
    }

    public void setApellido(@NotNull @Size(min = 1, max = 50, message = "No cumple con la longitud de caracteres") String apellido) {
        this.apellido = apellido;
    }
}
