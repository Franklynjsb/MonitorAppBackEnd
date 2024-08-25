package com.monitorapp.ma.Security.Service;


import com.monitorapp.ma.Security.Entity.UsuarioSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    com.monitorapp.ma.Security.Repository.iUsuarioRepository iUsuarioRepository;

    public Optional<UsuarioSecurity> getByNombreUsuario (String nombreUsuario){
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){

        return iUsuarioRepository.existsByEmail(email);
    }

    public void save(UsuarioSecurity usuarioSecurity){

        iUsuarioRepository.save(usuarioSecurity);
    }

}
