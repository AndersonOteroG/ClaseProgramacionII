# Taller de nivelacion PI a PII
#### __Estudiante:__ Anderson Otero
#### __Asignatura:__ Programacion II
#### __Profesor:__ Gabriel Perez
---
### Parte Teorica
Definicion Markdown 

Markdown es un lenguaje de marcado ligero diseñado para dar formato a texto plano de manera sencilla y rápida, utilizando una sintaxis basada en caracteres comunes como #, * o [](). Su objetivo principal es permitir que el texto sea fácil de leer y escribir en su forma original, pero que también pueda convertirse en HTML u otros formatos para mostrarse con estilos como títulos, listas, tablas, enlaces e imágenes.Es ampliamente usado en GitHub para archivos README.md, documentación técnica, wikis y blogs, ya que combina simplicidad, portabilidad y compatibilidad con distintas plataformas.
### Preguntas GIT
1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio es una carpeta de proyecto con historial de cambios controlado por Git. Contiene un subdirectorio oculto .git con toda la base de datos de versiones (commits, ramas, referencias). Un proyecto normal es solo una carpeta de archivos sin ese historial ni las herramientas de control de versiones.
___
2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y 
repository) y qué papel cumple cada una? 

- working directory (directorio de trabajo)

Es la copia visible de tu proyecto donde editas, agregas o eliminas archivos. 

Función: Es el espacio donde realizas cambios. Aquí los archivos pueden estar modificados pero aún no están listos para guardarse en el historial de Git.

- Staging Area (Área de preparación o Index)

Es una zona intermedia donde seleccionas los cambios que formarán parte del próximo commit.

Función: Permite decidir qué modificaciones registrar, dejando fuera las que no quieres guardar aún.

- Repository (Repositorio local)

Es la base de datos interna de Git (en la carpeta oculta .git) que almacena todo el historial de commits y la información de versiones.

Función: Guarda de forma permanente los cambios confirmados, permitiendo recuperar versiones anteriores y trabajar sin conexión.
___
3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag). 

__Objetos Blob:__ Un objeto blob es la representación más básica. Almacena el contenido de un archivo, sin metadatos como nombre o fecha de modificación. Cada archivo en Git se representa como un blob.

__Objetos tree (Árbol):__
Un objeto árbol representa una estructura de directorios, similar a un directorio en un sistema de archivos. Un árbol puede contener referencias a otros árboles (para directorios anidados) o a blobs (para archivos).

__Objetos Commit:__
Un objeto commit es una instantánea del estado del repositorio en un momento determinado. Un commit contiene un puntero al objeto árbol que representa la estructura del proyecto en ese momento, así como metadatos como el autor, la fecha y un mensaje de confirmación. 

__Objetos tag (Etiqueta):__
Un objeto etiqueta es un nombre simbólico que apunta a un commit o a otro tipo de objeto. Se utiliza para marcar versiones específicas del proyecto, como lanzamientos. 
___
4. ¿Cómo se crea un commit y qué información almacena un objeto commit? 



-  paso 1: Inicializar el repositorio
   ```bash
   git init
- Paso 2: Verificar el estado de los archivos
   ```bash
   git status

- Paso 3: Agregar cambios al área de preparación
   ```bash
   git add <archivo>   # Para un archivo específico
   git add .    # Para todos los archivos modificados
- paso 4: Crear el commit con un mensaje
   ``` bash
   git commit -m "mensaje de descripción de los cambios"
___
5. ¿Cuál es la diferencia entre git pull y git fetch? 

La diferencia principal entre git pull y git fetch radica en cómo manejan la integración de cambios remotos en tu repositorio local. git fetch descarga la información del repositorio remoto sin modificar tu rama de trabajo, mientras que git pull no solo descarga sino que también intenta fusionar esos cambios en tu rama actual. 
___
6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits? 

En Git, una rama (branch) es esencialmente un puntero móvil que apunta a una confirmación (commit) específica en el historial del proyecto. Permite a los desarrolladores trabajar en diferentes líneas de desarrollo de forma aislada, sin interferir con el código principal. Git gestiona los punteros a commits moviendo la referencia de la rama cuando se realizan nuevas confirmaciones, manteniendo así un seguimiento de los cambios en cada rama. 
___
 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven? 

 - Paso 1: Cambiarse a la rama donde quieres unir los cambios (ejemplo: `main`):
   ```bash
   git checkout main
- Paso 2: Ejecutar el merge con la otra rama (ejemplo: `feature`):
  ```bash
  git merge feature

__¿Qué conflictos pueden surgir?__

Los conflictos aparecen cuando Git no puede combinar automáticamente los cambios.
Algunas causas comunes son:

- Dos ramas modificaron la misma línea de un archivo de forma diferente.

- Un archivo fue eliminado en una rama y modificado en la otra.

- Cambios incompatibles en la estructura del proyecto.

__¿Cómo se resuelven los conflictos?__

