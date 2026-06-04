package ar.edu.tup.programacion3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true, exclude = {"categoria"})
@ToString
@SuperBuilder
@NoArgsConstructor
@Entity
public class Producto extends Base {

    private String nombre;
    private Double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponible;
    @Singular(value = "categoria")
    @ManyToMany
    @JoinTable(name = "producto_categoria",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private Set<Categoria> categoria = new HashSet<>();


    public void addCategoria(Categoria categoria) {
        this.categoria.add(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        this.categoria.remove(categoria);
    }


}
