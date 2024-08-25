package com.monitorapp.ma.Repository;

import com.monitorapp.ma.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

    Optional<Usuario> findByNombre(String nombre);

    boolean existsByNombre(String nombre);
}
