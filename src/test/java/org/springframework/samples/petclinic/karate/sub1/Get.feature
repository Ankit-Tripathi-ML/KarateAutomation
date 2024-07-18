Feature: Get request

  Scenario: new user fetch
  Given url 'http://localhost:9966/petclinic/api/owners/'+jsonObject.id
    When method get
    Then status 200
