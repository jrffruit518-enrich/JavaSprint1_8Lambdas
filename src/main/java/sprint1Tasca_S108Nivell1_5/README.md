# Sprint1Tasca_S108Nivell1_5 - Functional Interface para el Valor de Pi - Nivel 1, Ejercicio 5

## 📄 Descripción - Enunciado del ejercicio

Este proyecto implementa un programa en Java que define una interfaz funcional (MyFunctional) con un método getPiValue() que retorna un valor double representando el valor de π (3.1415). En la clase principal, se instancia la interfaz utilizando una expresión Lambda y se asigna el valor 3.1415. Luego, se invoca el método getPiValue() y se imprime el resultado en consola.

El sistema permite:





Definir una interfaz funcional (MyFunctional) con un único método abstracto getPiValue() que retorna un double.



Instanciar la interfaz utilizando una expresión Lambda para devolver el valor constante 3.1415.



Imprimir el resultado del método getPiValue() en consola.



Garantizar un código robusto y simple, utilizando características funcionales de Java.

Este ejercicio demuestra el uso de interfaces funcionales, expresiones Lambda, y la API de Java para programación funcional, junto con buenas prácticas de código limpio y documentación.

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
cd JavaSprint1_8/sprint1Tasca_S108Nivell1_5
```


Abre el proyecto en IntelliJ IDEA o tu IDE favorito.

## ▶️ Ejecución





Compila los archivos Java desde la terminal (ajusta el path según la estructura):
```
javac sprint1Tasca_S108Nivell1_5/*.java
```


Ejecuta la clase principal:
```
java sprint1Tasca_S108Nivell1_5.MyFunctionalMain
```
Verás la salida en consola con el valor de π, por ejemplo:

3.1415

Esto muestra el resultado del método getPiValue() implementado mediante una expresión Lambda en la interfaz MyFunctional.

## 🌐 Despliegue

Este proyecto es un ejercicio educativo y no requiere despliegue en producción. Opcionalmente, puedes empaquetarlo como un .jar ejecutable:
```
jar cfe MyFunctionalMain.jar sprint1Tasca_S108Nivell1_5.MyFunctionalMain -C out .
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
git commit -m "Agrega mejoras al proyecto MyFunctionalMain"
```


Sube los cambios:
```
git push origin feature/NuevaFuncion
```


Abre un Pull Request para revisión.

## 📝 Notas Adicionales





La interfaz MyFunctional está anotada con @FunctionalInterface para garantizar que cumpla con los requisitos de una interfaz funcional (un único método abstracto).



La implementación utiliza una expresión Lambda (() -> 3.1415) para instanciar la interfaz y devolver el valor constante de π (3.1415), cumpliendo con el requisito de asignar este valor específico.



La salida muestra el valor 3.1415 directamente, ya que el método getPiValue() retorna un double. Si se requiere un formato específico (por ejemplo, con dos decimales como 3.14), se puede ajustar usando String.format o printf.



La elección del nombre MyFunctional es funcional, aunque un nombre más descriptivo como PiProvider podría mejorar la claridad semántica.



El código es robusto frente a casos de borde, ya que la implementación Lambda es simple y no involucra entradas dinámicas ni valores nulos.



La estructura del proyecto utiliza el paquete sprint1Tasca_S108Nivell1_5, consistente con la organización de ejercicios anteriores.