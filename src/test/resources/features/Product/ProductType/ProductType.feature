Feature: Product Type
As Ops
I want to have rename Poduct type id to Product Type ID
So that header name looks better

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T356
  Scenario: correct header name of "product type" not "poduct type" anymore
    Given on product menu
    When user click product type sub menu
    Then user get correct header, that is Product Type ID