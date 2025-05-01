
public class ProductoAdyacentes {

    public static double productoAdyacentes(double[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {

            throw new ArrayIndexOutOfBoundsException("El arreglo no puede ser vacio");
        }

        double multiplicacionMayor = arreglo[0];

        for (int i = 0; i < arreglo.length-1; i++) {
            if (arreglo[i]*arreglo[i+1] > multiplicacionMayor) {
                multiplicacionMayor = arreglo[i]*arreglo[i+1];
            }
        }

        return multiplicacionMayor;

    }
}
