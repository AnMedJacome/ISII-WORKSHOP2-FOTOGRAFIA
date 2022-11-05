Feature: Validate the inserted data for premium calculation

@ValidateGenericCustomer
Scenario: The customer is a single woman on her 34 years old and she is thinking to get a driver license
Given Is a woman, 34 years old, is not married and does not have a driver license
When Inserting data
Then You need a driver license to get the premium value

@ValidateCustomerAge
Scenario: The single customer is 21 years old and has a driver license
Given 21 years old, is not married, is a man and has a driver license
When Creating customer
Then Inserted age is not a number

@ValidateSeniorCustomer
Scenario: The customer is a married woman and soon she will be 81 years old. This is the last year of her driver license before it expired
Given Customer is a married, 80 year old woman and has a driver license.
When Creating senior customer
Then You have exceeded the maximum age to receive a premium value

@ValidateCustomerNoLicense
Scenario: The customer is a married man around the 40 years old and he forgot to renew his driver license
Given 40 years old, is a man, is married and he does not have a driver license
When Creating customer with no license
Then You need a driver license to get the premium value