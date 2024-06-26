Feature: Uber Booking Feature
Scenario: Booking Cab

Given User wants to select the car type "Sedan" From Uber App
When  User selects car "Sedan" and pick up point as "Bangalore" and drop "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User Pays 1000 USD 

