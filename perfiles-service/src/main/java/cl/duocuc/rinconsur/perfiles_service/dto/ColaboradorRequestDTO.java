package cl.duocuc.rinconsur.perfiles_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class ColaboradorRequestDTO {
    private Integer id;
    private String nombre;
    private String rut;
    private String cargo;
    private String telefono;
}
