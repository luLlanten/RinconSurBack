package cl.duocuc.rinconsur.perfiles_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duocuc.rinconsur.perfiles_service.model.Colaborador;

@Repository 
public interface ColaboradorRepo extends JpaRepository<Colaborador,Integer> {
    Colaborador findByCorreo(String correo);
    Colaborador findByRut(String rut);
}
