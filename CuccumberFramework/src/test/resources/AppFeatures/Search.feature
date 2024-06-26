Feature: Amazon Search

Scenario: Search A Product
Given I have a search field in the Amazon page
When I search for Product "Apple MacBook Pro" and the price 1000
Then Product Name with the "Apple MacBook Pro" should be displayed
	