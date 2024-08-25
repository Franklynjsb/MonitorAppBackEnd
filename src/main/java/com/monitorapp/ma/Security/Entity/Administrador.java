package com.monitorapp.ma.Security.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Administrador implements UserDetails {

    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    //Constructor


    public Administrador(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    //Método público para construir el usuario
    public static Administrador build(UsuarioSecurity usuarioSecurity) {
        List<GrantedAuthority> authorities = usuarioSecurity.getRoles()
                .stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre()
                        .name())).collect(Collectors.toList());

        return new Administrador(
                usuarioSecurity.getNombre(),
                usuarioSecurity.getNombreUsuario(),
                usuarioSecurity.getEmail(),
                usuarioSecurity.getPassword(),
                authorities);
    }

    //Métodos implementados en UserDetails (métodos abstractos)
    @Override
    public boolean isAccountNonExpired() {
        //Está logeado
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //Esta la credencial Sin expirar
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //No esta bloqueado
        return true;
    }

    @Override
    public boolean isEnabled() {
        //Esta habilitado
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getEmail() {
        return email;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }
}
