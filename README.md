# ☕ Laboratorio 3: Fundamentos de Java, POO y Control de Versiones

> Práctica integral de Control de Flujo, Manejo de Excepciones, Programación Orientada a Objetos y Modelado UML en Java.

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white" alt="Java 17+">
  <img src="https://img.shields.io/badge/PlantUML-Diagrams-blueviolet?logo=plantuml&logoColor=white" alt="PlantUML">
  <img src="https://img.shields.io/badge/VS%20Code-IDE-007ACC?logo=visualstudiocode&logoColor=white" alt="VS Code">
  <img src="https://img.shields.io/badge/Ejercicios-16-brightgreen" alt="16 Ejercicios">
  <img src="https://img.shields.io/badge/Status-Completado-success" alt="Estado">
</p>

---

## 📖 Descripción del Proyecto

Este repositorio reúne la resolución completa y estructurada del **Laboratorio 3 de Programación**. El proyecto abarca un total de **16 ejercicios prácticos** organizados por niveles de complejidad, cubriendo desde la captura y control de errores en consola hasta la arquitectura de sistemas basados en los pilares fundamentales de la **Programación Orientada a Objetos (POO)** y el modelado conceptual con **PlantUML**.

---

## 📂 Estructura y Niveles del Laboratorio

El laboratorio está segmentado en tres bloques temáticos principales para garantizar un aprendizaje incremental y robusto.

### 🛡️ Nivel 1: Validación de Entradas y Manejo de Excepciones

*Ejercicios enfocados en garantizar la estabilidad del software mediante bloques `try-catch-finally` y algoritmos de ordenamiento.*

<details>
<summary><strong>Ver detalle de ejercicios del Nivel 1</strong> (Clic para desplegar)</summary>

| # | Ejercicio | Descripción |
|---|-----------|-------------|
| 5 | **Validador de Edad** | Solicita y valida que la edad sea un número entero positivo mediante `try-catch` y `IllegalArgumentException`. |
| 6 | **División Segura** | Pide dos números y previene divisiones por cero controlando `ArithmeticException` y `NumberFormatException`. |
| 7 | **Entrada Numérica** | Captura de manera limpia errores de conversión cuando el usuario ingresa caracteres de texto no numéricos. |
| 8 | **Promedio de Notas** | Utiliza un arreglo dinámico (`ArrayList`) con ciclo iterativo para registrar 5 notas y calcular su promedio. |
| 9 | **Número Mayor & Bubble Sort** | Captura 3 números y aplica el algoritmo de ordenamiento por burbuja (**Bubble Sort**) para determinar el valor máximo. |
| 10 | **Estadísticas Básicas** | Registro de 5 números con cálculo de Suma, Promedio, y obtención del Menor y Mayor tras aplicar **Bubble Sort**. |
| 11 | **Clasificación de Edad** | Evaluación por rangos de edad (Niño, Adolescente, Adulto) mediante estructuras condicionales compuestas (`if-else` y `&&`). |
| 12 | **Menú Básico Interactivo** | Menú en consola ejecutado mediante un ciclo `do-while` y control de casos mediante `switch`. |

</details>

### 📦 Nivel 2: Arquitectura y Pilares de la POO

*Implementación modular en archivos `.java` independientes aplicando Encapsulamiento, Herencia, Abstracción y Polimorfismo.*

<details>
<summary><strong>Ver detalle de ejercicios del Nivel 2</strong> (Clic para desplegar)</summary>

| # | Ejercicio | Descripción |
|---|-----------|-------------|
| 1 | **Sistema de Animales** | Clase abstracta `Animal` con atributo `nombre` y método abstracto `hacerSonido()`, implementado con polimorfismo por `Perro` y `Gato`. |
| 2 | **Sistema de Vehículos** | Superclase `Vehiculo` y subclases `Carro` y `Moto` aplicando encapsulamiento (`private`, `getters/setters`) y sobrescritura de `mostrarDatos()`. |
| 3 | **Sistema de Pagos** | Clase abstracta base `Pago` con clases concretas `PagoTarjeta` y `PagoEfectivo` operando con el método polimórfico `procesarPago()`. |
| 4 | **Sistema de Biblioteca** | Herencia y polimorfismo para `Material`, `Libro` y `Revista` mediante la gestión de inventario y el método `mostrarInformacion()`. |
| 15 | **Sistema de Empleados** | Gestión de nómina con la clase abstracta `Empleado` y sus derivadas `EmpleadoTiempoCompleto` y `EmpleadoPorHoras`, incluyendo validación estricta en constructores. |
| 16 | **Sistema de Productos** | Catálogo con `Producto`, `ProductoFisico` (recargo por peso/envío) y `ProductoDigital` (sin costo de envío) con cálculo dinámico de precio final. |

</details>

### 🎨 Nivel 3: Modelado UML como Código (PlantUML)

*Diseño conceptual de diagramas estructurales y de comportamiento listos para renderizar en VS Code.*

<details>
<summary><strong>Ver detalle de ejercicios del Nivel 3</strong> (Clic para desplegar)</summary>

