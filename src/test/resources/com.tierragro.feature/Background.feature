#Languaje:en
Feature: busqueda de 3 productos en barra de busquedas de tierragro

  Background:
    Given que me encuentro en la pagina tierragro https://www.tierragro.com/

  Scenario: Buscar alimento para perros en barra de busqueda de tierragro
    When quiero buscar el producto
      | producto             |
      | alimentoParaPerros   |
    Then valido producto
      | validar              |
      | alimento para perros |

  Scenario: Buscar alimento para gatos en barra de busqueda de tierragro
    When quiero buscar el producto
      | producto            |
      | alimentoParaGatos   |
   Then valido producto
      | validar             |
      | alimento para gatos |

  Scenario: Buscar arnes para gatos en barra de busqueda de tierragro
    When quiero buscar el producto
       |producto            |
       |arnesParaGatos      |
    Then valido producto
      | validar             |
      | arnes para gatos    |