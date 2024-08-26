package com.monitorapp.ma.Service;

import com.monitorapp.ma.Entity.Usuario;
import com.monitorapp.ma.Interface.IUsuarioService;
import com.monitorapp.ma.Repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class ImpUsuarioService implements IUsuarioService {

    @Autowired
    IUsuarioRepository iUsuarioRepository;


    @Override
    public List<Usuario> getUsuario() {
        return iUsuarioRepository.findAll();
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        iUsuarioRepository.save(usuario);
    }

    @Override
    public void deletePersona(Integer id) {
        iUsuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Integer id) {
        return iUsuarioRepository.findById(id).orElse(null);
    }
}
