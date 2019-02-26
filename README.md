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

##Despliegue

```posicionarse en la raiz del proyecto y abrir una consola, 
ejecutar los comando 
--mvn clean
--mvn install
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

