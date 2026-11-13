package cl.duocuc.rinconsur.perfiles_service.service;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duocuc.rinconsur.perfiles_service.dto.ColaboradorRequestDTO;
import cl.duocuc.rinconsur.perfiles_service.model.Colaborador;
import cl.duocuc.rinconsur.perfiles_service.model.Perfil;
import cl.duocuc.rinconsur.perfiles_service.repo.ColaboradorRepo;
import cl.duocuc.rinconsur.perfiles_service.repo.PerfilRepo;

@Service 
public class PerfilService {
    @Autowired 
    private PerfilRepo perfilRepo;
    @Autowired 
    private ColaboradorRepo colaboradorRepo;

    //GET
    public Perfil getPerfilById(Integer id){
        return perfilRepo.findById(id).get();
    }
    public Colaborador getColaboradorById(Integer id){
        return colaboradorRepo.findById(id).get();
    }
    public List<Perfil> listarPerfiles(){
        return perfilRepo.findAll();
    }
    public List<Colaborador>listarColaboradores(){
        return colaboradorRepo.findAll();
    }
    public Colaborador getColaboradorByCorreo(String correo){
        return colaboradorRepo.findByCorreo(correo);
    }
    public Colaborador getColaboradorByRut(String rut){
        return colaboradorRepo.findByRut(rut);
    }

    //POST 
    public Colaborador addColaborador(Colaborador colaborador){
        return colaboradorRepo.save(colaborador);
    }
    public Perfil addPerfil(Perfil perfil){
        return perfilRepo.save(perfil);
    }

    //PATCH
    public Colaborador updateAvatarOnColaborador(Integer id, Blob avatar){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setAvatar(avatar);
        return colaboradorRepo.save(colaborador);
    }
    public Colaborador updateClaveOnColaborador(Integer id,String clave){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setClave(clave);
        return colaboradorRepo.save(colaborador);
    }
    public Colaborador updateNombreOnColaborador(Integer id, String nombre){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setNombre(nombre);
        return colaboradorRepo.save(colaborador);
    }
    public Colaborador updateTelefonoOnColaborador(Integer id, String telefono){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setTelefono(telefono);
        return colaboradorRepo.save(colaborador);
    }
    public Colaborador updateDireccionOnColaborador(Integer id, String direccion){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setDireccion(direccion);
        return colaboradorRepo.save(colaborador);
    }
    public Colaborador updateComunaOnColaborador(Integer id,String comuna){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setComuna(comuna);
        return colaboradorRepo.save(colaborador);
    }
    public Colaborador updateActivoOnColaborador(Integer id,Boolean activo){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setActivo(activo);
        return colaboradorRepo.save(colaborador);
    }
    public Colaborador updatePerfilOnColaborador(Integer id,Perfil perfil){
        Colaborador colaborador=colaboradorRepo.findById(id).get();
        colaborador.setPerfil(perfil);
        return colaboradorRepo.save(colaborador);
    }

    //PUT
    public Colaborador updateColaborador(ColaboradorRequestDTO colaborador){
        Colaborador colaborador2=colaboradorRepo.findById(colaborador.getId()).get();
        colaborador2.setNombre(colaborador.getNombre());
        colaborador2.setCargo(colaborador.getCargo());
        colaborador2.setRut(colaborador.getRut());
        colaborador2.setTelefono(colaborador.getTelefono());
        return colaboradorRepo.save(colaborador2);
    }
    public Perfil updatePerfil(Perfil nuevo){
        Perfil viejo=perfilRepo.findById(nuevo.getId()).get();
        viejo.setNombre(nuevo.getNombre());
        return perfilRepo.save(viejo);
    }
}
