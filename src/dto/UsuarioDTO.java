package dto;

import entities.Pedido;
import entities.Usuario;

import java.util.Set;

public record UsuarioDTO(String nombre,
                         String apellido,
                         String mail,
                         String celular,
                         Set<Pedido> pedidos) {

    public UsuarioDTO toDTO(Usuario usuario){
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getNombre(), usuario.getApellido(), usuario.getMail(), usuario.getCelular(), usuario.getPedidos());
        return usuarioDTO;
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
