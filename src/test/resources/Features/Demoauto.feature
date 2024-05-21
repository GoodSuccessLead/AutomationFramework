@Demo-auto

Feature: Test Demo Automation

  Scenario Outline: Automation - Menu Hamburguesa
    Given Read the excel file <Sheetname>,<Rownumber>
    And I access to the platform <Sheetname>,<Rownumber>
    When Select login button
    And I enter the credentials <Sheetname>,<Rownumber>
    And Select generate token button
    And Select lenguage <Sheetname>,<Rownumber>
    Then I select perfil <Sheetname>,<Rownumber>
    And I select the menu
    And Select suboption from menu intelica <Sheetname>,<Rownumber>
    And Select suboption from principal menu suboption <Sheetname>,<Rownumber>
    And Select newoption from submenusubmenu <Sheetname>,<Rownumber>
    And Close x popup
    And Select the hamburger menu
    And Select the first option filters
    And Select clear button
    And Select Group <Sheetname>,<Rownumber>
    And Select the Region <Sheetname>,<Rownumber>
    And Select Country <Sheetname>,<Rownumber>
    And Select Bank <Sheetname>,<Rownumber>
    And Select BankStatus <Sheetname>,<Rownumber>
    And Select the Category <Sheetname>,<Rownumber>
    And Select the SubCategory <Sheetname>,<Rownumber>
    And Field Fee code <Sheetname>,<Rownumber>
    And Field Fee name <Sheetname>,<Rownumber>
    And Field Invoice number <Sheetname>,<Rownumber>
    And Select apply after complete any fields

    Examples:
      | Sheetname | Rownumber |
      | Deisy     | 0         |
      | Deisy     | 1         |
      | Deisy     | 2         |
      | Deisy     | 3         |
      | Deisy     | 4         |
      | Deisy     | 5         |
      | Deisy     | 6         |
      | Deisy     | 7         |
      | Deisy     | 8         |


