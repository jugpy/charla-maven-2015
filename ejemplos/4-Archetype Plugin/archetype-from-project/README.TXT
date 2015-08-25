Creación de un arquetipo a partir de un proyecto modelo:
1) Se crea un proyecto modelo, por ejemplo el presente en el directorio actual ./pom.xml que es un simple jar con una clase ejecutable.
2) Se ejecuta el comando $mvn archetype:create-from-project
3) Inspeccionar el directorio generado ./target/generated-sources/archetype/ y encontraremos que se ha creado otro proyecto maven. Este es un arquetipo generado a partir del proyecto modelo inicial.
4) Se instala el arquetipo ejecutando $mvn install en su directorio raíz. Una vez instalado, el arquetipo ya se encuentra disponible en el catálogo local de arquetipos para generar proyectos basados en él a través del comando $mvn archetype:generate
