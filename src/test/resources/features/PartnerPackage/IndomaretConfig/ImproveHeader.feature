Feature: Improve Header Tabel Indomaret Configuration
  As an user
  I want to change rc partner to rc alterra
  So that i can see rc alterra in this page

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T554
  Scenario: Change header RC Partner to RC Alterra
    Given user in partner package page
    When go to indomaret configuration page
    Then showing RC Alterra in header tabel

  @TestCaseKey=BPAS-T555
  Scenario: Change list RC Partner to RC Alterra
    Given user in indomaret configuration page
    When Add Response Code Mapping
    And click field RC Alterra
    Then showing list RC Alterra