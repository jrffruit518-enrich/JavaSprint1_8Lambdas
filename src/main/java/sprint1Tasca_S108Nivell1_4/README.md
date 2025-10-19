## Sprint1Tasca_S108Nivell1_4 - Listado de Meses con Enum y Method Reference - Nivel 1, Ejercicio 4

# 📄 Descripción - Enunciado del ejercicio

Este proyecto implementa un programa en Java que crea una lista con los nombres de los meses del año y los imprime utilizando exclusivamente métodos referenciados (method references). Se utiliza un enum (MonthLambdas) para definir los 12 meses del año, garantizando tipo-seguridad y evitando valores inválidos. Los nombres de los meses se almacenan como cadenas en formato natural (por ejemplo, "January" en lugar de "JANUARY") y se imprimen en consola, cada uno en una línea separada.

El sistema permite:





Definir los meses del año usando un enum (MonthLambdas) con un campo name para nombres personalizados.



Crear una lista de meses a partir de los valores del enum utilizando Arrays.stream(MonthLambdas.values()).



Imprimir los nombres de los meses utilizando métodos referenciados (map(MonthLambdas::getName) y forEach(System.out::println)) a través de la API de Streams.



Garantizar una salida clara y ordenada con los nombres de los meses en formato legible.

Este ejercicio demuestra el uso de enumeraciones (enum) para modelar datos fijos, la API de Streams para procesar colecciones, y métodos referenciados para operaciones funcionales, junto con buenas prácticas de código limpio y documentación.

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
cd JavaSprint1_8/sprint1Tasca_S108Nivell1_4
```


Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución





Compila los archivos Java desde la terminal (ajusta el path según la estructura):
```
javac sprint1Tasca_S108Nivell1_4/*.java
```


Ejecuta la clase principal:
```
java sprint1Tasca_S108Nivell1_4.MonthMethodReference
```
Verás la salida en consola con los nombres de los meses, por ejemplo:
```
January
February
March
April
May
June
July
August
September
October
November
December
```
Esto muestra los nombres de los meses definidos en el enum MonthLambdas, impresos en líneas separadas utilizando métodos referenciados.

## 🌐 Despliegue

Este proyecto es un ejercicio educativo y no requiere despliegue en producción. Opcionalmente, puedes empaquetarlo como un .jar ejecutable:

jar cfe MonthMethodReference.jar sprint1Tasca_S108Nivell1_4.MonthMethodReference -C out .

🤝 Contribuciones
```
¡Las contribuciones son bienvenidas! Sigue estos pasos:
```




Haz un fork del repositorio.



Crea una nueva rama:
```
git checkout -b feature/NuevaFuncion
```


Realiza tus cambios y haz commit:
```
git commit -m "Agrega mejoras al proyecto MonthMethodReference"
```


Sube los cambios:
```
git push origin feature/NuevaFuncion
```


Abre un Pull Request para revisión.

📝 Notas Adicionales





El enum MonthLambdas utiliza un campo name para almacenar los nombres de los meses en formato natural (por ejemplo, "January" en lugar de "JANUARY"), lo que permite una salida más legible.



La implementación utiliza la API de Streams (Arrays.stream) con métodos referenciados (map(MonthLambdas::getName) y forEach(System.out::println)) para transformar y imprimir los nombres de los meses, cumpliendo estrictamente con el requisito de usar métodos referenciados en lugar de expresiones Lambda.



La elección de nombres en inglés (por ejemplo, "January") es consistente con los ejercicios anteriores del proyecto. Si se requiere otro idioma (por ejemplo, catalán: "Gener", "Febrer"), el campo name del enum puede ajustarse fácilmente.



El código es robusto frente a casos de borde, ya que el enum garantiza que solo se utilicen valores válidos de meses, eliminando la posibilidad de elementos null o inválidos.



Si se desea un formato de salida diferente (por ejemplo, [January, February, ...]), se puede modificar la impresión a System.out.println(Arrays.asList(MonthLambdas.values())), ajustando el toString del enum o manteniendo el uso de map para obtener los nombres.