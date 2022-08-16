#Languaje:en
Feature: consulta sobre productos de la tienda

  Scenario Outline: <caso> <producto>
    Given que me encuentro en la pagina tierragro <Url>
    When quiero conocer caracteristica de <producto>
    Then valido precio de <validar>

    Examples:
      | caso            | producto             | Url                        | validar                                             |
      | buscar producto | alimento para perros | https://www.tierragro.com/ | Alimento Para Perro Royal Canin Bhn Bulldog Frances |
      | buscar producto | tierra mejorada      | https://www.tierragro.com/ | tierra mejorada                                     |
      | buscar producto | humus                | https://www.tierragro.com/ | Humus Lombricompuesto x 2 kg                        |
      | buscar producto | alimento para gatos  | https://www.tierragro.com/ | ROYAL CANIN                                         |
      | buscar producto | arnes gato           | https://www.tierragro.com/ | Arnes gato                                          |

