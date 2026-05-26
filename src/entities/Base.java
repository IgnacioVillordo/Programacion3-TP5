package entities;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class Base {
    private Long id;
    private boolean eliminado;
    private LocalDateTime createdAt;
}
