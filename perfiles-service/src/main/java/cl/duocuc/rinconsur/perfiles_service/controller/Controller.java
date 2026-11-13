package cl.duocuc.rinconsur.perfiles_service.controller;

import java.net.URI;
import java.sql.Blob;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.duocuc.rinconsur.perfiles_service.dto.ColaboradorRequestDTO;
import cl.duocuc.rinconsur.perfiles_service.model.Colaborador;
import cl.duocuc.rinconsur.perfiles_service.model.Perfil;
import cl.duocuc.rinconsur.perfiles_service.service.PerfilService;
@RestController 
@RequestMapping ("/perfil")
public class Controller {
    @Autowired 
    private PerfilService service;

    @GetMapping("/{id}")
    public ResponseEntity<Perfil> getPerfilById(@PathVariable Integer id){
        try {
            Perfil perfil=service.getPerfilById(id);
            if(!perfil.equals(null)){
                return ResponseEntity.ok(perfil);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping("/colab/{id}")
    public ResponseEntity<Colaborador> getColaboradorById(@PathVariable Integer id){
        try {
            Colaborador perfil=service.getColaboradorById(id);
            if(!perfil.equals(null)){
                return ResponseEntity.ok(perfil);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping ("/all")
    public ResponseEntity<List<Perfil>> listarPerfiles(){
        try {
            List<Perfil> lista= service.listarPerfiles();
            if(!lista.isEmpty()){
                return ResponseEntity.ok(lista);
            }else{
                return ResponseEntity.noContent().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @GetMapping ("/colab/all")
    public ResponseEntity<List<Colaborador>> listarColaboradores(){
        try {
            List<Colaborador> lista= service.listarColaboradores();
            if(!lista.isEmpty()){
                return ResponseEntity.ok(lista);
            }else{
                return ResponseEntity.noContent().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @GetMapping ("/colab/correo")
    public ResponseEntity<Colaborador> getColaboradorByCorreo(@RequestParam String correo){
        try {
            Colaborador perfil=service.getColaboradorByCorreo(correo);
            if(!perfil.equals(null)){
                return ResponseEntity.ok(perfil);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
    @GetMapping ("/colab/rut")
    public ResponseEntity<Colaborador> getColaboradorByRut(@RequestParam String rut){
        try {
            Colaborador perfil=service.getColaboradorByCorreo(correo);
            if(!perfil.equals(null)){
                return ResponseEntity.ok(perfil);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
    @PostMapping ("/colab")
    public ResponseEntity<Colaborador> addColaborador(@RequestBody Colaborador colaborador){
        try {
            Colaborador colaborador2=service.addColaborador(colaborador);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.badRequest().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/avatar/{id}")
    public ResponseEntity<Colaborador> updateAvatarOnColaborador(@PathVariable Integer id,@RequestParam  Blob avatar){
        try {
            Colaborador colaborador2=service.updateAvatarOnColaborador(id, avatar);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/clave/{id}")
    public ResponseEntity<Colaborador> updateClaveOnColaborador(@PathVariable Integer id,@RequestParam String clave){
        try {
            Colaborador colaborador2=service.updateClaveOnColaborador(id, clave);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/nombre/{id}")
    public ResponseEntity<Colaborador> updateNombreOnColaborador(@PathVariable Integer id,@RequestParam String nombre){
        try {
            Colaborador colaborador2=service.updateNombreOnColaborador(id, nombre);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/fono/{id}")
    public ResponseEntity<Colaborador> updateTelefonoOnColaborador(@PathVariable Integer id,@RequestParam  String telefono){
        try {
            Colaborador colaborador2=service.updateTelefonoOnColaborador(id, telefono);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/direc/{id}")
    public ResponseEntity<Colaborador> updateDireccionOnColaborador(@PathVariable Integer id,@RequestParam String direccion){
        try {
            Colaborador colaborador2=service.updateDireccionOnColaborador(id, direccion);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/comuna/{id}")
    public ResponseEntity<Colaborador> updateComunaOnColaborador(@PathVariable Integer id,@RequestParam String comuna){
        try {
            Colaborador colaborador2=service.updateComunaOnColaborador(id, comuna);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/active/{id}")
    public ResponseEntity<Colaborador> updateActivoOnColaborador(@PathVariable Integer id,@RequestParam Boolean activo){
        try {
            Colaborador colaborador2=service.updateActivoOnColaborador(id, activo);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PatchMapping ("/colab/perfil/{id}")
    public ResponseEntity<Colaborador> updatePerfilOnColaborador(@PathVariable Integer id,@RequestParam Perfil perfil){
        try {
            Colaborador colaborador2=service.updatePerfilOnColaborador(id, perfil);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping ("/colab")
    public ResponseEntity<Colaborador> updateColaborador(@RequestBody ColaboradorRequestDTO colaborador){
        try {
            Colaborador colaborador2=service.updateColaborador(colaborador);
            if(!colaborador2.equals(null)){
                return ResponseEntity.ok(colaborador2);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PutMapping 
    public ResponseEntity<Perfil> updatePerfil(@RequestBody Perfil nuevo){
        try {
            Perfil perfil=service.updatePerfil(nuevo);
            if(!perfil.equals(null)){
                return ResponseEntity.ok(perfil);
            }else{
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
