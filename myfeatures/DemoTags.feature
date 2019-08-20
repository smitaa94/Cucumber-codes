Feature: Understanding of tags
@Smoke @Sanity
Scenario: Login validation on flipkart
Given Flipkart is launched by the user
Then valid credentials are entered by user
And user clicks on submit button
@Regression
Scenario: User access tp items in portal
Given user searching the product with code
Then user able to add it to cart
@Smoke
Scenario: User access to items in portal
Given user able to see item count on cart
Then user removes product from cart
@Sanity
Scenario: User wants to track the order
Given user has active order
Then user verifies the status of order

