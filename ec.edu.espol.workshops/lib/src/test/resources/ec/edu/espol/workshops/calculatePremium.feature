Feature: Validate the inserted data.

Scenario: The customer is a single woman on her 34 years old and she’s thinking to get a driver’s license.
Given Is a woman, 34 years old, is not married and doesn’t have a driver’s license.
When Inserting data.
Then Throw a “wrong data” error and show the respective message referencing the wrong value.


Feature: Validate the age of the customer.

Scenario: The single customer is 21 years old and has a driver’s license.
Given 21 years old, is not married, is a man and has a driver’s license.
When The age is not written as a number. 
Then Ask for the age again.


Feature: Show good feedback for people older than 79 years old.

Scenario: The customer is a married woman and soon she will be 81 years old. This is the last year of her driver’s license before it expired.
Given Is a woman, 80 years old, is married and she has a driver’s license.
When Validating the inserted data.
Then Show a specific message about the reason of not showing the total premium value, like “You have exceeded the maximum age to receive a premium value”.


Feature: Show good feedback for people who doesn’t have a driver’s license.

Scenario: The customer is a married man around the 40 years old and he forgot to renew his driver’s license.
Given 40 years old, is a man, is married and he doesn’t have a driver’s license.
When Validating the inserted data.
Then Show a specific message about the reason of not showing the total premium value, like “You need a driver’s license to get the premium value”.
