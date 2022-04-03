@amazon

Feature: Create an account

Scenario Outline: Verify the error message by creating a invalid account

Given user on Amazon homepage
When user clicks on Hello Sign In button
And user clicks on Create An Amazon Account button
And user enters name as "<yourName>"
And user enters email as "<eMail>"
And user enters password as "<password>"
And user enters repassword as "<rePassword>"
And user clicks on Continue button
Then user verifies the error message

Examples:
|yourName|eMail                  |password         |rePassword          |
|addidas |addon@aol.com          |nikerocks11      |nikerocks11         |
|STPL    |vanscool@msn.com       |coolerthanme22   |coolerthanme22      |
|wework  |zookeeper9922@yahoo.com|lionkingwasnice33|lionkingwasnice33   |