Feature: Ebay Home Page Scenarios

@search_item
Scenario: Search Items count
	Given I am on Eaby Home Page
	When I serach for 'playstation 4'
	Then I validate atleast 50 search items present