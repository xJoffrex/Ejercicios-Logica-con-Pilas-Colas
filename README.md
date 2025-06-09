# Estructuras Lineales - Ejercicios

## 📌 Descripcion
Este proyecto forma parte de la práctica de laboratorio de **Estructura de Datos** en la Universidad Politécnica Salesiana. Implementa dos ejercicios fundamentales usando **pilas (Stacks)**:

1. **Validación de signos** (`SignValidator.java`): Verifica si una cadena con los caracteres `(){}[]` está correctamente balanceada osea que tenga apertura y cierre ordenada.
2. **Ordenar un Stack** (`StackSorter.java`): Organiza los elementos dentro de una pila, dejando los más pequeños en el tope.

## 🚀 Cómo ejecutar el proyecto
1. Clona el repositorio: git clone <https://github.com/xJoffrex/Ejercicios-Logica-con-Pilas-Colas>

2. Navega a la carpeta `src/` y compila los archivos Java: javac Materia/Controllers/.java Ejercicio_01_sign/.java Ejercicio_02_sorting/*.java

3. Ejecuta `App.java` desde la terminal:


## 📊 Casos de prueba
### **Ejercicio 01: Validación de signos**
| Entrada      | Salida   |
|-------------|---------|
| `([]){}`    | `true`  |
| `({)}[]`    | `false` |
| `(([]))`    | `true`  |
| `{[()]}`    | `true`  |

### **Ejercicio 02: Ordenar un Stack**
| Entrada (Stack) | Salida Ordenada |
|----------------|----------------|
| `6 → 2 → 0 → 12`  | `1 → 2 → 4 → 5` |
| `11 → 10 → 9 → 8` | `6 → 7 → 8 → 9` |
| `5 → 4 → 7 → 1`   | `10 → 11 → 12 ` |
| `3`               |                 |

## 🔗 Versión
La versión final del proyecto está disponible en el siguiente enlace:
[Release 2.0.2](https://github.com/xJoffrex/Ejercicios-Logica-con-Pilas-Colas/releases/tag/v2.0.2)

---

