
public class ProductoAdyacentes {

    public static double productoAdyacentes(double[] arreglo) {
        double multiplicacionMayor = Double.MIN_VALUE;

        for (int i = 0; i < arreglo.length-1; i++) {
            if (arreglo[i]*arreglo[i+1] > multiplicacionMayor) {
                multiplicacionMayor = arreglo[i]*arreglo[i+1];
            }
        }

        return multiplicacionMayor;

    }
}
