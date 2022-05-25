Feature: Produck Search in Amazon

Scenario Outline: iPhone 13 Pro

Given I am on Amazon homepage
When I enter search "<term>"
And I click on search button
Then I received related search result

Examples:
|term|
|iPhone 13 Pro|