- paso 1: Verificar los archivos en conflicto
   ```bash
   git status
- paso 2: Abrir los archivos, editar manualmente y elegir qué versión (o combinación) conservar.

- Paso 3: Marcar el conflicto como resuelto
   ```bash
   git add <archivo>
- Paso 4: Completar el merge
   ```bash
   git commit
___
8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso? 

El área de preparación (staging area en inglés), o índice, en Git es un espacio intermedio donde se almacenan los cambios que se van a incluir en la próxima confirmación (commit). git add es el comando que mueve los archivos modificados desde tu directorio de trabajo al área de preparación. Si omites este paso, los cambios no se incluirán en la siguiente confirmación. 
___
9. ¿Qué es el archivo `.gitignore` y cómo influye en el seguimiento de archivos?

El archivo `.gitignore` es un archivo de texto en Git que especifica qué archivos y directorios no deben ser rastreados por el sistema de control de versiones. En esencia, sirve para evitar que archivos temporales, configuraciones específicas del entorno, archivos de registro, o artefactos de compilación, entre otros, se incluyan en el repositorio y saturen el historial de versiones. 
___
10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit? 

La diferencia principal entre `git commit --amend` y un nuevo commit radica en su impacto en el historial de Git. `git commit --amend` modifica el último commit, reemplazándolo por uno nuevo que incluye los cambios realizados. Un nuevo commit, por otro lado, crea una entrada separada en el historial, añadiendo un nuevo punto en el tiempo a la línea de tiempo del proyecto. 
___
11. ¿Cómo se utiliza `git stash` y en qué escenarios es útil? 

`git stash` es un comando de Git que permite guardar temporalmente los cambios no confirmados en tu directorio de trabajo, lo que te permite volver a un estado limpio para realizar otras tareas, como cambiar de rama o aplicar actualizaciones, y luego recuperar esos cambios guardados más tarde. Es útil cuando tienes trabajo en progreso que no quieres confirmar, pero necesitas cambiar a otra tarea o rama. 
___

12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git 
revert, git checkout)? 

-  `git reset`: mueve la rama actual (HEAD) y opcionalmente el área de preparación (staging area) y el directorio de trabajo a un estado anterior. 

- ``git revert``: crea una nueva confirmación que invierte los cambios de una confirmación anterior, manteniendo intacto el historial. 

- ``git checkout``: se utiliza para cambiar de rama o para restaurar archivos específicos a una versión anterior, pero también puede mover HEAD a otra rama, modificando el historial. 
---
13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso 
para gestión de forks? 

En Git, un **remoto** es una referencia a un repositorio externo.  
Los más comunes son:

- **origin** → Apunta al repositorio principal que clonaste (normalmente tu fork o tu repo personal).
- **upstream** → Apunta al repositorio original del que se hizo el fork (suele ser el proyecto oficial).

 __Comandos básicos de configuración de remotos:__

- Ver remotos configurados
  ```bash
  git remote -v
- Agregar un remoto
  ```bash
  git remote add origin <url-del-repo>
  git remote add upstream <url-del-repo-original>
- Cambiar la URL de un remoto
  ```bash
  git remote set-url origin <nueva-url>
- Eliminar un remoto
  ```bash
  git remote remove upstream
 __Gestión de forks con Git:__
Cuando trabajas con un fork (copia personal de un proyecto):

- Clonar tu fork (tu repo personal):
  ```bash
  git clone <url-de-tu-fork>
  cd <nombre-del-proyecto>
