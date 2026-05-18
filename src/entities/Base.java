package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Base {
    private Long id;
    private boolean eliminado;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Base base = (Base) o;
        return eliminado == base.eliminado && Objects.equals(id, base.id) && Objects.equals(createdAt, base.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eliminado, createdAt);
    }

    @Override
    public String toString() {
        return "Base{" +
                "\n\tid=" + id +
                "\n\t, eliminado=" + eliminado +
                "\n\t, createdAt=" + createdAt +
                "\n}";
    }
}
