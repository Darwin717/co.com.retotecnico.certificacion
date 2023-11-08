#language: es

 Característica: Registro de usuario exitoso
   yo como usuario deseo ingresar a la pagina Utest
   para registrarme de manera exitosa.

  Esquema del escenario: Registro Exitoso
    Dado que Darwin quiere abrir la pagina
    Cuando el se registra de manera exitosa
      | firstName   | lastName   | email   | mes   | dia   | anio   | city   | codPostal   | pais   | pass   |
      | <firstName> | <lastName> | <email> | <mes> | <dia> | <anio> | <city> | <codPostal> | <pais> | <pass> |
    Entonces podra visualizar un mensaje de bienvenida
  Ejemplos:
    | firstName | lastName        | email          | mes | dia | anio | city     | codPostal | pais     | pass              |
    | Darwin    | Ocarman Mercado | correoDeDarwin | May | 10  | 1990 | Medellin | 050001    | Colombia | ClaveDarwin-12345 |