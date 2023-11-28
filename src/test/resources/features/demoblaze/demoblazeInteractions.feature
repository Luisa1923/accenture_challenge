  # language: es
  @FeatureName:demoblazeInteractions
  Característica: Interacciones del actor de usuario en demoblaze

  Escenario: Registro de usuario
    Dado que el usuario ha navegado a la pagina demoblaze
    Cuando realiza proceso de registro de usuario
    Entonces el registro es exitoso
    Y ingresa a su cuenta correctamente

  Esquema del escenario: Compra de productos
    Dado que el usuario ha navegado a la pagina demoblaze
    Cuando agrega al carrito de compras un producto de la categoria <Categoria> y la marca <Marca>
    Y termina proceso de compra
    Entonces se confirma proceso de compra exitoso

    Ejemplos:
      |Categoria         |Marca        |
      |"phones"          |"Nokia"      |
      |"laptops"         |"Sony vaio"  |