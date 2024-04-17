@Demo-auto

Feature: Test Demo Automation

  Scenario Outline: Automation - Menu Hamburguesa

    Given I access to the platform <environment>
    When Select login button
    And I enter a username <username>
    And Enter the passsword <password>
    And Select generate token button
    And Select lenguage <lenguage>
    Then I select perfil <perfil>
    And I select the menu
    And Select suboption from menu intelica <menuprincipal>
    And Select suboption from principal menu suboption <submenu>
    And Select newoption from submenusubmenu <option>
    And Close x popup
    And Select the hamburger menu
    And Select the first option filters
    And Select clear button
    And Select Group <group>
    And Select the Region <region>
    And Select Country <country>
    And Select Bank <bank>
    And Select BankStatus <bankstatus>
    And Select the Category <category>
    And Select the SubCategory <subcategory>
    And Field Fee code <feecode>
    And Field Fee name <feename>
    And Field Invoice number <invoicenum>,<period>
    And Select apply after complete any fields


    Examples:
      | environment | username                   | password | lenguage | perfil | menuprincipal | submenu     | option           | group            | region  | country | bank | bankstatus | category | subcategory | period | feecode | feename | invoicenum |
      | QA          | rosario.chale@intelica.com | depapym  | ENG      | -      | M&V Billing   | Fee Summary | Original Invoice | Group - Lloyds   | Testing | country | bank | bankstatus | category | subcategory | period | TEA1111 | TEA1111 | 11111      |
      | QA          | rosario.chale@intelica.com | depapym  | ESP      | -      | M&V Billing   | Fee Summary | Original Invoice | Group - OTP Bank | Testing | country | bank | bankstatus | category | subcategory | period | TEA2222 | TEA2222 | 22222      |
