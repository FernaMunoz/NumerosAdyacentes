# NumerosAdyacentes
Actividad: numeros adyacentes
tiempo que establecemos para terminar la actividad 0: 15 min
tiempo real: 22 min

Actividad 0 - Análisis del caso
parametros de entrada: una lista de numeros enteros, la lista con un largo min de 2 y max de 20 y que los numeros dentro de la lista esten entre -1000 y 1000

valor de retorno: el producto mayor encontrado entre las multiplicaciones de los numeros de la lista

importar el scanner y el math
crear la clase Main
pedir al usuario el largo de la lista (entre 2 y 20)
pedir al usuario los numeros enteros a ingresar a su lista
creacion de metodo fuera del Main
método multiplicar elementos lista comenzando de la posicion 0 de la lista
las multiplicaciones se guardaran en una lista
metodo buscar mayor
retornar por pantalla el producto mayor encotrado

Actividad 1: Implemente su método
tiempo esperado: 30min
tiempo real: 55 min
Integrar codigo

Actividad 2: Probando su código
Tiempo estimado: 60 min
Tiempo real: 28 min

//Casos no planteados por lo que no cuenta en el tiempo

Caso 1: numeros enteros pequeños y positivos {1,4,2,2,5,1} deberia retornar 10

Caso 2: numeros enteros negativos {-4,-5,-3,-10,-20} deberia retornar 200

Caso 3: numeros grandes y positivos {100, 200, 1000, 1000, 150,600} deberia retornar 1000000

caso 4: numeros positivos y negativos {-1, 50, -35, 100, -4, 60, -70} deberia retornar -50

actividad 3:
tiempo estimado 20min 
tiempo real: 25min

Excepción IllegalArgumentException en el método productoAdyacentes:
-Cuando el arreglo pasado como argumento es nulo o tiene menos de 2 elementos, se lanza una excepción con el 
mensaje: "El arreglo debe tener al menos dos elementos y no puede ser cero."
-Cuando el tamaño del arreglo supera los 20 elementos, se lanza una excepción con el mensaje: "El largo de la
lista no puede exceder las 20 variables, ingrese nuevamente un número."
-En el código, también se imprime un mensaje de error en caso de que la longitud del arreglo sea negativa: 
"Error: La longitud de la lista no puede ser un número negativo."
Excepción InputMismatchException en el método crearlista:
-Si el usuario ingresa un valor que no es un entero válido cuando se está llenando el arreglo, se lanzará una excepción de tipo InputMismatchException.



