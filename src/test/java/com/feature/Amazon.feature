Feature: Amazon Ecommerence Application Allows The User To Purchase Product
@smoke
Scenario: Home Page
Given user Launch The Application Url
When  user Selectes The "baby" From Dropdown
And  user Search The "Soft Toys" In SearchBox
Then user Click The Searched Product From The Suggestion and It navigates To productPage

Scenario: Product Page
When get First Lodaded Title and OfferPrice and Click The First Product

@sanity
Scenario: Loaded Product
When get The Loaded Title and OfferPrice and Check Whether Loaded Product Is Correct
And add The Product To The Cart 
Then proceed To CheckOut and Take A Screen Shot