package ar.edu.tup.programacion3.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@NoArgsConstructor
public class Categoria extends Base{
    private String nombre;
    private String descripcion;
}
