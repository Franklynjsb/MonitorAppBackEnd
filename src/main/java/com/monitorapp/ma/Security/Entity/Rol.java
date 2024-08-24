package com.monitorapp.ma.Security.Entity;

import com.monitorapp.ma.Security.Enums.RolNombre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;


    //Constructor
    public Rol() {
    }

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotNull RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(@NotNull RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
}
