package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Producto extends Base{

    private String nombre;
    private Double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponibile;
    private Set<Categoria> categoria = new HashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public void addCategoria(Categoria  categoria){
        this.categoria.add(categoria);
    }

    public void removeCategoria(Categoria categoria){
        this.categoria.remove(categoria);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Producto producto = (Producto) o;
        return super.equals(o) && Objects.equals(nombre, producto.nombre) && Objects.equals(precio, producto.precio) && Objects.equals(categoria, producto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, precio, categoria);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "\n\tid=" + super.getId() +
                ",\n\teliminado=" + super.isEliminado() +
                ",\n\tcreatedAt=" + super.getCreatedAt() +
                ",\n\tnombre='" + nombre + '\'' +
                ",\n\tprecio=" + precio +
                ",\n\tdescripcion='" + descripcion + '\'' +
                ",\n\tstock=" + stock +
                ",\n\timagen='" + imagen + '\'' +
                ",\n\tdisponibile=" + disponibile +
                ",\n\tcategoria=" + categoria +
                "\n}";
    }
}
