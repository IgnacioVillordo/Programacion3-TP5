import entities.*;
import enums.Estado;
import enums.FormaPago;
import enums.Rol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Entrega TP5

//        Set<Usuario> usuarios = new HashSet<>();
//
//        Usuario u1 = new Usuario();
//        u1.setId(1L);
//        u1.setEliminado(false);
//        u1.setCreatedAt(LocalDateTime.now());
//        u1.setNombre("Lionel");
//        u1.setApellido("Messi");
//        u1.setMail("liomessi@gmail.com");
//        u1.setCelular("1234567890");
//        u1.setContrasena("pass1234");
//        u1.setRol(Rol.ADMIN);
//        usuarios.add(u1);
//
//        Usuario u2 = new Usuario();
//        u2.setId(2L);
//        u2.setEliminado(false);
//        u2.setCreatedAt(LocalDateTime.now());
//        u2.setNombre("Cristiano");
//        u2.setApellido("Ronaldo");
//        u2.setMail("cristiano.ronaldo@gmail.com");
//        u2.setCelular("9876543210");
//        u2.setContrasena("pass5678");
//        u2.setRol(Rol.USER);
//        usuarios.add(u2);
//
//        Categoria electronica = new Categoria();
//        electronica.setId(1L);
//        electronica.setNombre("Electrónica");
//        electronica.setDescripcion("Dispositivos tecnológicos, gadgets y accesorios.");
//        electronica.setEliminado(false);
//        electronica.setCreatedAt(LocalDateTime.of(2024, 1, 15, 10, 0));
//
//        Categoria ropa = new Categoria();
//        ropa.setId(2L);
//        ropa.setNombre("Ropa y Accesorios");
//        ropa.setDescripcion("Indumentaria, calzado y complementos de moda.");
//        ropa.setEliminado(false);
//        ropa.setCreatedAt(LocalDateTime.of(2024, 1, 15, 10, 0));
//
//        Categoria hogar = new Categoria();
//        hogar.setId(3L);
//        hogar.setNombre("Hogar y Cocina");
//        hogar.setDescripcion("Artículos de decoración, menaje y equipamiento para el hogar.");
//        hogar.setEliminado(false);
//        hogar.setCreatedAt(LocalDateTime.of(2024, 1, 15, 10, 0));
//
//        Set<Producto> productos = new HashSet<>();
//
//        Producto auriculares = new Producto();
//        auriculares.setId(1L);
//        auriculares.setNombre("Auriculares Bluetooth Pro");
//        auriculares.setPrecio(89.99);
//        auriculares.setDescripcion("Auriculares inalámbricos con cancelación activa de ruido y 30 h de autonomía.");
//        auriculares.setStock(45);
//        auriculares.setImagen("auriculares-bt-pro.jpg");
//        auriculares.setDisponible(true);
//        auriculares.setEliminado(false);
//        auriculares.setCreatedAt(LocalDateTime.now());
//        auriculares.addCategoria(electronica);
//        productos.add(auriculares);
//
//        Producto laptop = new Producto();
//        laptop.setId(2L);
//        laptop.setNombre("Laptop UltraSlim 14");
//        laptop.setPrecio(1199.99);
//        laptop.setDescripcion("Notebook con procesador i7, 16 GB RAM, SSD 512 GB y pantalla Full HD.");
//        laptop.setStock(12);
//        laptop.setImagen("laptop-ultraslim.jpg");
//        laptop.setDisponible(true);
//        laptop.setEliminado(false);
//        laptop.setCreatedAt(LocalDateTime.now());
//        laptop.addCategoria(electronica);
//        productos.add(laptop);
//
//        Producto smartwatch = new Producto();
//        smartwatch.setId(3L);
//        smartwatch.setNombre("Smartwatch Serie X");
//        smartwatch.setPrecio(249.99);
//        smartwatch.setDescripcion("Reloj inteligente con monitor cardíaco, GPS y resistencia al agua IP68.");
//        smartwatch.setStock(0);
//        smartwatch.setImagen("smartwatch-serie-x.jpg");
//        smartwatch.setDisponible(false);
//        smartwatch.setEliminado(false);
//        smartwatch.setCreatedAt(LocalDateTime.now());
//        smartwatch.addCategoria(electronica);
//        productos.add(smartwatch);
//
//        Producto zapatillas = new Producto();
//        zapatillas.setId(4L);
//        zapatillas.setNombre("Zapatillas Running Air");
//        zapatillas.setPrecio(74.99);
//        zapatillas.setDescripcion("Calzado deportivo con suela de amortiguación y tejido transpirable.");
//        zapatillas.setStock(60);
//        zapatillas.setImagen("zapatillas-running-air.jpg");
//        zapatillas.setDisponible(true);
//        zapatillas.setEliminado(false);
//        zapatillas.setCreatedAt(LocalDateTime.now());
//        zapatillas.addCategoria(ropa);
//        productos.add(zapatillas);
//
//        Producto remera = new Producto();
//        remera.setId(5L);
//        remera.setNombre("Remera Algodón Premium");
//        remera.setPrecio(19.99);
//        remera.setDescripcion("Remera 100% algodón peinado, corte regular, disponible en 8 colores.");
//        remera.setStock(200);
//        remera.setImagen("remera-algodon-premium.jpg");
//        remera.setDisponible(true);
//        remera.setEliminado(false);
//        remera.setCreatedAt(LocalDateTime.now());
//        remera.addCategoria(ropa);
//        productos.add(remera);
//
//        Producto campera = new Producto();
//        campera.setId(6L);
//        campera.setNombre("Campera Impermeable Trekking");
//        campera.setPrecio(129.99);
//        campera.setDescripcion("Campera con membrana impermeable, capucha ajustable y bolsillos con cierre.");
//        campera.setStock(30);
//        campera.setImagen("campera-trekking.jpg");
//        campera.setDisponible(true);
//        campera.setEliminado(false);
//        campera.setCreatedAt(LocalDateTime.of(2025, 3, 1, 10, 0));
//        campera.addCategoria(ropa);
//        productos.add(campera);
//
//        Producto amazonEcho  = new Producto();
//        amazonEcho.setId(7L);
//        amazonEcho.setNombre("Amazon Echo");
//        amazonEcho.setPrecio(124.99);
//        amazonEcho.setDescripcion("Parlante con asistente virtual");
//        amazonEcho.setStock(25);
//        amazonEcho.setImagen("amazon-echo.jpg");
//        amazonEcho.setDisponible(true);
//        amazonEcho.setEliminado(false);
//        amazonEcho.setCreatedAt(LocalDateTime.now());
//        amazonEcho.addCategoria(hogar);
//        productos.add(amazonEcho);
//
//        Producto setOllas = new Producto();
//        setOllas.setId(8L);
//        setOllas.setNombre("Set de Ollas Antiadherentes x6");
//        setOllas.setPrecio(89.99);
//        setOllas.setDescripcion("Juego de 6 ollas con recubrimiento antiadherente, apto para todo tipo de cocinas.");
//        setOllas.setStock(18);
//        setOllas.setImagen("set-ollas-antiadherentes.jpg");
//        setOllas.setDisponible(true);
//        setOllas.setEliminado(false);
//        setOllas.setCreatedAt(LocalDateTime.now());
//        setOllas.addCategoria(hogar);
//        productos.add(setOllas);
//
//        Producto alfombra = new Producto();
//        alfombra.setId(9L);
//        alfombra.setNombre("Alfombra Escandinava 160x230");
//        alfombra.setPrecio(149.99);
//        alfombra.setDescripcion("Alfombra de estilo nórdico con pelo corto, lavable en lavarropas.");
//        alfombra.setStock(0);
//        alfombra.setImagen("alfombra-escandinava.jpg");
//        alfombra.setDisponible(false);
//        alfombra.setEliminado(false);
//        alfombra.setCreatedAt(LocalDateTime.now());
//        alfombra.addCategoria(hogar);
//        productos.add(alfombra);
//
//        Producto maletinLaptop = new Producto();
//        maletinLaptop.setId(10L);
//        maletinLaptop.setNombre("Maletín Porta Laptop 15\"");
//        maletinLaptop.setPrecio(39.99);
//        maletinLaptop.setDescripcion("Maletín de cuero sintético con compartimento acolchado y bolsillos organizadores.");
//        maletinLaptop.setStock(55);
//        maletinLaptop.setImagen("maletin-porta-laptop.jpg");
//        maletinLaptop.setDisponible(true);
//        maletinLaptop.setEliminado(false);
//        maletinLaptop.setCreatedAt(LocalDateTime.now());
//        maletinLaptop.addCategoria(electronica);
//        maletinLaptop.addCategoria(ropa);
//        productos.add(maletinLaptop);
//
//        Pedido p1 = new Pedido();
//        p1.setId(1L);
//        p1.setEliminado(false);
//        p1.setCreatedAt(LocalDateTime.of(2025,11, 4, 23, 12));
//        p1.setUsuario(u1);
//        p1.setEstado(Estado.PENDIENTE);
//        p1.setFecha(LocalDate.of(2025, 11, 5));
//        p1.setFormaPago(FormaPago.TARJETA);
//        p1.addDetallePedido(1, campera);
//        p1.addDetallePedido(2, amazonEcho);
//        p1.addDetallePedido(1, setOllas);
//        u1.addPedido(p1);
//        p1.calcularTotal();
//
//
//
//        Pedido p2 = new Pedido();
//        p2.setId(2L);
//        p2.setEliminado(false);
//        p2.setCreatedAt(LocalDateTime.of(2025,11, 28, 8, 23));
//        p2.setUsuario(u2);
//        p2.setEstado(Estado.CONFIRMADO);
//        p2.setFecha(LocalDate.of(2025, 11, 28));
//        p2.setFormaPago(FormaPago.TARJETA);
//        p2.addDetallePedido(3, remera);
//        p2.addDetallePedido(2, campera);
//        p2.addDetallePedido(1, zapatillas);
//        p2.addDetallePedido(1, laptop);
//        p2.addDetallePedido(1, maletinLaptop);
//        u2.addPedido(p2);
//        p2.calcularTotal();
//
//        Pedido p3 = new Pedido();
//        p3.setId(3L);
//        p3.setEliminado(false);
//        p3.setCreatedAt(LocalDateTime.of(2023,4, 2, 13, 23));
//        p3.setUsuario(u2);
//        p3.setEstado(Estado.CONFIRMADO);
//        p3.setFecha(LocalDate.of(2023, 4, 2));
//        p3.setFormaPago(FormaPago.TRANSFERENCIA);
//        p3.addDetallePedido(3, auriculares);
//        p3.addDetallePedido(1, laptop);
//        p3.addDetallePedido(1, maletinLaptop);
//        u2.addPedido(p3);
//        p3.calcularTotal();
//
//        System.out.println("====== Impresión de producto ======");
//        System.out.println(amazonEcho);
//        System.out.println("====== Impresión de listado de productos ======");
//        System.out.println(productos);
//        System.out.println("====== Impresión de primer pedido ======");
//        System.out.println(p1);
//        System.out.println("====== Impresión de segundo pedido ======");
//        System.out.println(p2);
//        System.out.println("====== Impresión de tercer pedido ======");
//        System.out.println(p3);
//
//        usuarios.stream().max(Comparator.comparingInt(u -> u.getPedidos().size())).ifPresent(u -> System.out.println("Usuario con más pedidos: " + u + "\n" + u.getPedidos()));
//
//        Producto camperaComparar = new Producto();
//        camperaComparar.setId(6L);
//        camperaComparar.setNombre("Campera Impermeable Trekking");
//        camperaComparar.setPrecio(129.99);
//        camperaComparar.setDescripcion("Campera con membrana impermeable, capucha ajustable y bolsillos con cierre. Prueba comparación");
//        camperaComparar.setStock(0);
//        camperaComparar.setImagen("campera-trekking-prueba.jpg");
//        camperaComparar.setDisponible(false);
//        camperaComparar.setEliminado(false);
//        camperaComparar.setCreatedAt(LocalDateTime.of(2025, 3, 1, 10, 0));
//        camperaComparar.addCategoria(ropa);
//
//        for (Producto p : productos){
//            System.out.println( "(" + p.getId() + " " +  p.getNombre() + ")" + " - " + p.equals(camperaComparar) + " - " + "(" + camperaComparar.getId() + " " + camperaComparar.getNombre() + ")");
//        }
//      Fin entrega TP5

