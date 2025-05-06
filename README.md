## Actividad 0. Análisis del caso
i. Parametro de entrada: double[]
ii. Valor de retorno: double productoMayor
iii. Instrucciones: Iterar el arreglo de entrada e ir actualizando una variable cada vez que se encuentre un producto entre 2 numeros adyacentes mayor al valor de la variable, retornar el valor de la variable e imprimir en la consola dicho valor.

## Actividad 1: implemente su método
![image](https://github.com/user-attachments/assets/1356f375-0e42-490d-bf9b-d9cc45a2843f)

## Actividad 2: Probando su código
Caso de prueba 1: Arreglo con un solo elemento, el metodo deberia retornar solamente el valor de ese unico elemento y su test debe retornar el valor de ese elemento.
Caso de prueba 2: Arreglo vacio, el metodo deberia lanzar una excepcion IndexOutOfBounds y su test validar que la excepcion es efectivamente la misma que la esperada.
Caso de prueba 3: Arreglo nulo, el metodo debe lanzar una excepcion nullPointer y el test debe validar que la excepcion sea la esperada.
Caso de prueba 4: Arreglo negativo, el metodo debe retornar un numero positivo, el test debe retornar el valor esperado

## Actividad 3: Garantizando el éxito
Para garantizar el éxito del funcionamiénto del programa, se necesitarían aproximadamente 30-40 minutos. Incluyendo el análisis del caso y la implementación de la gestión de errores.

Posibles errores:
Error 1: Arreglo null, el método al recibir un arreglo null puede provocar una excepción NullPointerException cuando intente acceder a sus elementos.
Error 2: Arreglo con menos de dos elementos, en este caso no sería posible calcular el producto entre los elementos adyacentes.
Error 3: Elementos inválidos, como se está usando "double", este permite valores Nan, Infinity y -Infinity, lo que al realizar los cálculos puede dar resultados no válidos.
Error 4: Producto fuera de rango, osea, un producto entre dos valores extremos puede retornar Infinity sin dar un error de manera inmediata.

Soluciones:
Sol 1: Validar null y el tamaño mínimo
Sol 2: Validar los valores de los arreglos.
Sol 3: Validar que los productos son numéricamente válidos.
Sol 4: Usar excepciones con mensajes descriptivos para el usuario.

Después de aplicar las soluciones y testearlas, transcurrió un tiempo de 32 minutos.