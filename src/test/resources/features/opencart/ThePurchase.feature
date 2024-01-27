Feature: Comprar de productos en carrito de compras opencart

  @mi-path-feliz
  Scenario Outline: Proceso de compra online
    #agregar productos al carrito de compras
    Given User esta en la pagina de open cart
    When agrega dos productos al carrito de compras
    And ingresa al carrito de compras y procede al checkout

    #completar formulario y completar compra
    When ingresa datos para confirmar compra "<first_name>", "<last_name>",  "<email>",  "<phone>",  "<company>",  "<address>",  "<city>", "<post_code>",  "<country>",  "<region>"
    And confirma la orden de compra
    Then verifica que se haya completado la orden de compra

    Examples:
      | first_name | last_name | email    | phone   | company | address | city    | post_code | country | region |
      |Damian|Duarte|ing@gmail.com|099|NTT|Calle del Batan|Cuen|0101|Ecua|Azu|