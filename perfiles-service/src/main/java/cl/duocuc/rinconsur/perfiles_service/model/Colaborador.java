package cl.duocuc.rinconsur.perfiles_service.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 
@Table (name = "colaborador")
public class Colaborador {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "colaborador_id")
    private Integer id;
    @Column (nullable = false)
    private String nombre;
    @Column (nullable = false,unique = true)
    private String correo;
    @Column (nullable = false)
    private String clave;
    @OneToOne 
    @JoinColumn (name = "perfil_id")
    private Perfil perfil;
    @Column (nullable = true)
    private Blob avatar;
    @Column (nullable = false)
    private String telefono;
    @Column (nullable = false)
    private String rut;
    @Column (nullable = false)
    private String cargo;
    @Column (nullable = false)
    private String direccion;
    @Column (nullable = false)
    private String comuna;
    @Column (nullable = false)
    private Boolean activo;
}
