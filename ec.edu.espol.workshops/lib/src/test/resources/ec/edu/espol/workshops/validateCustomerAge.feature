Feature: Validate the age of the customer

Scenario: The single customer is 21 years old and has a driver license
Given 21 years old, is not married, is a man and has a driver license
When Creating customer
Then Inserted age is not a number