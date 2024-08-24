package com.monitorapp.ma.Security.Service;


import com.monitorapp.ma.Security.Entity.Usuario;
import com.monitorapp.ma.Security.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    public Optional<Usuario> getByNombreUsuario (String nombreUsuario){
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){
        return iUsuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario){
        iUsuarioRepository.save(usuario);
    }

}
