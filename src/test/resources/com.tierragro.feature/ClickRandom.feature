#Languaje:en
Feature: Entrar en pagina  tierragro

Background:
  Given que me encuentro en la pagina tierragro https://www.tierragro.com/

  Scenario: Buscar alimento para perros en barra de busqueda de tierragro
    When quiero entrar en la tienda y comprar producto
    Then selecciono una lista de producto


