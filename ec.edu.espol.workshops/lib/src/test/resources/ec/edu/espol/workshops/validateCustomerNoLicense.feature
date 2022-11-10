Feature: Show good feedback for people who don’t have a driver license

Scenario: The customer is a married man around the 40 years old and he forgot to renew his driver license
Given 40 years old, is a man, is married and he does not have a driver license
When Creating customer with no license
Then You need a driver license to get the premium value