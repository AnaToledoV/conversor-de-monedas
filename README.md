<h1 align="center"> Conversor de Monedas </h1> 

![monedas](https://github.com/user-attachments/assets/550cb5cd-35e9-4f77-a9cc-3b65159e33df)

![Badge en Desarollo](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-blue)

<p>Proyecto de Java Orientado a Objetos del programa ONE. Este proyecto es un conversor de monedas que utiliza la API de ExchangeRate para obtener las tasas de cambio actualizadas.</p>
<p>El usuario se encontrará con un menú que presenta las posibilidades de conversión que ofrece este proyecto para su libre elección. 
Luego, se le pedirá que ingrese el monto deseado para poder relizar la operación. Dentro del menú, que se ejecuta en bucle, tiene la opción 'salir' (número 7).</p>

## :hammer:Funcionalidades del proyecto

- `Funcionalidad 1`: Conversión entre múltiples monedas

- `Funcionalidad 1a`: Permite convertir valores entre las siguientes monedas:

Dólar estadounidense (USD)

Peso argentino (ARS)

Real brasileño (BRL)

Peso colombiano (COP)

- `Funcionalidad 2`: Menú interactivo

- `Funcionalidad 2a`: Al iniciar el programa, el usuario puede seleccionar una de las siguientes opciones para realizar conversiones:

1) Dólar estadounidense (USD) => Peso argentino (ARS)

2) Peso argentino (ARS) => Dólar estadounidense (USD)

3) Dólar estadounidense (USD) => Real brasileño (BRL)

4) Real brasileño (BRL) => Dólar estadounidense (USD)

5) Dólar estadounidense (USD) => Peso colombiano (COP)

6) Peso colombiano (COP) => Dólar estadounidense (USD)

- `Funcionalidad 2b`: Para finalizar la ejecución del programa, debe seleccionar la última opción del menú:

7) Salir

-  `Funcionalidad 3`: Validación de entradas
  
-  `Funcionalidad 3a`: El programa valida que las opciones ingresadas por el usuario sean válidas y permite ingresar el monto a convertir en formato numérico.
  
-  `Funcionalidad 4`: Conversión con tasa de cambio actualizada

- `Funcionalidad 4a`: Utiliza la API de ExchangeRate para obtener las tasas de cambio actualizadas y realizar las conversiones.

- `Funcionalidad 4b`: Si la API no está disponible o hay un error, el programa maneja la excepción con una clase personalizada llamada ApiException, proporcionando un mensaje de error claro.

- `Funcionalidad 5`: Manejo de errores

- `Funcionalidad 5a`: Implementa un sistema de manejo de errores que notifica al usuario en caso de fallos en la conexión con la API o de respuestas inválidas.

- `Funcionalidad 5b`: El código cuenta con excepciones específicas para la gestión de problemas relacionados con la API, como errores de respuesta o problemas de formato.

- `Funcionalidad 6`: Estructura y modularidad

- `Funcionalidad 6a`: El proyecto está organizado en clases:

ConsultaMoneda: Se encarga de hacer la solicitud a la API y devolver los resultados de la conversión.

Principal: Clase que contiene el menú y la lógica principal del programa.

Divisas: Un record que representa las tasas de cambio obtenidas de la API.

## :computer: Tecnologías utilizadas
- Lenguaje de programación: Java

- Librerías:

HttpClient para manejar las solicitudes HTTP.

Gson para el manejo de JSON y la deserialización de los datos de la API.

ExchangeRate API para obtener las tasas de cambio.

## 📁 Acceso al proyecto
1. Clona este repositorio.

2. Abre el proyecto en tu IDE favorito (como IntelliJ).

3. Ejecuta la clase Principal para comenzar a utilizar el conversor de monedas.

## Autora
Ana Paula Toledo Videla



