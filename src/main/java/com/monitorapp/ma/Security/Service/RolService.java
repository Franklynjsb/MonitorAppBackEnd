package com.monitorapp.ma.Security.Service;


import com.monitorapp.ma.Security.Entity.Rol;
import com.monitorapp.ma.Security.Enums.RolNombre;
import com.monitorapp.ma.Security.Repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional//Persistencia de datos
public class RolService {

    @Autowired
    IRolRepository iRolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return iRolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        iRolRepository.save(rol);
    }



}
