package ar.edu.tup.programacion3.dtos;

import ar.edu.tup.programacion3.entities.Pedido;
import ar.edu.tup.programacion3.entities.Usuario;

import java.util.Set;

public record UsuarioDTO(String nombre,
                         String apellido,
                         String mail,
                         String celular,
                         Set<Pedido> pedidos) {

    public UsuarioDTO toDTO(Usuario usuario){
        return new UsuarioDTO(usuario.getNombre(), usuario.getApellido(), usuario.getMail(), usuario.getCelular(), usuario.getPedidos());
    }

    public Usuario toEntity(UsuarioDTO usuarioDTO){
        return Usuario.builder()
                .nombre(usuarioDTO.nombre())
                .apellido(usuarioDTO.apellido())
                .mail(usuarioDTO.mail())
                .celular(usuarioDTO.celular())
                .pedidos(usuarioDTO.pedidos())
                .build();
    }
}