| # | Ejercicio | Descripción |
|---|-----------|-------------|
| 13 | **Diagrama de Clases** | Especificación UML para las entidades `Persona`, `Estudiante` y `Curso`, con relaciones de herencia y asociación muchos a muchos (`* -- *`). |
| 14 | **Diagrama de Secuencia** | Flujo de interacción para la consulta de información de un estudiante entre `Actor`, `Interfaz Gráfica`, `Controlador` y `Base de Datos`, incluyendo un bloque condicional (`alt/else`). |

</details>

---

## 💻 Estructura de Archivos del Proyecto

Cada ejercicio vive en su propia carpeta en la raíz del repositorio (`EjercicioN/`), con sus clases `.java` y, cuando aplica, su `Main.java` de prueba.

```text
LaboratorioCuatro/
├── Ejercicio1/                  # Sistema de Animales
│   ├── Animal.java
│   ├── Perro.java
│   ├── Gato.java
│   └── Main.java
├── Ejercicio2/                  # Sistema de Vehículos
│   ├── Vehiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   └── Main.java
├── Ejercicio3/                  # Sistema de Pagos
│   ├── Pago.java
│   ├── PagoTarjeta.java
│   ├── PagoEfectivo.java
│   └── Main.java
├── Ejercicio4/                  # Sistema de Biblioteca
│   ├── Material.java
│   ├── Libro.java
│   ├── Revista.java
│   └── Main.java
├── Ejercicio5/                  # Validador de Edad
│   └── ValidadorEdad.java
├── Ejercicio6/                  # División Segura
│   └── DivisionSegura.java
├── Ejercicio7/                  # Entrada Numérica
│   └── EntradaNumerica.java
├── Ejercicio8/                  # Promedio de Notas
│   └── PromedioNotas.java
├── Ejercicio9/                  # Número Mayor & Bubble Sort
│   └── NumeroMayorBubbleSort.java
├── Ejercicio10/                 # Estadísticas Básicas
│   └── EstadisticasBasicas.java
├── Ejercicio11/                 # Clasificación de Edad
│   └── ClasificacionEdad.java
├── Ejercicio12/                 # Menú Básico Interactivo
│   └── MenuBasico.java
├── Ejercicio13/                 # Diagrama de Clases (UML)
│   └── DiagramaClases.puml
├── Ejercicio14/                 # Diagrama de Secuencia (UML)
│   └── DiagramaSecuencia.puml
├── Ejercicio15/                 # Sistema de Empleados
│   ├── Empleado.java
│   ├── EmpleadoTiempoCompleto.java
│   ├── EmpleadoPorHoras.java
│   └── Main.java
├── Ejercicio16/                 # Sistema de Productos
│   ├── Producto.java
│   ├── ProductoFisico.java
│   ├── ProductoDigital.java
│   └── Main.java
│
└── README.md
```

---

## 🛠️ Tecnologías y Herramientas Utilizadas

| Herramienta | Uso en el proyecto |
|-------------|--------------------|
| **[Java JDK 17+](https://www.oracle.com/java/)** | Lenguaje principal para el desarrollo de la lógica, POO y excepciones. |
| **[PlantUML](https://plantuml.com/)** | Generación de diagramas UML de clases y secuencia mediante sintaxis en texto plano. |
| **[VS Code](https://code.visualstudio.com/)** | Entorno de desarrollo integrado con extensiones para Java y PlantUML. |
| **[Git & GitHub](https://github.com/)** | Control de versiones para el seguimiento de cambios y publicación del laboratorio. |

---

## 🚀 Instrucciones de Ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/Angelykcoder/LaboratorioCuatro.git
cd LaboratorioCuatro
```

### 2. Compilar y ejecutar un ejercicio del Nivel 1 (script simple)

```bash
cd Ejercicio5/
javac ValidadorEdad.java
java ValidadorEdad
```

### 3. Compilar y ejecutar un módulo de POO (Nivel 2)

Ejemplo con el **Sistema de Productos**:

```bash
cd Ejercicio16/
javac *.java
java Main
```

> 🔁 El mismo patrón aplica para el resto de carpetas con varias clases (`Ejercicio1`, `Ejercicio2`, `Ejercicio3`, `Ejercicio4`, `Ejercicio15`): entra a la carpeta correspondiente, compila con `javac *.java` y ejecuta con `java Main`.

### 4. Visualizar Diagramas PlantUML en VS Code

1. Instala la extensión **PlantUML** en VS Code.
2. Abre el archivo `.puml` dentro de `Ejercicio13/` o `Ejercicio14/`.
3. Presiona `Alt + D` (o `Option + D` en macOS) para abrir la vista previa interactiva.

---

## 📌 Requisitos Previos

- ✅ Java JDK 17 o superior instalado (`java -version` para verificar).
- ✅ Git instalado para clonar el repositorio.
- ✅ VS Code con la extensión de Java (`Extension Pack for Java`) y la extensión **PlantUML**.
- ✅ (Opcional) Graphviz instalado si PlantUML lo requiere para renderizar los diagramas localmente.

---

## 👤 Autor

|Diego Flores|

---
