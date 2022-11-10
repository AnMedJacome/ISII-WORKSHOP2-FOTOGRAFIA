Feature: Show good feedback for people older than 79 years old

Scenario: The customer is a married woman and soon she will be 81 years old. This is the last year of her driver license before it expired
Given Customer is a married, 80 year old woman and has a driver license.
When Creating senior customer
Then You have exceeded the maximum age to receive a premium value