# Numeros Ordenados
## 1. Descripcion del problema
Se requiere un programa en Java para determinar cuál es el número más pequeño, 
cuál es el número más grande y cuál es el número intermedio de los tres ingresados.
## 2. Definicion de la solucion
~~~
++ENTRADA
float numero1, numero2, numero3

++Proceso
Solicitar los numeros 

*Si el primer numero es mayor que el segundo, y si el primero tambien es mayor al tercero, 
el numero mayor es el primero
   *Si el segundo numero es mayor al tercero, el numero intermerdio es el segundo,
    y tercer numero es el menor de estos
      -Si el segundo no es mayor que el tercer numero el numero mayor es el primer numero,
      el intermedio el tercero y el segundo el numero menor
   Si el primer numero no es mayor que el tercer numero, el numero mayor es el tercer numero ingresado,
   el intermedio sera el primero, y el menor de estos sera el segundo que halla sido ingresados
*Si el primer numero no es mayor al segundo, y este a su vez es mayor al tercero, el mayor es el segundo,
intermedio el tercero y el primer numero sera el menor de estos
*Si el primer numero no es mayor al segundo y el segundo a su vez no es mayor al primero, el numero mayor
es el tercero, el segundo es el intermedio y el menor es el primero
~~~

## 3. Diseño de la Solucion

![](https://github.com/rigo1012/Ejercicio3.1/blob/master/src/Numeros/MayoryMenor.png)