//        Entrega TP6

        Set<Usuario> usuarios = new HashSet<>();

        Usuario u1 = Usuario.builder()
                .nombre("Juan")
                .apellido("Perez")
                .mail("juanperez@mail.com")
                .celular("12345678")
                .contrasena("contra1234")
                .rol(Rol.USER)
                .id(1L)
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
                .id(2L)
                .eliminado(false)
                .createdAt(LocalDateTime.now())
                .build();
        usuarios.add(u2);

        Categoria electronica = Categoria.builder()
                .id(1L)
                .nombre("Electrónica")
                .descripcion("Dispositivos tecnológicos, gadgets y accesorios.")
                .eliminado(false)
                .createdAt(LocalDateTime.of(2024, 1, 15, 10, 0))
                .build();

        Categoria ropa = Categoria.builder()
                .id(2L)
                .nombre("Ropa y Accesorios")
                .descripcion("Indumentaria, calzado y complementos de moda.")
                .eliminado(false)
                .createdAt(LocalDateTime.of(2024, 1, 15, 10, 0))
                .build();

        Categoria hogar = Categoria.builder()
                .id(3L)
                .nombre("Hogar y Cocina")
                .descripcion("Artículos de decoración, menaje y equipamiento para el hogar.")
                .eliminado(false)
                .createdAt(LocalDateTime.of(2024, 1, 15, 10, 0))
                .build();

        Set<Producto> productos = new HashSet<>();

        Producto auriculares = Producto.builder()
                .id(1L)
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
                .id(2L)
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
                .id(3L)
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
                .id(4L)
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
                .id(5L)
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
                .id(6L)
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
                .id(7L)
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
                .id(8L)
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
                .id(9L)
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
                .id(10L)
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
                .id(1L)
                .eliminado(false)
                .createdAt(LocalDateTime.of(2025, 11, 4, 23, 12))
                .usuario(u1)
                .estado(Estado.PENDIENTE)
                .fecha(LocalDate.of(2025, 11, 5))
                .formaPago(FormaPago.TARJETA)
                .detalle(DetallePedido.builder().id(0L).createdAt(LocalDateTime.now()).cantidad(1).producto(campera).build())
                .detalle(DetallePedido.builder().id(1L).createdAt(LocalDateTime.now()).cantidad(2).producto(amazonEcho).build())
                .detalle(DetallePedido.builder().id(2L).createdAt(LocalDateTime.now()).cantidad(1).producto(setOllas).build())
                .build();
        u1.addPedido(p1);
        p1.calcularTotal();


        Pedido p2 = Pedido.builder()
                .id(2L)
                .eliminado(false)
                .createdAt(LocalDateTime.of(2025, 11, 28, 8, 23))
                .usuario(u2)
                .estado(Estado.CONFIRMADO)
                .fecha(LocalDate.of(2025, 11, 28))
                .formaPago(FormaPago.TARJETA)
                .detalle(DetallePedido.builder().id(3L).createdAt(LocalDateTime.now()).cantidad(3).producto(remera).build())
                .detalle(DetallePedido.builder().id(4L).createdAt(LocalDateTime.now()).cantidad(2).producto(campera).build())
                .detalle(DetallePedido.builder().id(5L).createdAt(LocalDateTime.now()).cantidad(1).producto(zapatillas).build())
                .detalle(DetallePedido.builder().id(6L).createdAt(LocalDateTime.now()).cantidad(1).producto(laptop).build())
                .detalle(DetallePedido.builder().id(7L).createdAt(LocalDateTime.now()).cantidad(1).producto(maletinLaptop).build())
                .build();
        u2.addPedido(p2);
        p2.calcularTotal();

        Pedido p3 = Pedido.builder()
                .id(3L)
                .eliminado(false)
                .createdAt(LocalDateTime.of(2023, 4, 2, 13, 23))
                .usuario(u2)
                .estado(Estado.CONFIRMADO)
                .fecha(LocalDate.of(2023, 4, 2))
                .formaPago(FormaPago.TRANSFERENCIA)
                .detalle(DetallePedido.builder().id(8L).createdAt(LocalDateTime.now()).cantidad(3).producto(auriculares).build())
                .detalle(DetallePedido.builder().id(9L).createdAt(LocalDateTime.now()).cantidad(1).producto(laptop).build())
                .detalle(DetallePedido.builder().id(10L).createdAt(LocalDateTime.now()).cantidad(1).producto(maletinLaptop).build())
                .build();
        u2.addPedido(p3);
        p3.calcularTotal();

        System.out.println(campera);
        System.out.println(productos);
        usuarios.stream().max(Comparator.comparingInt(u -> u.getPedidos().size())).ifPresent(u -> System.out.println("Usuario con más pedidos: " + u + "\n" + u.getPedidos()));

        Producto amazonEchoDuplicado  = Producto.builder()
                .id(7L)
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

        for (Producto p : productos) {
            System.out.println(p + " - " + p.equals(amazonEchoDuplicado) + " - " + amazonEchoDuplicado);
        }
//        Fin entrega TP6
//        Entrega TP7

        productos.stream().filter(Producto::isDisponible).forEach(System.out::println);
        System.out.println("Cantidad de elementos en el pedido 1: " + p1.getDetalles().stream().count());
        productos.stream().filter(p -> p.getStock() < 5).forEach(System.out::println);
//        Fin entrega TP7
    }
}