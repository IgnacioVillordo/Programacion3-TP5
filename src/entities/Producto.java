package entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true, exclude = {"categoria"})
@ToString
@SuperBuilder
public class Producto extends Base{

    private String nombre;
    private Double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponible;
    @Singular(value = "categoria")
    private Set<Categoria> categoria = new HashSet<>();


    public void addCategoria(Categoria  categoria){
        this.categoria.add(categoria);
    }

    public void removeCategoria(Categoria categoria){
        this.categoria.remove(categoria);
    }


}
