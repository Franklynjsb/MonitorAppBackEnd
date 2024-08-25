package com.monitorapp.ma.Security.Repository;


import com.monitorapp.ma.Security.Entity.UsuarioSecurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iUsuarioRepository extends JpaRepository<UsuarioSecurity, Integer> {

    Optional<UsuarioSecurity> findByNombreUsuario(String nombreUsuario);

    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

}
