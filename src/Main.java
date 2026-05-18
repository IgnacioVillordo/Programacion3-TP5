import enums.Estado;
import enums.FormaPago;
import enums.Rol;
import entities.Categoria;
import entities.Pedido;
import entities.Producto;
import entities.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Usuario> usuarios = new HashSet<>();

        Usuario u1 = new Usuario();
        u1.setId(1L);
        u1.setEliminado(false);
        u1.setCreatedAt(LocalDateTime.now());
        u1.setNombre("Lionel");
        u1.setApellido("Messi");
        u1.setMail("liomessi@gmail.com");
        u1.setCelular("1234567890");
        u1.setContrasena("pass1234");
        u1.setRol(Rol.ADMIN);
        usuarios.add(u1);

        Usuario u2 = new Usuario();
        u2.setId(2L);
        u2.setEliminado(false);
        u2.setCreatedAt(LocalDateTime.now());
        u2.setNombre("Cristiano");
        u2.setApellido("Ronaldo");
        u2.setMail("cristiano.ronaldo@gmail.com");
        u2.setCelular("9876543210");
        u2.setContrasena("pass5678");
        u2.setRol(Rol.USER);
        usuarios.add(u2);

        Categoria electronica = new Categoria();
        electronica.setId(1L);
        electronica.setNombre("Electrónica");
        electronica.setDescripcion("Dispositivos tecnológicos, gadgets y accesorios.");
        electronica.setEliminado(false);
        electronica.setCreatedAt(LocalDateTime.of(2024, 1, 15, 10, 0));

        Categoria ropa = new Categoria();
        ropa.setId(2L);
        ropa.setNombre("Ropa y Accesorios");
        ropa.setDescripcion("Indumentaria, calzado y complementos de moda.");
        ropa.setEliminado(false);
        ropa.setCreatedAt(LocalDateTime.of(2024, 1, 15, 10, 0));

        Categoria hogar = new Categoria();
        hogar.setId(3L);
        hogar.setNombre("Hogar y Cocina");
        hogar.setDescripcion("Artículos de decoración, menaje y equipamiento para el hogar.");
        hogar.setEliminado(false);
        hogar.setCreatedAt(LocalDateTime.of(2024, 1, 15, 10, 0));

        Set<Producto> productos = new HashSet<>();

        Producto auriculares = new Producto();
        auriculares.setId(1L);
        auriculares.setNombre("Auriculares Bluetooth Pro");
        auriculares.setPrecio(89.99);
        auriculares.setDescripcion("Auriculares inalámbricos con cancelación activa de ruido y 30 h de autonomía.");
        auriculares.setStock(45);
        auriculares.setImagen("auriculares-bt-pro.jpg");
        auriculares.setDisponibile(true);
        auriculares.setEliminado(false);
        auriculares.setCreatedAt(LocalDateTime.now());
        auriculares.addCategoria(electronica);
        productos.add(auriculares);

        Producto laptop = new Producto();
        laptop.setId(2L);
        laptop.setNombre("Laptop UltraSlim 14");
        laptop.setPrecio(1199.99);
        laptop.setDescripcion("Notebook con procesador i7, 16 GB RAM, SSD 512 GB y pantalla Full HD.");
        laptop.setStock(12);
        laptop.setImagen("laptop-ultraslim.jpg");
        laptop.setDisponibile(true);
        laptop.setEliminado(false);
        laptop.setCreatedAt(LocalDateTime.now());
        laptop.addCategoria(electronica);
        productos.add(laptop);

        Producto smartwatch = new Producto();
        smartwatch.setId(3L);
        smartwatch.setNombre("Smartwatch Serie X");
        smartwatch.setPrecio(249.99);
        smartwatch.setDescripcion("Reloj inteligente con monitor cardíaco, GPS y resistencia al agua IP68.");
        smartwatch.setStock(0);
        smartwatch.setImagen("smartwatch-serie-x.jpg");
        smartwatch.setDisponibile(false);
        smartwatch.setEliminado(false);
        smartwatch.setCreatedAt(LocalDateTime.now());
        smartwatch.addCategoria(electronica);
        productos.add(smartwatch);

        Producto zapatillas = new Producto();
        zapatillas.setId(4L);
        zapatillas.setNombre("Zapatillas Running Air");
        zapatillas.setPrecio(74.99);
        zapatillas.setDescripcion("Calzado deportivo con suela de amortiguación y tejido transpirable.");
        zapatillas.setStock(60);
        zapatillas.setImagen("zapatillas-running-air.jpg");
        zapatillas.setDisponibile(true);
        zapatillas.setEliminado(false);
        zapatillas.setCreatedAt(LocalDateTime.now());
        zapatillas.addCategoria(ropa);
        productos.add(zapatillas);

        Producto remera = new Producto();
        remera.setId(5L);
        remera.setNombre("Remera Algodón Premium");
        remera.setPrecio(19.99);
        remera.setDescripcion("Remera 100% algodón peinado, corte regular, disponible en 8 colores.");
        remera.setStock(200);
        remera.setImagen("remera-algodon-premium.jpg");
        remera.setDisponibile(true);
        remera.setEliminado(false);
        remera.setCreatedAt(LocalDateTime.now());
        remera.addCategoria(ropa);
        productos.add(remera);

        Producto campera = new Producto();
        campera.setId(6L);
        campera.setNombre("Campera Impermeable Trekking");
        campera.setPrecio(129.99);
        campera.setDescripcion("Campera con membrana impermeable, capucha ajustable y bolsillos con cierre.");
        campera.setStock(30);
        campera.setImagen("campera-trekking.jpg");
        campera.setDisponibile(true);
        campera.setEliminado(false);
        campera.setCreatedAt(LocalDateTime.of(2025, 3, 1, 10, 0));
        campera.addCategoria(ropa);
        productos.add(campera);

        Producto amazonEcho  = new Producto();
        amazonEcho.setId(7L);
        amazonEcho.setNombre("Amazon Echo");
        amazonEcho.setPrecio(124.99);
        amazonEcho.setDescripcion("Parlante con asistente virtual");
        amazonEcho.setStock(25);
        amazonEcho.setImagen("amazon-echo.jpg");
        amazonEcho.setDisponibile(true);
        amazonEcho.setEliminado(false);
        amazonEcho.setCreatedAt(LocalDateTime.now());
        amazonEcho.addCategoria(hogar);
        productos.add(amazonEcho);

        Producto setOllas = new Producto();
        setOllas.setId(8L);
        setOllas.setNombre("Set de Ollas Antiadherentes x6");
        setOllas.setPrecio(89.99);
        setOllas.setDescripcion("Juego de 6 ollas con recubrimiento antiadherente, apto para todo tipo de cocinas.");
        setOllas.setStock(18);
        setOllas.setImagen("set-ollas-antiadherentes.jpg");
        setOllas.setDisponibile(true);
        setOllas.setEliminado(false);
        setOllas.setCreatedAt(LocalDateTime.now());
        setOllas.addCategoria(hogar);
        productos.add(setOllas);

        Producto alfombra = new Producto();
        alfombra.setId(9L);
        alfombra.setNombre("Alfombra Escandinava 160x230");
        alfombra.setPrecio(149.99);
        alfombra.setDescripcion("Alfombra de estilo nórdico con pelo corto, lavable en lavarropas.");
        alfombra.setStock(0);
        alfombra.setImagen("alfombra-escandinava.jpg");
        alfombra.setDisponibile(false);
        alfombra.setEliminado(false);
        alfombra.setCreatedAt(LocalDateTime.now());
        alfombra.addCategoria(hogar);
        productos.add(alfombra);

        Producto maletinLaptop = new Producto();
        maletinLaptop.setId(10L);
        maletinLaptop.setNombre("Maletín Porta Laptop 15\"");
        maletinLaptop.setPrecio(39.99);
        maletinLaptop.setDescripcion("Maletín de cuero sintético con compartimento acolchado y bolsillos organizadores.");
        maletinLaptop.setStock(55);
        maletinLaptop.setImagen("maletin-porta-laptop.jpg");
        maletinLaptop.setDisponibile(true);
        maletinLaptop.setEliminado(false);
        maletinLaptop.setCreatedAt(LocalDateTime.now());
        maletinLaptop.addCategoria(electronica);
        maletinLaptop.addCategoria(ropa);
        productos.add(maletinLaptop);

        Pedido p1 = new Pedido();
        p1.setId(1L);
        p1.setEliminado(false);
        p1.setCreatedAt(LocalDateTime.of(2025,11, 4, 23, 12));
        p1.setUsuario(u1);
        p1.setEstado(Estado.PENDIENTE);
        p1.setFecha(LocalDate.of(2025, 11, 5));
        p1.setFormaPago(FormaPago.TARJETA);
        p1.addDetallePedido(1, campera);
        p1.addDetallePedido(2, amazonEcho);
        p1.addDetallePedido(1, setOllas);
        u1.addPedido(p1);
        p1.calcularTotal();



        Pedido p2 = new Pedido();
        p2.setId(2L);
        p2.setEliminado(false);
        p2.setCreatedAt(LocalDateTime.of(2025,11, 28, 8, 23));
        p2.setUsuario(u2);
        p2.setEstado(Estado.CONFIRMADO);
        p2.setFecha(LocalDate.of(2025, 11, 28));
        p2.setFormaPago(FormaPago.TARJETA);
        p2.addDetallePedido(3, remera);
        p2.addDetallePedido(2, campera);
        p2.addDetallePedido(1, zapatillas);
        p2.addDetallePedido(1, laptop);
        p2.addDetallePedido(1, maletinLaptop);
        u2.addPedido(p2);
        p2.calcularTotal();

        Pedido p3 = new Pedido();
        p3.setId(3L);
        p3.setEliminado(false);
        p3.setCreatedAt(LocalDateTime.of(2023,4, 2, 13, 23));
        p3.setUsuario(u2);
        p3.setEstado(Estado.CONFIRMADO);
        p3.setFecha(LocalDate.of(2023, 4, 2));
        p3.setFormaPago(FormaPago.TRANSFERENCIA);
        p3.addDetallePedido(3, auriculares);
        p3.addDetallePedido(1, laptop);
        p3.addDetallePedido(1, maletinLaptop);
        u2.addPedido(p3);
        p3.calcularTotal();

        System.out.println("====== Impresión de producto ======");
        System.out.println(amazonEcho);
        System.out.println("====== Impresión de listado de productos ======");
        System.out.println(productos);
        System.out.println("====== Impresión de primer pedido ======");
        System.out.println(p1);
        System.out.println("====== Impresión de segundo pedido ======");
        System.out.println(p2);
        System.out.println("====== Impresión de tercer pedido ======");
        System.out.println(p3);

        usuarios.stream().max(Comparator.comparingInt(u -> u.getPedidos().size())).ifPresent(u -> System.out.println("Usuario con más pedidos: " + u + "\n" + u.getPedidos()));

        Producto camperaComparar = new Producto();
        camperaComparar.setId(6L);
        camperaComparar.setNombre("Campera Impermeable Trekking");
        camperaComparar.setPrecio(129.99);
        camperaComparar.setDescripcion("Campera con membrana impermeable, capucha ajustable y bolsillos con cierre. Prueba comparación");
        camperaComparar.setStock(0);
        camperaComparar.setImagen("campera-trekking-prueba.jpg");
        camperaComparar.setDisponibile(false);
        camperaComparar.setEliminado(false);
        camperaComparar.setCreatedAt(LocalDateTime.of(2025, 3, 1, 10, 0));
        camperaComparar.addCategoria(ropa);

        for (Producto p : productos){
            System.out.println( "(" + p.getId() + " " +  p.getNombre() + ")" + " - " + p.equals(camperaComparar) + " - " + "(" + camperaComparar.getId() + " " + camperaComparar.getNombre() + ")");
        }
    }
}