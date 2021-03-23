# Vikingo-Espartano

- Maven es una herramienta open-source para la gestión de proyectos de software, basada en el concepto Proyect Object Model. 
Esto quiere decir que con Maven vamos a poder compilar, empaquetar, generar documentación, pasar los test, preparar las builds, entre otras tareas.
Maven se basa en patrones y en estándares, y hace la gestión de librerías, incluso teniendo en cuenta las dependencias transitivas.
Maven es una herramienta capaz de gestionar un proyecto software completo, desde la etapa en la que se comprueba que el código es correcto,
hasta que se despliega la aplicación, pasando por la ejecución de pruebas y generación de informes y documentación.

- El POM, por sus siglas "Proyect Object Model", es donde vamos a describir nuestro proyecto. Contiene todo lo necesario para que a la hora de 
generar el fichero ejecutable (jar o war) de nuestra aplicación este contenga todo lo que necesita para su ejecución en su interior.

- Un archetype es una especie de plantilla, mediante la cual Maven puede generar una estructura de directorios y ficheros, creará una estructura base indicandole a Maven
el tipo de proyecto que queremos. En cambio el ArtifactID es el nombre que le asignamos al proyecto Maven

- Maven Goals:
Clean: Borra el directorio de salida ubicado en la carpeta target.
Package : Empaqueta la aplicación en un formato distribuible tipo JAR ,WAR, entre otros, dentro de la carpeta target.
Install: Despliega el Package en el repositorio local de nuestro equipo.
Compile: Compila el código fuente para generar los binarios correspondientes que se ejecutarán.

- Maven Scopes:
Compile: Es el valor por defecto. Se utiliza en todos los casos (compilar, ejecutar, etc).
Provided: También se utiliza en todos los casos, pero se espera que el jar sea suministrado por la JDK o el contenedor. Es decir, no se incluirá al empaquetar el proyecto, ni en el repositorio.
Runtime: No se utiliza para compilar, pero si es necesario para ejecutar.
Test: Sólo se utiliza para compilar o ejecutar los test.
System: Es similar a provided, pero eres tu el que tiene que suministrar el jar. No se incluirá al empaquetar el proyecto, ni en el repositorio



