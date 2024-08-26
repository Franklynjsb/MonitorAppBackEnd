package com.monitorapp.ma.Controller;

import com.monitorapp.ma.Dto.dtoPlanta;
import com.monitorapp.ma.Entity.Planta;
import com.monitorapp.ma.Security.Controller.Mensaje;
import com.monitorapp.ma.Service.SPlanta;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("planta")
@CrossOrigin(origins = "*")
public class CPlanta {

    @Autowired
    SPlanta sPlanta;

    @GetMapping("/lista")
    public ResponseEntity<List<Planta>> list() {
        List<Planta> list = sPlanta.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoPlanta dtoplanta) {
        if (StringUtils.isBlank(dtoplanta.getNombrePlanta()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sPlanta.existsByNombrePlanta(dtoplanta.getNombrePlanta()))
            return new ResponseEntity(new Mensaje("Esa planta ya existe"), HttpStatus.BAD_REQUEST);

        Planta planta = new Planta(dtoplanta.getNombrePlanta(), dtoplanta.getPais(), dtoplanta.getLecturas(),
                dtoplanta.getAlertasMedias(), dtoplanta.getAlertasRojas());

        sPlanta.save(planta);

        return new ResponseEntity(new Mensaje("Planta creada!"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoPlanta dtoplanta){
        if(!sPlanta.existsById(id)){
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        }
        if(sPlanta.existsByNombrePlanta(dtoplanta.getNombrePlanta()) && sPlanta.getByNombrePlanta(dtoplanta.getNombrePlanta()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Esa planta ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoplanta.getNombrePlanta())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio!"), HttpStatus.BAD_REQUEST);
        }

        Planta planta = sPlanta.getOne(id).get();
        planta.setNombrePlanta(dtoplanta.getNombrePlanta());
        planta.setLecturas(dtoplanta.getLecturas());
        planta.setAlertasMedias(dtoplanta.getAlertasMedias());
        planta.setAlertasRojas(dtoplanta.getAlertasRojas());

        sPlanta.save(planta);
        return new ResponseEntity(new Mensaje("La planta fue actualizada!"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if(!sPlanta.existsById(id)){
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        }
        sPlanta.delete(id);
        return new ResponseEntity(new Mensaje("La planta se eliminó"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Planta> getById(@PathVariable("id") int id){
        if(!sPlanta.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Planta experiencia = sPlanta.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }

}
