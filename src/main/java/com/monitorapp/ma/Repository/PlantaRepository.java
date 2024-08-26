package com.monitorapp.ma.Repository;

import com.monitorapp.ma.Entity.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantaRepository extends JpaRepository<Planta, Integer> {

    Optional<Planta> findByNombrePlanta(String nombrePlanta);

    boolean existsByNombrePlanta(String nombrePlanta);
}
