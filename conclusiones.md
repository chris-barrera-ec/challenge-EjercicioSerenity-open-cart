# Conclusiones

- La herramienta Serenity permitió realizar correctamente y de manera eficiente las pruebas del modulo de usuarios de la página opencart.
- Algunas de los elementos de las interfaces probadas no tenían un id por lo que fue necesario hacer referencia con xpath.
- Debido que el sitio es http se debió deshabilitar la seguridad del navegador del webdriver, ya que de otra manera al dar click en checkout el navegador presentaba un error por certificado de seguridad y no permitía seguir adelante.
- Para poder comprobar que la orden de compra fue completada se realizó una comparación a nivel de la programación de java para que fallara en caso de que el mensaje en la página no fuera en correcto.
