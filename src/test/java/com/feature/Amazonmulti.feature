Feature: Amazon Ecommerence Application Allows The User To Purchase Product

Scenario Outline: Home Page
Given user Launch The Application Url
When  user Selectes The "<dropdown>" From Dropdown
And  user Search The "<value>" In SearchBox
Then user Click The Searched Product From The Suggestion and It navigates To productPage
Examples:
|dropdown|value|
|Baby|Soft Toys|
|Books|Java|