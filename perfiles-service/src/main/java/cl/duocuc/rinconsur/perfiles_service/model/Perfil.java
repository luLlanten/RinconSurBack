package cl.duocuc.rinconsur.perfiles_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
@Entity
@Table (name = "perfil")
public class Perfil {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "perfil_id")
    private Integer id;

    @Column (nullable = false,unique = true)
    private String nombre;
}

