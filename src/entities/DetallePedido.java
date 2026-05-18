package entities;

import java.util.HashSet;
import java.util.Objects;

public class DetallePedido extends Base{

    private int cantidad;
    private Double subtotal;
    private Producto producto;

    public DetallePedido(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = cantidad * producto.getPrecio();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DetallePedido that = (DetallePedido) o;
        return cantidad == that.cantidad && Objects.equals(subtotal, that.subtotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantidad, subtotal);
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "\n\tid=" + getId() +
                "\n\t, eliminado=" + isEliminado() +
                "\n\t, createdAt=" + getCreatedAt() +
                "\n\t, cantidad=" + cantidad +
                "\n\t, subtotal=" + subtotal +
                "\n}";
    }
}
