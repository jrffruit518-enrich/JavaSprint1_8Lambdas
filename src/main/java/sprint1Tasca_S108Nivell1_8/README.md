#Sprint1Tasca_S108Nivell1_8 - Invertir Cadenas - Nivel 1, Ejercicio 8

## 📄 Descripción - Enunciado del ejercicio

Este proyecto implementa un programa en Java que define una interfaz funcional FunctionReverse con un método reverse() para invertir una cadena de texto. En la clase principal FunctionReverseMain, se utiliza una expresión Lambda para implementar el método, invirtiendo una cadena ingresada por el usuario a través de FunctionReverseEntry. El resultado se imprime en consola junto con una verificación dinámica para confirmar la corrección del método. Se demuestra el uso de interfaces funcionales, expresiones Lambda, y manejo básico de entrada de usuario.

El sistema permite:





Definir una interfaz funcional FunctionReverse con un método reverse(String s) que recibe y retorna un String.



Implementar reverse() con una Lambda que invierte la cadena usando StringBuilder, manejando entradas null.



Leer una cadena no vacía desde la consola usando FunctionReverseEntry.readString.



Imprimir la cadena invertida y verificar si la inversión es correcta comparándola con una inversión independiente.



Manejar entradas null en la Lambda para evitar excepciones.

Este ejercicio demuestra el uso de interfaces funcionales, expresiones Lambda, y entrada/validación de usuario en Java.

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


Accede al directorio del ejercicio:
```
cd JavaSprint1_8/sprint1Tasca_S108Nivell1_8
```


Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución





Compila los archivos Java desde la terminal:
```
javac sprint1Tasca_S108Nivell1_8/*.java
```


Ejecuta la clase principal:
```
java sprint1Tasca_S108Nivell1_8.FunctionReverseMain
```


Ingresa una cadena cuando se solicite (por ejemplo, "open file"). Verás la salida en consola:
```
Please enter a word
open file
elif nepo
The method is successful.
```
Esto muestra la cadena invertida ("elif nepo") y el resultado de la verificación.

## 🌐 Despliegue

Este proyecto es un ejercicio educativo y no requiere despliegue en producción. Opcionalmente, puedes empaquetarlo como un .jar ejecutable:
```
jar cfe FunctionReverseMain.jar sprint1Tasca_S108Nivell1_8.FunctionReverseMain -C out .
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
git commit -m "Agrega mejoras al proyecto FunctionReverse"
```


Sube los cambios:
```
git push origin feature/NuevaFuncion
```


Abre un Pull Request para revisión.

## 📝 Notas Adicionales





La interfaz funcional FunctionReverse define un método reverse(String s) y está implementada con una Lambda que usa StringBuilder.reverse() para invertir la cadena.



La Lambda s -> s == null ? "" : new StringBuilder(s).reverse().toString() maneja entradas null, retornando una cadena vacía para evitar NullPointerException.



La clase FunctionReverseEntry usa un Scanner estático para leer entrada no vacía, con validación para evitar cadenas vacías.



La verificación dinámica compara el resultado de reverse() con una inversión independiente (new StringBuilder(arg).reverse()), pero realiza la inversión dos veces, lo que puede optimizarse almacenando el resultado.



La salida imprime la cadena invertida y un mensaje de verificación ("The method is successful." o "The method failed."), pero el término "failed" podría ajustarse a "is unsuccessful" para consistencia.



No se cierra el Scanner en FunctionReverseEntry, lo que podría causar una fuga de recursos en programas de larga ejecución.



La validación asume que la entrada no es null (garantizado por FunctionReverseEntry), pero no protege contra pruebas directas con null en la Lambda.