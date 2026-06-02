package ar.edu.tup.programacion3.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Categoria extends Base{
    private String nombre;
    private String descripcion;
}
