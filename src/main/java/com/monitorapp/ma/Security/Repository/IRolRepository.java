package com.monitorapp.ma.Security.Repository;

import com.monitorapp.ma.Security.Entity.Rol;
import com.monitorapp.ma.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);


}
