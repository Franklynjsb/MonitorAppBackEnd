package com.monitorapp.ma.Security.Service;


import com.monitorapp.ma.Security.Entity.UsuarioSecurity;
import com.monitorapp.ma.Security.Repository.iUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<UsuarioSecurity> getByNombreUsuario (String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }

    public void save(UsuarioSecurity usuarioSecurity){
        iusuarioRepository.save(usuarioSecurity);
    }

}
