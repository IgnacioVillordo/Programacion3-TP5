package entities;

import java.util.Objects;

public class Categoria extends Base{
    private String nombre;
    private String descripcion;
    private Base base;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nombre, categoria.nombre) && Objects.equals(descripcion, categoria.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "\n\tnombre='" + nombre + '\'' +
                "\n\t, descripcion='" + descripcion + '\'' +
                "\n}";
    }
}
