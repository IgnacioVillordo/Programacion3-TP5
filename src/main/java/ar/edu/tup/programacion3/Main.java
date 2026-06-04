package ar.edu.tup.programacion3;

import ar.edu.tup.programacion3.entities.*;
import ar.edu.tup.programacion3.enums.Estado;
import ar.edu.tup.programacion3.enums.FormaPago;
import ar.edu.tup.programacion3.enums.Rol;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Usuario> usuarios = new HashSet<>();

        Usuario u1 = Usuario.builder()
                .nombre("Juan")
                .apellido("Perez")
                .mail("juanperez@mail.com")
                .celular("12345678")
                .contrasena("contra1234")
                .rol(Rol.USER)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .build();
        usuarios.add(u1);

        Usuario u2 = Usuario.builder()
                .nombre("Diego")
                .apellido("Fernandez")
                .rol(Rol.ADMIN)
                .mail("diego.fernandez@example.com")
                .contrasena("pass123")
                .celular("87654321")
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .build();
        usuarios.add(u2);

        Categoria electronica = Categoria.builder()
                .nombre("Electrónica")
                .descripcion("Dispositivos tecnológicos, gadgets y accesorios.")
                .eliminado(false)
                .createdAt(LocalDateTime.of(2024, 1, 15, 10, 0))
                .build();

        Categoria ropa = Categoria.builder()
                .nombre("Ropa y Accesorios")
                .descripcion("Indumentaria, calzado y complementos de moda.")
                .eliminado(false)
                .createdAt(LocalDateTime.of(2024, 1, 15, 10, 0))
                .build();

        Categoria hogar = Categoria.builder()
                .nombre("Hogar y Cocina")
                .descripcion("Artículos de decoración, menaje y equipamiento para el hogar.")
                .eliminado(false)
                .createdAt(LocalDateTime.of(2024, 1, 15, 10, 0))
                .build();

        Set<Producto> productos = new HashSet<>();

        Producto auriculares = Producto.builder()
                .nombre("Auriculares Bluetooth Pro")
                .precio(89.99)
                .descripcion("Auriculares inalámbricos con cancelación activa de ruido y 30 h de autonomía.")
                .stock(45)
                .imagen("auriculares-bt-pro.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(electronica)
                .build();
        productos.add(auriculares);

        Producto laptop = Producto.builder()
                .nombre("Laptop UltraSlim 14")
                .precio(1199.99)
                .descripcion("Notebook con procesador i7, 16 GB RAM, SSD 512 GB y pantalla Full HD.")
                .stock(12)
                .imagen("laptop-ultraslim.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(electronica)
                .build();
        productos.add(laptop);

        Producto smartwatch = Producto.builder()
                .nombre("Smartwatch Serie X")
                .precio(249.99)
                .descripcion("Reloj inteligente con monitor cardíaco, GPS y resistencia al agua IP68.")
                .stock(0)
                .imagen("smartwatch-serie-x.jpg")
                .disponible(false)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(electronica)
                .build();
        productos.add(smartwatch);

        Producto zapatillas = Producto.builder()
                .nombre("Zapatillas Running Air")
                .precio(74.99)
                .descripcion("Calzado deportivo con suela de amortiguación y tejido transpirable.")
                .stock(60)
                .imagen("zapatillas-running-air.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(ropa)
                .build();
        productos.add(zapatillas);

        Producto remera = Producto.builder()
                .nombre("Remera Algodón Premium")
                .precio(19.99)
                .descripcion("Remera 100% algodón peinado, corte regular, disponible en 8 colores.")
                .stock(200)
                .imagen("remera-algodon-premium.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(ropa)
                .build();
        productos.add(remera);

        Producto campera = Producto.builder()
                .nombre("Campera Impermeable Trekking")
                .precio(129.99)
                .descripcion("Campera con membrana impermeable, capucha ajustable y bolsillos con cierre.")
                .stock(30)
                .imagen("campera-trekking.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.of(2025, 3, 1, 10, 0))
                .categoria(ropa)
                .build();
        productos.add(campera);

        Producto amazonEcho = Producto.builder()
                .nombre("Amazon Echo")
                .precio(124.99)
                .descripcion("Parlante con asistente virtual")
                .stock(25)
                .imagen("amazon-echo.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(hogar)
                .build();
        productos.add(amazonEcho);

        Producto setOllas = Producto.builder()
                .nombre("Set de Ollas Antiadherentes x6")
                .precio(89.99)
                .descripcion("Juego de 6 ollas con recubrimiento antiadherente, apto para todo tipo de cocinas.")
                .stock(18)
                .imagen("set-ollas-antiadherentes.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(hogar)
                .build();
        productos.add(setOllas);

        Producto alfombra = Producto.builder()
                .nombre("Alfombra Escandinava 160x230")
                .precio(149.99)
                .descripcion("Alfombra de estilo nórdico con pelo corto, lavable en lavarropas.")
                .stock(0)
                .imagen("alfombra-escandinava.jpg")
                .disponible(false)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(hogar)
                .build();
        productos.add(alfombra);

        Producto maletinLaptop = Producto.builder()
                .nombre("Maletín Porta Laptop 15\"")
                .precio(39.99)
                .descripcion("Maletín de cuero sintético con compartimento acolchado y bolsillos organizadores.")
                .stock(55)
                .imagen("maletin-porta-laptop.jpg")
                .disponible(true)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .categoria(electronica)
                .categoria(ropa)
                .build();
        productos.add(maletinLaptop);

        Pedido p1 = Pedido.builder()
                .eliminado(false)
                .createdAt(LocalDateTime.of(2025, 11, 4, 23, 12))
                .usuario(u1)
                .estado(Estado.PENDIENTE)
                .fecha(LocalDate.of(2025, 11, 5))
                .formaPago(FormaPago.TARJETA)
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(1).producto(campera).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(2).producto(amazonEcho).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(1).producto(setOllas).build())
                .build();
        u1.addPedido(p1);
        p1.getDetalles().forEach(DetallePedido::calcularSubtotal);
        p1.calcularTotal();


        Pedido p2 = Pedido.builder()
                .eliminado(false)
                .createdAt(LocalDateTime.of(2025, 11, 28, 8, 23))
                .usuario(u2)
                .estado(Estado.CONFIRMADO)
                .fecha(LocalDate.of(2025, 11, 28))
                .formaPago(FormaPago.TARJETA)
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(3).producto(remera).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(2).producto(campera).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(1).producto(zapatillas).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(1).producto(laptop).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(1).producto(maletinLaptop).build())
                .build();
        u2.addPedido(p2);
        p2.getDetalles().forEach(DetallePedido::calcularSubtotal);
        p2.calcularTotal();


        Pedido p3 = Pedido.builder()
                .eliminado(false)
                .createdAt(LocalDateTime.of(2023, 4, 2, 13, 23))
                .usuario(u2)
                .estado(Estado.CONFIRMADO)
                .fecha(LocalDate.of(2023, 4, 2))
                .formaPago(FormaPago.TRANSFERENCIA)
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(3).producto(auriculares).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(1).producto(laptop).build())
                .detalle(DetallePedido.builder().createdAt(LocalDateTime.now()).cantidad(1).producto(maletinLaptop).build())
                .build();
        u2.addPedido(p3);
        p3.getDetalles().forEach(DetallePedido::calcularSubtotal);
        p3.calcularTotal();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp8-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(u1);
        entityManager.persist(u2);
        entityManager.persist(electronica);
        entityManager.persist(ropa);
        entityManager.persist(hogar);
        entityManager.persist(auriculares);
        entityManager.persist(laptop);
        entityManager.persist(smartwatch);
        entityManager.persist(zapatillas);
        entityManager.persist(remera);
        entityManager.persist(campera);
        entityManager.persist(amazonEcho);
        entityManager.persist(setOllas);
        entityManager.persist(alfombra);
        entityManager.persist(maletinLaptop);
        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.getTransaction().commit();

        campera.setPrecio(79.99);
        amazonEcho.setPrecio(99.99);
        entityManager.getTransaction().begin();
        entityManager.merge(campera);
        entityManager.merge(amazonEcho);
        entityManager.getTransaction().commit();

        System.out.println("Buscando usuario con ID 1...");
        Usuario usuarioPorId = entityManager.find(Usuario.class, 1L);
        if(usuarioPorId != null) {
            System.out.println("Usuario encontrado: " + usuarioPorId);
        } else {
            System.out.println("Usuario no encontrado");
        }

        System.out.println("Buscando usuario con email juanperez@mail.com");

        Usuario usuarioPorEmail = entityManager.createQuery("SELECT u FROM Usuario u WHERE u.mail = :mail", Usuario.class).setParameter("mail", "juanperez@mail.com").getSingleResult();
        if(usuarioPorEmail != null){
            System.out.println("Usuario encontrado: " + usuarioPorEmail);
        } else {
            System.out.println("Usuario no encontrado");
        }

        entityManager.getTransaction().begin();
        entityManager.remove(u1);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();



    }
}