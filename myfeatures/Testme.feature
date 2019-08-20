Feature: My validations on testme for Demo HDC
Scenario Outline: Login validations for multiple users in testme app
Given test me is launched by user
When user clicks on sign in link
Then user provides valid username "<uname>"
And user provides valid password "<pswrd>"
Then user clicks for submission of the date
And verifies the login status for account
Examples:
|uname |pswrd |
|lalitha | Password123 |
|Admin | Password456 |
