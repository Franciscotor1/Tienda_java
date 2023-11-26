public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Producto
        Producto producto = new Producto(1, "Arroz", "kg", 2.5, 50);

        // Mostrar información del producto
        System.out.println(producto.toString());

        // Calcular y mostrar precio de venta y ganancia
        System.out.println("Precio de Venta: $" + producto.calcularPrecioVenta());
        System.out.println("Ganancia: $" + producto.calcularGanancia());
    }
}
