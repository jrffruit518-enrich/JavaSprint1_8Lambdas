# Sprint1Tasca_S108Nivell1_2 - Filtrado de Strings con Stream API - Nivel 1, Ejercicio 2

## 📄 Descripción - Enunciado del ejercicio

Este proyecto implementa un programa en Java que filtra una lista de cadenas (List<String>) para devolver una nueva lista que contiene únicamente las cadenas que incluyen la letra "o" (sin distinguir entre mayúsculas y minúsculas) y tienen más de 5 caracteres. El resultado se imprime en consola, mostrando cada cadena en una línea separada.

El sistema permite:





Procesar una lista de cadenas de entrada utilizando la API de Streams de Java.



Filtrar las cadenas que contienen la letra "o" (o "O") mediante el método toLowerCase() y contains(), y que tengan una longitud superior a 5 caracteres con length().



Manejar casos especiales, como elementos null en la lista y una lista de entrada null, para evitar excepciones.



Imprimir las cadenas filtradas de forma clara y ordenada.

Este ejercicio demuestra el uso de la API de Streams de Java, incluyendo métodos como stream(), filter(), y collect(Collectors.toList()), así como buenas prácticas para manejar casos de borde y mejorar la legibilidad del código.

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
cd JavaSprint1_8/sprint1Tasca_S108Nivell1_2
```


Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución





Compila los archivos Java desde la terminal (ajusta el path según la estructura):
```
javac sprint1Tasca_S108Nivell1_2/*.java
```


Ejecuta la clase principal:
```
java sprint1Tasca_S108Nivell1_2.ListContains_oLengthMain
```
Verás la salida en consola con las cadenas filtradas, por ejemplo:
```
Offside
object
oceans
```
Esto muestra las cadenas de la lista de entrada ["Own", "bowl", "fine", "Offside", "object", "good", "nice", "oceans"] que contienen la letra "o" (o "O") y tienen más de 5 caracteres, impresas en líneas separadas.

## 🌐 Despliegue

Este proyecto es un ejercicio educativo y no requiere despliegue en producción. Opcionalmente, puedes empaquetarlo como un .jar ejecutable:
```
jar cfe ListContains_oLengthMain.jar sprint1Tasca_S108Nivell1_2.ListContains_oLengthMain -C out .
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
git commit -m "Agrega mejoras al proyecto ListContains_oLengthMain"
```


Sube los cambios:
```
git push origin feature/NuevaFuncion
```


Abre un Pull Request para revisión.

## 📝 Notas Adicionales





El método listContainsO_Length utiliza toLowerCase() para garantizar que la búsqueda de la letra "o" no distinga entre mayúsculas y minúsculas, lo cual es una interpretación razonable dado que el enunciado no especifica este detalle.



Se incluye una verificación de null (s != null) en el filtro del Stream para manejar elementos nulos en la lista de entrada, y una verificación del parámetro de entrada inputList para lanzar una excepción si es null, mejorando la robustez del código.



La implementación utiliza .collect(Collectors.toList()) en lugar de .toList() para garantizar compatibilidad con versiones de Java anteriores a 16 y para permitir modificaciones posteriores en la lista resultante si fuera necesario.



La salida se imprime usando forEach(System.out::println), lo que genera una línea por cada cadena filtrada. Si se requiere un formato diferente (por ejemplo, [Offside, object, oceans]), se puede modificar a System.out.println(listResult).



El conjunto de datos de prueba incluye cadenas que cumplen y no cumplen las condiciones, lo que permite verificar la lógica del filtrado. Se recomienda agregar más casos de borde, como cadenas vacías ("") o cadenas más largas, para pruebas exhaustivas.