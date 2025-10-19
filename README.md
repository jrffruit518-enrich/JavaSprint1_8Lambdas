# JavaSprint1_8 - Resumen del Proyecto

## 📄 Descripción

Este proyecto contiene los ejercicios de Java correspondientes a Nivel 1 dentro del módulo JavaSprint1_8. El objetivo es practicar el uso de la API de Streams, expresiones Lambda, métodos referenciados, y interfaces funcionales, aplicados a la manipulación de listas y cadenas de texto. Cada ejercicio demuestra conceptos clave de programación funcional en Java, siguiendo buenas prácticas de código limpio y documentación.

## 📋 Organización de los ejercicios (Nivel 1)

Los ejercicios de Nivel 1 están organizados en carpetas separadas dentro de src/:

sprint1Tasca_S108Nivell1_1 → Ejercicio 1:
Crea una lista con los nombres de los meses del año usando un enum (Month). La clase principal (MonthMain) imprime los nombres de los meses en consola, demostrando el uso de enumeraciones.

sprint1Tasca_S108Nivell1_2 → Ejercicio 2:
Filtra una lista de nombres de meses (List<String>) para mostrar solo aquellos que contienen la letra "o" y tienen una longitud mayor a 5, usando stream().filter() y expresiones Lambda (MonthFilterMain).

sprint1Tasca_S108Nivell1_3 → Ejercicio 3:
Utiliza un enum (MonthLambdas) para listar los nombres de los meses, procesándolos con Arrays.stream().map().forEach() y expresiones Lambda exclusivamente (MonthPrint).

sprint1Tasca_S108Nivell1_4 → Ejercicio 4:
Similar a Ejercicio 3, pero usa métodos referenciados (MonthLambdas::getName y System.out::println) en lugar de expresiones Lambda para imprimir los nombres de los meses (MonthMethodReference).

sprint1Tasca_S108Nivell1_5 → Ejercicio 5:
Define una interfaz funcional (MyFunctional) con un método getPiValue() que retorna un double. En MyFunctionalMain, se instancia con una Lambda (() -> 3.1415) y se imprime el resultado.

sprint1Tasca_S108Nivell1_6 → Ejercicio 6:
Crea una lista mixta de números y cadenas (List<Object>), filtra las cadenas con stream().filter(), y las ordena por longitud ascendente con Comparator.comparingInt y una comparación secundaria alfabética (CadenaSort).

sprint1Tasca_S108Nivell1_7 → Ejercicio 7:
Usa la misma lista mixta de Ejercicio 6, pero ordena las cadenas por longitud descendente usando Comparator.comparingInt con negación (CadenaSortReverse). Nota: falta una comparación secundaria alfabética para longitudes iguales.

sprint1Tasca_S108Nivell1_8 → Ejercicio 8:
Define una interfaz funcional (StringReverse) con un método reverse() que recibe y retorna un String. En la clase principal, se instancia con una Lambda que invierte una cadena y se verifica el resultado.

Cada carpeta contiene el código fuente y un README específico con instrucciones y detalles del ejercicio.