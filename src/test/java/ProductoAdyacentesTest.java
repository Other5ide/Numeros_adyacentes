import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoAdyacentesTest {

    @Test
    void productoAdyacentesArregloUnitario() {
       assertEquals(1, ProductoAdyacentes.productoAdyacentes(new double[]{1}));
    }
    @Test
    void productoAdyacentesArregloVacio() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {ProductoAdyacentes.productoAdyacentes(new double[]{});});
    }

    @Test
    void productoAdyacentesArregloNulo() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {ProductoAdyacentes.productoAdyacentes(null);});
    }

    @Test
    void productoAdyacentesArregloNegativo() {
        assertEquals(100, ProductoAdyacentes.productoAdyacentes(new double[]{-1,-1,-2,-1,-100}));

    }

}