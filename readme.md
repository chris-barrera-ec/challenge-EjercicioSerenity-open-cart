# Challenge Ejercicio de Automatización E2E con Serenity y Screenplay

## Requisitos Previos

Para poder ejecutar el proyecto se debe instalar previamente las siguientes herramientas:
- JDK 17 – Java Development Kit
- Gradle v7.6.1
- IntelliJ IDEA (versión usada para desarrollar el proyecto: 2023.3.2)

## Instrucciones para ejecutar las pruebas
- Clonar el repositorio desde https://github.com/chris-barrera-ec/challenge-EjercicioSerenity-open-cart.git
- Abrir la carpeta del proyecto con IntelliJ IDEA
- Una vez cargadas las dependencias dirigirse a la clase src/test/java/com/dum/runners/**RunnerTest**.java
- Click en RUN
- El escenario de prueba ejecutado lee inicialmente de la TABLE definida en Examples en el feature _ThePurchase.feature_, sin embargo, al realizar el ingreso de datos en _src/main/java/com/dum/tasks/opencart/EnterInfoGuestCheckout.java_se carga la información por medio de la clase _com/dum/util/Persona.java_ que a su vez lee los datos desde el archivo _src/test/resources/data/opencart/datos.csv_.


