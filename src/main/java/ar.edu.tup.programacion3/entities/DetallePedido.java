package entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DetallePedido extends Base{

    private int cantidad;
    private Double subtotal;
    private Producto producto;



}
