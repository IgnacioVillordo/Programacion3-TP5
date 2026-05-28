package entities;

import enums.Estado;
import enums.FormaPago;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true, exclude = "detalles")
@ToString
@SuperBuilder
public class Pedido extends Base implements Calculable{
    private LocalDate fecha;
    private Estado estado;
    private Double total = 0.0;
    private FormaPago formaPago;
    @Singular(value = "detalle")
    private Set<DetallePedido> detalles = new HashSet<>();
    private Usuario usuario;
    private Long detalleId = 0L;

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

