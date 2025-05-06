import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProductoAdyacentesTest {
    @Test
    public void testCasoNormal() {
        double[] arreglo = {1, -4, 2, 2, 5, -1};
        assertEquals(10.0, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testConNegativos() {
        double[] arreglo = {-2.0, -3.0, 4.0};
        assertEquals(6.0, ProductoAdyacentes.productoAdyacentes(arreglo));
    }

    @Test
    public void testErrorArregloNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            ProductoAdyacentes.productoAdyacentes(null);
        });
    }

    @Test
    public void testErrorArregloMuyCorto() {
        double[] arreglo = {5.0};
        assertThrows(IllegalArgumentException.class, () -> {
            ProductoAdyacentes.productoAdyacentes(arreglo);
        });
    }

    @Test
    public void testErrorConNaN() {
        double[] arreglo = {1.0, Double.NaN, 2.0};
        assertThrows(IllegalArgumentException.class, () -> {
            ProductoAdyacentes.productoAdyacentes(arreglo);
        });
    }

    @Test
    public void testErrorConInfinito() {
        double[] arreglo = {1.0, Double.POSITIVE_INFINITY, 2.0};
        assertThrows(IllegalArgumentException.class, () -> {
            ProductoAdyacentes.productoAdyacentes(arreglo);
        });
    }

    @Test
    public void testProductoInfinito() {
        double[] arreglo = {Double.MAX_VALUE, Double.MAX_VALUE, 1.0};
        assertThrows(ArithmeticException.class, () -> {
            ProductoAdyacentes.productoAdyacentes(arreglo);
        });
    }
}