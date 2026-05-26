package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"categoria"})
public class Producto extends Base{

    private String nombre;
    private Double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponibile;
    private Set<Categoria> categoria = new HashSet<>();

}
