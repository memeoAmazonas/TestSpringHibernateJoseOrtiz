# Autor Jose Ortiz

fecha 25/02/2019

## Requerimentos

```bash
apache maven
java version 1.8
smbd mysql 
```

##Configuracion BD

```
Se debe modificar el archivo hibernate.cfg.xml
 ubicado en la ruta /src/main/resources/hibernate.cfg.xml
 en las propiedades
  <property name="hibernate.connection.username">{nombre usuario bd} por defecto root</property>
  <property name="hibernate.connection.password">{password usuario bd} por defecto ""</property>
 ```
 #Esquema
  ``` 
  en la ruta /src/main/java/com/spring/test/utils/testSpring.sql
  se encuentra el esquema de la bd.
  ```

##Despliegue

```posicionarse en la raiz del proyecto y abrir una consola, 
ejecutar los comando 
--mvn clean
--mvn install
```
Estos comandos generaran los recursos necesarios para el despliegue de la aplicacion

```
Ejecutar los comandos
mvn spring-boot:run
```
con este comando se inicia la aplicacion.

Se debe acceder a la ruta(http://localhost:8080/general/teoricas)

##puesta en produccion
```
generar el jar con el comando
mvn package
el jar se guardara en la carpeta target por defecto con el nombre spring-test-0.0.1-SNAPSHOT.jar (Dicho nombre se puede cambiar)

Levantar el jar creado
java -jar <nombre del jar>
para levantar el jar nos posicionamos en la carpeta donde se encuentre el mismo y ejecutamos el comando
```
Se debe acceder a la ruta(http://localhost:8080/general/teoricas)


##Datos Generales de la aplicacion.
Se siguio el patron de Diseño MVC.
la estructura de carpetas:
```
    -Controller
        llamada de metodos
        
    -Services
            interfaces
            implementacion metodos
    -entity
        contiene las entidades modeladas en base de datos
    -model
        contiene los modelos de la aplicacion
    -repository
        contiene las llamadas a base de datos
                interface
                implementacion metodos    
```

