package com.monitorapp.ma.Interface;

import com.monitorapp.ma.Entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    //Entrega una lista de usuarios
    List<Usuario> getUsuario();

    //Guarda un Usuario
    void saveUsuario(Usuario usuario);

    //Eliminar un Usuario según su ID
    void deletePersona(Integer id);

    //Buscar Usuario por ID
    Usuario findUsuario(Integer id);


}
