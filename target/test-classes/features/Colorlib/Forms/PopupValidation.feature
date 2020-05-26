#Author: your.email@your.domain.com

@Regresion
Feature: Formulario Popup Validacion
El usuario debe poder ingresar al formulario los datos requeridos,
Cada campo del formulario realiza validaciones de obligatoriedad,
longitud y fomato, el sistema debe presentar las validaciones respectivas
para cada campo a traves un globo informativo.o exito


 @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
            no se presenta ningun mensaje de validacion.
   Given autentico en colorlib con usuario  "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation
      |Required|Select|Multiples1|Multiples2|Url                  |Email          |Password1|Password2|Minsize|Maxsize|Number|IP         |Date      |DateEarlier|
      |Valor2  |Golf  |Tennis     |Golf     |www.valor1.com|valor1@mail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
    Then Verifico ingreso exitoso
    
@CasoAlterno
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
         no se presenta ningun mensaje de validacion.

    Given autentico en colorlib con usuario  "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation
      |Required|Select|Multiples1|Multiples2|Url                  |Email          |Password1|Password2|Minsize|Maxsize|Number|IP         |Date      |DateEarlier|
      |         |Golf  |Tennis     |Golf     |ww.w.valor1.com|valor1@mail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
      | Valor1  |Choose a sport  |Tennis     |Golf     |ww.w.valor1.com|valor1@mail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 | 
    Then Verificar que se presente Globo Informativo de validación
    