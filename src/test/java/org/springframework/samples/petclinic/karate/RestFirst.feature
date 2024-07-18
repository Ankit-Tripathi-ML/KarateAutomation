Feature: first project

  Scenario: Test API
    Given url ccUrl
    When method get
    Then status 200


  Scenario: Add owner
    Given url "http://localhost:9966/petclinic/api/owners"
    And request {"firstName":"Ankit","lastName":"T","address":"110 W. Liberty St.","city":"Madison","telephone":"6085551045"}
    When method post
    Then status 201

    * def id = response.id
    And print id
    * def jsonObject =
      """
      {
        "id": '#(id)'
      }
      """
    * def user = call read('sub1/Get.feature')
    * print user
