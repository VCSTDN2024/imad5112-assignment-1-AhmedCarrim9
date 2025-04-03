Link to GitHub repository: https://github.com/VCSTDN2024/imad5112-assignment-1-AhmedCarrim9.git
Link to YouTube video: https://youtu.be/xdWjJxf2Upg

MealSuggestion App: Comprehensive and Detailed Report

1. Introduction

Using Kotlin and XML in Android Studio, the MealSuggestion app was created for Android.  The app's main objective is to recommend meals according to the time of day; users can enter a certain time and get food recommendations that are appropriate for that time.  By offering an intuitive UI with features like input validation, a reset button, and the possibility to create custom meals, the app improves the user experience.  The development process is strengthened and made more dependable by the integration of GitHub and GitHub Actions, which guarantees effective version control and automated testing.


2. The application's goal

 Problem Description:

Choosing what to eat at different times of the day is a problem for many people.  By recommending meals based on user input, the MealSuggestion app seeks to address this issue.  It promotes healthy food choices, facilitates speedy decision-making, and provides flexibility by letting users upload their own meals.

Goals:

Make food recommendations according to the time of day.
Provide an easy-to-use interface for beginners.
Give people the option to add and personalize their own meals.
Make sure user engagement is free of any errors.
Use GitHub Actions for automated testing and deployment, and GitHub for version control.

3. Design Factors

User Experience and User Interface (UI and UX):

Users will be able to browse the app's UI with ease because to its simple and intuitive design.  The main UI elements consist of:

EditText Field: This field lets users enter the time of day.

Buttons: Has two buttons: "Reset" to remove inputs and "Suggest Meal" to generate meal suggestions.

TextView: Based on the time specified, this window shows the recommended meal.

Toast Messages: Offers an explanation when incorrect input is typed.

3.2 Logic of Application

The application matches user input with preset meal ideas using an if statement (later optimized to when).

suggested meal is shown if the input corresponds to certain hours (such as "morning," "afternoon").

The application asks the user to enter a valid time if the input is deemed invalid.

3.3 Input Validation and Error Handling

To prevent case sensitivity problems, user input is cut and transformed to lowercase.

There is support for partial matches; for example, "morn" will be understood as "morning."

To help the user, the application shows an error message if an invalid input is entered.

4. The GitHub Actions and GitHub

Using GitHub for Version Control
keeps project files.
keeps track of updates and modifications.
Before merging, branches are used for development.
GitHub Automation Actions
Build testing: Verifies that the code builds properly.
Automated testing: Early error detection.
Clean code is ensured by code quality checks.
Continuous Integration: Prior to merging, tests are conducted.
Future Deployment: Releases from the Play Store automatically.

5. In conclusion

Depending on the time of day, the MealSuggestion app offers same-time meal choices.  
It emphasizes customization, input validation, and user-friendly design. 
An effective development process is maintained by GitHub and GitHub Actions. 
With saved meals and UI enhancements.


![Screenshot of App](https://github.com/user-attachments/assets/f7cceeb1-4222-4ae6-950d-3b787156ed30)
![Screenshot of App with Time of day Input](https://github.com/user-attachments/assets/0fce4885-5928-48d7-99af-3e647760cad8)
![Screenshot of App showing if wrong Input is entered](https://github.com/user-attachments/assets/06142375-021f-4d7e-b216-5257e3b27f62)










