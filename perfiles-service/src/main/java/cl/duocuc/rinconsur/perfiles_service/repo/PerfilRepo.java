package cl.duocuc.rinconsur.perfiles_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duocuc.rinconsur.perfiles_service.model.Perfil;
@Repository 
public interface PerfilRepo extends JpaRepository<Perfil,Integer>{

}
