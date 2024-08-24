package com.monitorapp.ma.Controller;


import com.monitorapp.ma.Entity.Usuario;
import com.monitorapp.ma.Interface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    IUsuarioService iUsuarioService;

    @GetMapping("usuarios/get")
    public List<Usuario> getUsuario() {
        return iUsuarioService.getUsuario();
    }

    @PostMapping("usuarios/create")
    public String createUsuario(@RequestBody Usuario usuario) {
        iUsuarioService.saveUsuario(usuario);
        return "El usuario fue creada correctamente";
    }

    @DeleteMapping("usuarios/delete/{id}")
    public String deleteUsuario(@PathVariable Integer id) {
        iUsuarioService.deletePersona(id);
        return "El usuario fue eliminado correctamente";
    }


    @PutMapping("usuarios/edit/{id}")
    public Usuario editUsuario(@PathVariable Integer id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido) {

        Usuario usuario = iUsuarioService.findUsuario(id);

        usuario.setNombre(nuevoNombre);
        usuario.setApellido(nuevoApellido);

        iUsuarioService.saveUsuario(usuario);

        return usuario;
    }

    @GetMapping("/usuarios/get/perfil")
    public Usuario findUsuario() {
        return iUsuarioService.findUsuario(1);
    }


}
