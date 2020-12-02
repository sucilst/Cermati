@Product
Feature: Product Type
As Ops
I want to have rename Poduct type id to Product Type ID
So that header name looks better

  Background: Login Success (As Admin)
    Given User open sentinel login page
    When User input kraken as username and input password
    Then User can see sentinel dashboard

  @TestCaseKey=BPAS-T3030
  Scenario Outline: Update Product Type Name Success
    Given on product menu
    When user click product type sub menu
    And Click Edit on data that want to update and change name to <name>
    Then Data already updated
    Examples:
    |name     |
    |ayokayok |