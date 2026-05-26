package entities;

import java.util.HashSet;
import java.util.Objects;

@Data
public class DetallePedido extends Base{

    private int cantidad;
    private Double subtotal;
    private Producto producto;

    public DetallePedido(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = cantidad * producto.getPrecio();
    }

}
