package ar.edu.tup.programacion3.entities;

import enums.Rol;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true, exclude = {"pedidos"})
@ToString
@SuperBuilder

public class Usuario extends Base{

    private String nombre;
    private String apellido;
    private String mail;
    private String celular;
    private String contrasena;
    private Rol rol;
    private Set<Pedido> pedidos;

    public void addPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido no puede ser nulo");
        }
        if (pedidos == null) {
            pedidos = new HashSet<>();
        }
        pedidos.add(pedido);
    }

}
