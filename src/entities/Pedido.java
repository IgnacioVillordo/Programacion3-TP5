package entities;

import enums.Estado;
import enums.FormaPago;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pedido extends Base implements Calculable{
    private LocalDate fecha;
    private Estado estado;
    private Double total = 0.0;
    private FormaPago formaPago;
    private Set<DetallePedido> detalles = new HashSet<>();
    private Usuario usuario;
    private Long detalleId = 0L;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Set<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(fecha, pedido.fecha) && estado == pedido.estado && Objects.equals(total, pedido.total) && formaPago == pedido.formaPago;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fecha, estado, total, formaPago);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "\n\tfecha=" + fecha +
                ",\n\testado=" + estado +
                ",\n\ttotal=" + total +
                ",\n\tformaPago=" + formaPago +
                ",\n\tdetalles=" + detalles +
                "\n}";
    }

    public void addDetallePedido(int cantidad, Producto producto) {
        DetallePedido detalle = new DetallePedido(cantidad, producto);
        detalle.setId(++detalleId);
        detalle.setEliminado(false);
        detalle.setCreatedAt(LocalDateTime.now());
        detalles.add(detalle);
        total += detalle.getSubtotal();
    }

    public DetallePedido findDetallePedido(Producto producto) {
        for (DetallePedido detalle : detalles) {
            if (detalle.getProducto().equals(producto)) {
                return detalle;
            }
        }
        return null;
    }

    public void deleteDetallePedido(Producto producto) {
        DetallePedido detalle = findDetallePedido(producto);
        if (detalle != null) {
            detalles.remove(detalle);
            total -= detalle.getSubtotal();
        }
    }

    @Override
    public void calcularTotal() {
        total = 0.0;
        for (DetallePedido d : detalles){
            total += d.getSubtotal();
        }
    }
}

