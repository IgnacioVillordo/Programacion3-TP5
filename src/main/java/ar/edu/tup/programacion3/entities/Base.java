package ar.edu.tup.programacion3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@MappedSuperclass
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean eliminado;
    private LocalDateTime createdAt;
}
