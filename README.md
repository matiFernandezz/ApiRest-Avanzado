# Desarrollo de Software - Trabajo Práctico API REST

## Autor

**Matias Fernández** - Legajo: **49483** - Comisión **3K10**

## Descripcion
Este es un proyecto de ejemplo realizado con JPA, Envers, y una base de datos en memoria H2. El proyecto está diseñado para demostrar el uso de entidades, relaciones y auditoría en un contexto de API REST. Además, hemos implementado el uso de reutilizacion de código, Servicios, Repositorios y Controladores genéricos.
Para esta parte mas avanzada, hemos utilizado la estrategia de Paginación.
## Tecnologías Utilizadas

- **Java**: Lenguaje de programación.
- **JPA (Java Persistence API)**: Para la persistencia de datos.
- **Hibernate Envers**: Para la auditoría de cambios en las entidades.
- **H2 Database**: Base de datos en memoria para pruebas.

## Configuración del Proyecto

### Requisitos implementados

- JDK 17 o superior
- Gradle
- IDE (IntelliJ IDEA)
- H2 Database
- Envers
- JPA
- Hibernate
- Java Persistence API
- OpenAPI

## Packages del Proyecto
- **audit**: Contiene la clase Revision.
- **config**: Contiene la clase CustomRevisionListener para la auditoría.
- **controllers**: Contiene el controlador de Persona, Autor y Localidad.
- **entities**: Contiene las entidades Autor, Domicilio, Libro, Localidad y Persona.
- **repositories**: Contiene el repositorio de Persona, Autor y Localidad.
- **services**: Contiene la interfaz AutorService, PersonaService y LocalidadService, con sus Implementaciones.

## Ejecutar el Proyecto
### Paso 1
Descargar el repositorio de GitHub.

```bash
git clone https://github.com/matiFernandezz/TPApiRest-Fernandez
```
### Paso 2
Abrir el proyecto en IntelliJ IDEA.
### Paso 3
Ejecutar el archivo 'Inicial1Application.java' dentro del proyecto.

### Paso 4
- En el navegador:
  - Abrir la consola de H2: ("localhost:8080/h2-console")\
    [H2 Console](http://localhost:8080/h2-console)
  - Abrir la consola de OPEN API: ("localhost:8080/swagger-ui/index.html")\
    [OPEN API](http://localhost:8080/swagger-ui/index.html)



## Imágenes del Proyecto

### Captura de los controladores con Paginación
![CONTROLLER](capturas%20proyecto/Controllers.png)
Para este proyecto decidí dejar detallado las pruebas sobre la entidad Autor.
### Tabla Autor
![Autor Inicial](capturas%20proyecto/Tabla%20Autor.png)
### Delete en Tabla Autor
![Delete](capturas%20proyecto/Delete.png)
### Tabla Autor luego del Delete
![TablaDelete](capturas%20proyecto/Tabla%20Autor%20Delete.png)
### Post en Tabla Autor
![Post](capturas%20proyecto/Post%20Autor.png)
### Tabla Autor luego del Post
![TablaPost](capturas%20proyecto/Tabla%20Autor%20Post.png)
### Paged en Autor
![Paged](capturas%20proyecto/Paged.png)
### Respuesta del Paged
![CONTROLLER](capturas%20proyecto/Respuesta%20Paged.png)

