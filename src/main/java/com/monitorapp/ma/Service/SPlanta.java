package com.monitorapp.ma.Service;


import com.monitorapp.ma.Entity.Planta;
import com.monitorapp.ma.Repository.PlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SPlanta {

    @Autowired
    PlantaRepository plantaRepository;

    public List<Planta> list() {
        return plantaRepository.findAll();
    }

    public Optional<Planta> getOne(int id) {
        return plantaRepository.findById(id);
    }

    public Optional<Planta> getByNombrePlanta(String nombrePlanta) {
        return plantaRepository.findByNombrePlanta(nombrePlanta);
    }

    public void save(Planta planta) {
        plantaRepository.save(planta);
    }

    public void delete (int id) {
        plantaRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return plantaRepository.existsById(id);
    }

    public boolean existsByNombrePlanta (String nombrePlanta) {
        return plantaRepository.existsByNombrePlanta(nombrePlanta);
    }

}
