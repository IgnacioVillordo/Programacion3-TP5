package entities;

import enums.Rol;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Usuario extends Base{

    private String nombre;
    private String apellido;
    private String mail;
    private String celular;
    private String contrasena;
    private Rol rol;
    private Set<Pedido> pedidos = new HashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido no puede ser nulo");
        }
        if (pedidos == null) {
            pedidos = new HashSet<>();
        }
        pedidos.add(pedido);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido) && Objects.equals(mail, usuario.mail) && Objects.equals(celular, usuario.celular) && Objects.equals(contrasena, usuario.contrasena) && rol == usuario.rol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, apellido, mail, celular, contrasena, rol);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\n\tid=" + super.getId() +
                "\n\t, eliminado=" + super.isEliminado() +
                "\n\t, createdAt=" + super.getCreatedAt() +
                "\n\t, nombre='" + nombre + '\'' +
                "\n\t, apellido='" + apellido + '\'' +
                "\n\t, mail='" + mail + '\'' +
                "\n\t, celular='" + celular + '\'' +
                "\n\t, contrasena='" + contrasena + '\'' +
                "\n\t, rol=" + rol +
                "\n}";
    }
}
