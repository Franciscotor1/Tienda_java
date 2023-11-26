public class Producto {
    // Atributos
    private int codigoProducto;
    private String descripcion;
    private String unidadMedida;
    private double precioCompra;
    private int cantidad;

    // Constructores
    public Producto(int codigoProducto, String descripcion, String unidadMedida, double precioCompra, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
    }

    // Métodos SET/GET
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para calcular el precio de venta
    public double calcularPrecioVenta() {
        // Lógica para calcular el precio de venta (puede ser personalizada)
        return precioCompra * 1.1;  // Aumento del 10%
    }

    // Método para calcular la ganancia
    public double calcularGanancia() {
        // Lógica para calcular la ganancia (puede ser personalizada)
        return calcularPrecioVenta() - precioCompra;
    }

    // Método para representar la información del producto
    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto=" + codigoProducto +
                ", descripcion='" + descripcion + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", precioCompra=" + precioCompra +
                ", cantidad=" + cantidad +
                '}';
    }
}
