package entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Categoria extends Base{
    private String nombre;
    private String descripcion;
}
