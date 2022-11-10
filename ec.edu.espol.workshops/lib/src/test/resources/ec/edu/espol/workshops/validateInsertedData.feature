Feature: Validate the inserted data

Scenario: The customer is a single woman on her 34 years old and she is thinking to get a driver license
Given Is a woman, 34 years old, is not married and does not have a driver license
When Inserting data
Then You need a driver license to get the premium value