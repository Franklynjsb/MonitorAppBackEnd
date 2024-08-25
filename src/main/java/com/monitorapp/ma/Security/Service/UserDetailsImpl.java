package com.monitorapp.ma.Security.Service;


import com.monitorapp.ma.Security.Entity.Administrador;
import com.monitorapp.ma.Security.Entity.UsuarioSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService {

    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {

        UsuarioSecurity usuarioSecurity = usuarioService.getByNombreUsuario(nombreUsuario).get();

        return Administrador.build(usuarioSecurity);

    }
}
