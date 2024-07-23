Feature: first project

  Scenario: Test API
   # Given url ccUrl
    #When method get
    #Then status 200
    * def baseurl = read('customEnvConfig.json')
    * print baseurl.baseurl


  Scenario: Add owner
    * def baseurl = read('customEnvConfig.json')
    Given url baseurl.baseurl+"petclinic/api/owners"
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
