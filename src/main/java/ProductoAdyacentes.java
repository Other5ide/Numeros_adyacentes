
public class ProductoAdyacentes {

    public static double productoAdyacentes(double[] arreglo) {
        validarArreglo(arreglo);
        validarNumeros(arreglo);


        double multiplicacionMayor = Double.MIN_VALUE;
        if (!Double.isFinite(multiplicacionMayor)) {
            throw new ArithmeticException("Producto fuera de rango.");
        }

        for (int i = 0; i < arreglo.length-1; i++) {
            double producto = arreglo[i] * arreglo[i + 1];
            if (!Double.isFinite(producto)) {
                throw new ArithmeticException("Producto fuera de rango");
            }
            if (producto > multiplicacionMayor) {
                multiplicacionMayor = producto;
            }
        }

        return multiplicacionMayor;

    }

    private static void validarArreglo(double[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser null.");
        }

        if (arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe contener como mínimo dos elementos.");
        }
    }

    private static void validarNumeros(double[] arreglo) {
        for (double valor : arreglo) {
            if (!Double.isFinite(valor)) {
                throw new IllegalArgumentException("El arreglo contiene valores no numéricos");
            }
        }
    }
}
