# Taller 3 - Quality Assurance

Este repositorio contiene la implementación del Taller 3 de la clase de Quality Assurance. El taller se divide en dos retos distintos:

1. **Reto 1**: Pruebas automatizadas en Java con Selenium.
2. **Reto 2**: Pruebas de API utilizando Postman.

## Estructura del Proyecto

La estructura del proyecto es la siguiente:

### Descripción de Carpetas

- **postman/**: Contiene la colección y el entorno de Postman necesarios para la ejecución del segundo reto, donde se prueban las APIs de la NASA.
    - `Nasa API.postman_collection.json`: Archivo de colección que incluye las pruebas a realizar sobre las APIs.
    - `Nasa API.postman_environment.json`: Archivo de entorno con variables necesarias para ejecutar las pruebas de API.

- **src/test/java/com/asalazargale/**: Contiene el código Java para las pruebas automatizadas del primer reto.
    - **pages/**: Clases de Page Objects, que representan las páginas utilizadas en las pruebas.
    - **restapi/**: Clases para pruebas de API.
    - **tests/**: Clases con las pruebas específicas.
    - **util/**: Clases utilitarias, como `DriverFactory` para la configuración de WebDriver y `UserFactory` para la creación de datos de prueba.

## Herramientas Utilizadas

- **Postman**: Utilizado para realizar pruebas automatizadas de API en el segundo reto, donde se integran las pruebas de la API de la NASA.
- **Selenium**: Utilizado en el primer reto para la automatización de pruebas de interfaz en Java, interactuando con páginas web a través de WebDriver.

## Integrantes

- Juan Guerra
- Juan Echeverri
- Andrés Salazar

## Ejecución del Proyecto

### Requisitos Previos

- Tener instalado Maven y configurado en el PATH.
- Tener instalado Java JDK.

### Instrucciones

1. Clona este repositorio:
   ```bash
   git clone https://github.com/drew138/rest_assured
   ```
2. Navega a la raíz del proyecto y ejecuta las pruebas con Maven:
   ```bash
   mvn clean test
   ```
3. Para ejecutar las pruebas de API en Postman, importa los archivos _.json_ en Postman y ejecuta la colección.

## Notas
- En DriverFactory.java se encuentra la configuración para el browser de Brave. Esto debido a restricciones en el equipo de desarrollo. Si se desea cambiar a Chrome, se debe remover _options_ y dejar el constructor vacío.
- El proyecto sigue principios de Page Object Model para una mejor organización y mantenimiento de las pruebas automatizadas en Selenium.