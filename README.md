**My project is about a travel manager**. 
I created a travel planning program that makes organizing your trip easier and more enjoyable. Here’s how it works:

Personal Preferences: I start with a quick questionnaire to understand your climate and food preferences.
Country Suggestions: Based on your answers, the program suggests a few countries you might like.
Booking and Planning: Once you pick a country, I handle booking flights, finding hotels or rental houses, and planning your entire trip. This includes figuring out how you’ll get around and suggesting activities based on your interests.
Budget Management: I keep track of your expenses to help you stay within your budget.
Local Tips: I provide information on local attractions, recommend restaurants for authentic dishes, and give you tips on where to enjoy the best local cuisine.
The goal is to save you time and ensure you have a personalized, stress-free travel experience.


## Key Features:
Custom Exceptions: InvalidEmailException and InvalidNumberCard handle invalid email addresses and identification numbers, respectively. These are used within the bookingTicket class to validate user inputs.

Multithreading: Using multithreading to generate country lists concurrently, improving overall performance. The Runnable interface is employed to handle thread execution.

Generics:TravelVacation utilizes generics with a type parameter T constrained to Vacation or its subclasses. Methods like addVacation, remove, getVacations, and print manage vacation data efficiently.

Run-Time Type Information (RTTI): Explicit RTTI is used to determine the type of user objects (User or Adult) with the instanceof operator, allowing for precise typecasting and information retrieval.

Nested Classes: A nested class is employed within the bookingTicket class to organize and manage related functionality.

Lambda Expressions: Are used in the TravelVacation class to simplify code and enhance readability.
