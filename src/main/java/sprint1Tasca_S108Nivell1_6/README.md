# Sprint1Tasca_S108Nivell1_6 - Ordenar Cadenas por Longitud - Nivel 1, Ejercicio 6

## 📄 Descripción - Enunciado del ejercicio

Este proyecto implementa un programa en Java que crea una lista mixta con números y cadenas de texto, filtra las cadenas y las ordena por longitud de menor a mayor. Se utiliza la API de Streams para procesar la lista, con filter para seleccionar solo cadenas y sorted con Comparator.comparingInt para ordenar por longitud. Las cadenas ordenadas se imprimen en consola, cada una en una línea separada.

El sistema permite:





Crear una lista mixta con números y cadenas usando List<Object> (por ejemplo, [12, "baby", "center", 256, "hello", 38, "good"]).



Filtrar las cadenas con filter(o -> o != null && o instanceof String), excluyendo números y valores nulos.



Ordenar las cadenas por longitud usando Comparator.comparingInt con una expresión Lambda.



Imprimir las cadenas ordenadas en consola con forEach.

Este ejercicio demuestra el uso de la API de Streams, expresiones Lambda, y la interfaz Comparator para procesar y ordenar datos, junto con buenas prácticas de código limpio y documentación.

## 💻 Tecnologías Utilizadas





Java 8 (compatible hasta Java 23, sin requerir características específicas de versiones posteriores)



IntelliJ IDEA (opcional, recomendado para desarrollo)



JDK estándar (no requiere bibliotecas externas)

## 📋 Requisitos





Tener instalado Java JDK 8 o superior.



Un IDE o editor compatible con Java (IntelliJ, Eclipse, VS Code, etc.).

## 🛠️ Instalación





Clona este repositorio (reemplaza con la URL real si está alojado):
```
git clone https://github.com/usuario/JavaSprint1_8.git
```


Accede al directorio del proyecto:
```
cd JavaSprint1_8/sprint1Tasca_S108Nivell1_6
```


Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución





Compila los archivos Java desde la terminal (ajusta el path según la estructura):
```
javac sprint1Tasca_S108Nivell1_6/*.java
```


Ejecuta la clase principal:
```
java sprint1Tasca_S108Nivell1_6.CadenaSort
```
Verás la salida en consola con las cadenas ordenadas por longitud, por ejemplo:
```
baby
good
hello
center
```
Esto muestra las cadenas del List<Object> filtradas y ordenadas por longitud (4, 4, 5, 6). Nota: para cadenas de igual longitud (por ejemplo, "baby" y "good"), el orden no está definido, ya que no se implementó una comparación secundaria.

## 🌐 Despliegue

Este proyecto es un ejercicio educativo y no requiere despliegue en producción. Opcionalmente, puedes empaquetarlo como un .jar ejecutable:
```
jar cfe CadenaSort.jar sprint1Tasca_S108Nivell1_6.CadenaSort -C out .
```
## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Sigue estos pasos:





Haz un fork del repositorio.



Crea una nueva rama:
```
git checkout -b feature/NuevaFuncion
```


Realiza tus cambios y haz commit:
```
git commit -m "Agrega mejoras al proyecto CadenaSort"
```


Sube los cambios:
```
git push origin feature/NuevaFuncion
```


Abre un Pull Request para revisión.

## 📝 Notas Adicionales





La lista mixta se inicializa con ArrayList y Arrays.asList, incluyendo números (Integer, Double) y cadenas (String).



La implementación utiliza filter(o -> o != null && o instanceof String) para excluir números y valores nulos, garantizando robustez frente a NullPointerException.



La ordenación utiliza Comparator.comparingInt(o -> ((String) o).length()) para comparar longitudes de cadenas, pero no incluye una comparación secundaria para cadenas de igual longitud (por ejemplo, "baby" y "good"). Esto puede resultar en un orden no determinista para longitudes iguales.



Para agregar una comparación secundaria (por ejemplo, orden alfabético para longitudes iguales), se puede usar thenComparing((o1, o2) -> ((String) o1).compareTo((String) o2)).



La salida utiliza forEach(System.out::println) para imprimir cada cadena en una línea, consistente con los ejercicios anteriores (3 y 4).



Si se requiere un formato de salida diferente (por ejemplo, [baby, good, hello, center]), se puede usar System.out.println(listResult) en lugar de forEach.



La lista resultante está tipada como List<Object>, pero debería ser List<String> para mejorar la seguridad de tipos, ya que solo contiene cadenas.