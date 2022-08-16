#Languaje:en
Feature: consulta sobre productos de la tienda
  Background:
    Given que me encuentro en la pagina tierragro https://www.tierragro.com/
  Scenario:
    When quiero ver caracteristica de producto
    Then valido precio