- Configurar el remoto oficial como upstream:
  ```bash
  git remote add upstream <url-repo-oficial>


14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git 
diff, git show)? 

__git log:__ muestra la lista de commits (puede verse en versión detallada o resumida con --oneline).

__git diff:__ compara cambios, ya sea en el directorio de trabajo, en el área de preparación o entre dos commits.

__git show:__ enseña los detalles de un commit específico (mensaje, autor y diferencias).

### Programación
15.  ¿Cuáles son los tipos de datos primitivos en Java? 
# Tipos de datos primitivos en Java

Java cuenta con **8 tipos de datos primitivos**, que se dividen en numéricos, de caracteres y booleanos.

| Tipo     | Categoría     | Tamaño    | Rango aproximado                           | Ejemplo      |
|----------|--------------|-----------|---------------------------------------------|--------------|
| byte     | Entero       | 8 bits    | -128 a 127                                  | `byte b = 10;` |
| short    | Entero       | 16 bits   | -32,768 a 32,767                            | `short s = 1000;` |
| int      | Entero       | 32 bits   | -2,147,483,648 a 2,147,483,647              | `int i = 50000;` |
| long     | Entero       | 64 bits   | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 | `long l = 100000L;` |
| float    | Decimal      | 32 bits   | ~ ±3.4e−038 a ±3.4e+038 (7 decimales)       | `float f = 3.14f;` |
| double   | Decimal      | 64 bits   | ~ ±1.7e−308 a ±1.7e+308 (15 decimales)      | `double d = 3.1416;` |
| char     | Carácter     | 16 bits   | '\u0000' a '\uffff' (0 a 65,535 Unicode)    | `char c = 'A';` |
| boolean  | Lógico       | 1 bit*    | `true` o `false`                            | `boolean b = true;` |

> *El tamaño de `boolean` depende de la JVM, pero conceptualmente ocupa 1 bit.
___
16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en 
Java? 

En Java, las estructuras de control de flujo permiten dirigir la ejecución del código, tomando decisiones basadas en condiciones y repitiendo bloques de código. Las estructuras principales son if/else, switch, y los bucles (for, while, do-while). 
 -  __if/else:__

Permite ejecutar un bloque de código si una condición es verdadera.

__if (condición) { // Bloque de código a ejecutar si la condición es verdadera }__

Opcionalmente, se puede agregar una cláusula else para ejecutar otro bloque de código si la condición es falsa.

__if (condición) { // Bloque 1 } else { // Bloque 2 }__

También se pueden anidar if/else if/else para evaluar múltiples condiciones.

-  __switch:__ 

Selecciona un bloque de código para ejecutar basado en el valor de una variable.

__switch (variable) { case valor1: // Bloque 1 break; case valor2: // Bloque 2 break; ... default: // Bloque por defecto }__

  - - La variable se compara con cada case.

- -  Se ejecuta el bloque asociado al primer case que coincida.

- -  break se usa para salir del switch después de ejecutar un bloque.

- - default se ejecuta si no hay coincidencias con ningún case.

 __Bucles:__ 
Permiten repetir un bloque de código mientras se cumpla una condición.

for: Se utiliza cuando se conoce el número de iteraciones.

__for (inicialización; condición; actualización) { // Bloque de código }__

while: Se ejecuta mientras la condición sea verdadera.

__while (condición) { // Bloque de código }__

do-while: Similar a while, pero el bloque se ejecuta al menos una vez antes de evaluar la condición.

__do { // Bloque de código } while (condición);__
___
17. ¿Por qué es importante usar nombres significativos para variables y métodos? 

Usar nombres significativos para variables y métodos es crucial para la legibilidad, mantenibilidad y colaboración en el desarrollo de software. Nombres descriptivos facilitan la comprensión del código, reducen errores y simplifican la depuración y modificaciones futuras. 

18. ¿Qué es la Programación Orientada a Objetos (POO)? 

 es un paradigma de programación que organiza el diseño de software alrededor de datos y objetos, en lugar de funciones y lógica. En POO, el código se estructura en entidades llamadas clases, que sirven como plantillas para crear objetos con atributos (datos) y métodos (acciones). 

19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos? 

__abstracción:__
Permite representar los aspectos esenciales de un objeto, ocultando los detalles innecesarios. Por ejemplo, un coche puede abstraerse como un objeto con métodos como "acelerar" o "frenar", sin necesidad de conocer cómo funciona internamente el motor. 

__Encapsulamiento:__
Consiste en agrupar datos y métodos que operan sobre esos datos dentro de una clase, y protegerlos del acceso externo. Esto ayuda a evitar modificaciones accidentales y a mantener la consistencia de los objetos. 

__Herencia:__
Permite crear nuevas clases (clases hijas) basadas en clases existentes (clases padres), heredando sus atributos y métodos. Esto facilita la reutilización de código y la creación de jerarquías de objetos.

__Polimorfismo:__
Significa "muchas formas" y permite que objetos de diferentes clases respondan a una misma llamada de método de manera diferente. Por ejemplo, un método "hacer sonido" podría funcionar diferente para un perro (ladra) que para un gato (maulla). 

20. ¿Qué es la herencia en POO y cómo se utiliza en Java? 

la herencia es un mecanismo que permite a una clase (subclase o clase hija) heredar características (atributos y métodos) de otra clase (superclase o clase padre). Esto promueve la reutilización de código y facilita la creación de jerarquías de clases. En Java, la herencia se implementa mediante la palabra clave extends, donde la subclase utiliza la sintaxis class Subclase extends Superclase. 

21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java? 

En Java, los modificadores de acceso son palabras clave que controlan la visibilidad y el alcance de clases, métodos, constructores y variables. En esencia, determinan quién puede acceder a estos elementos dentro y fuera de una clase. Los modificadores de acceso más comunes en Java son: public, private, protected, y el modificador predeterminado (default), que se aplica cuando no se especifica ningún modificador. 

22. ¿Qué es una variable de entorno y por qué son importantes para Java o la 
programación en general? 

es una variable con nombre que almacena información dinámica sobre el entorno de ejecución de un programa. Son importantes porque permiten configurar el comportamiento de las aplicaciones sin modificar su código fuente, facilitando la gestión en diferentes entornos y mejorando la seguridad al evitar la codificación de datos sensibles directamente en el código. 