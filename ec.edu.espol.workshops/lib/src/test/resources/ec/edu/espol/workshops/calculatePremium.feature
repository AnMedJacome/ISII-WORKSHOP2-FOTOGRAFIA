Feature: Validate the inserted data

Scenario: The customer is a single woman on her 34 years old and she’s thinking to get a driver’s license
Given Is a woman, 34 years old, is not married and doesn’t have a driver’s license
When Inserting data
Then You need a driver license to get the premium value


Feature: Validate the age of the customer

Scenario: The single customer is 21 years old and has a driver’s license
Given 21 years old, is not married, is a man and has a driver’s license
When Inserting data
Then Inserted age is not a number


Feature: Show good feedback for people older than 79 years old

Scenario: The customer is a married woman and soon she will be 81 years old. This is the last year of her driver’s license before it expired
Given Is a woman, 80 years old, is married and she has a driver’s license.
When Inserting data
Then You have exceeded the maximum age to receive a premium value


Feature: Show good feedback for people who doesn’t have a driver’s license

Scenario: The customer is a married man around the 40 years old and he forgot to renew his driver’s license
Given 40 years old, is a man, is married and he doesn’t have a driver’s license
When Inserting data
Then You need a driver license to get the premium value
