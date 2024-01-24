Feature: Comprar de productos en carrito de compras

  @mi-path-feliz
  Scenario Outline: Proceso de compra online
    #agregar productos al carrito de compras
    Given User esta en la pagina de open cart
    When agrega dos productos al carrito de compras
    And ingresa al carrito de compras
    Then verifica que los productos se agregaron al carrito

    #completar formulario y completar compra
    When ingresa datos para confirmar compra "<first_name>", "<last_name>",  "<email>",  "<phone>",  "<company>",  "<address>",  "<city>", "<post_code>",  "<country>",  "<region>"
    And confirma la orden de compra
    Then verifica si se ha completado la orden de compra

    Examples:
      | first_name | last_name | email    | phone   | company | address | city    | post_code | country | region |
      |Christian Damian|Barrera Duarte|ing.damianbarr@gmail.com|0999956328|NTTData|Calle del Batan 2-91 y Guayas|Cuenca|010102|Ecuador|Azuay|