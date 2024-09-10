My project is about a travel manager. 
The project starts with a questionnaire about your preferences regarding climate and food. Based on the answer, the program generates several countries that you might like. Then the user can choose one of these countries.
The program will then start booking flights and then search for a hotel or rental house. The program then provides the user with information about attractions in that country and plans the entire trip. This means that the program will determine how you might move around in that country. The program will also take into account your interests and preferences and suggest different activities you could do in that country.
In addition, the program will also keep track of your expenses and help you stay within your budget.
If necessary, the program will also provide you with information about the local cuisine and recommend places where you can enjoy authentic dishes. It will also advise you on the best restaurants to try the national food.
The overall goal of this project is to provide users with a comprehensive and personalized travel experience. The program strives to be user-friendly and ensure that users get what they want out of their vacation. 
The advantage of this project is that users do not have to spend hours searching for information about the different countries and places they want to visit. 


## Key Features:
Custom Exceptions: InvalidEmailException and InvalidNumberCard handle invalid email addresses and identification numbers, respectively. These are used within the bookingTicket class to validate user inputs.
Multithreading: Using multithreading to generate country lists concurrently, improving overall performance. The Runnable interface is employed to handle thread execution.
Generics:TravelVacation utilizes generics with a type parameter T constrained to Vacation or its subclasses. Methods like addVacation, remove, getVacations, and print manage vacation data efficiently.
Run-Time Type Information (RTTI): Explicit RTTI is used to determine the type of user objects (User or Adult) with the instanceof operator, allowing for precise typecasting and information retrieval.
Nested Classes: A nested class is employed within the bookingTicket class to organize and manage related functionality.
Lambda Expressions: Are used in the TravelVacation class to simplify code and enhance readability.
