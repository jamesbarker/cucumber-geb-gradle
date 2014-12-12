Feature: Cucumber and Geb

As an automation tester
I would like to use Cucumber and Geb together
So I can have a sweet automation stack

  Scenario: Visit Cross Browser Automation page from the Home page
    Given I am on the "Geb Home" page
    When the link to the "Cross Browser" page is clicked
    Then I am taken to the "Geb Cross Browser" page

  @wip
  Scenario: Visit another page (that has no been automated yet hense the @wip)
    Given I am on the "Geb Home" page
    When the link to another page
    Then I am taken to the other page