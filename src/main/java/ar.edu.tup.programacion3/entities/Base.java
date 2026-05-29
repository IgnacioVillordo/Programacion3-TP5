package entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Base {
    private Long id;
    private boolean eliminado;
    private LocalDateTime createdAt;
}
