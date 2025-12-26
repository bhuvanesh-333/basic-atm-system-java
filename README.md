# Simple Java ATM Console

A simple Java console-based ATM application demonstrating basic banking operations like balance check, deposit, and withdrawal. Built as a beginner-friendly project to practice core Java concepts.

## Features

- Check current account balance
- Deposit amount to balance
- Withdraw amount from balance with validation
- Simple text-based menu loop
- Uses basic control flow, methods, and `Scanner` for user input

## Technologies Used

- Java (Core Java)
- Console-based input/output

## Project Structure

- `Simpleatm.java`  
  Contains the main class with:
  - `main` method and menu loop
  - `checkBalance()` method
  - `deposit()` method
  - `withdraw()` method

## How to Run

1. Clone the repository:
git clone https://github.com/<your-username>/simple-java-atm-console.git
cd simple-java-atm-console

text

2. Compile the Java file:
javac Simpleatm.java

text

3. Run the program:
java Simpleatm

text

## Possible Improvements

- Add PIN authentication before accessing the ATM
- Persist balance using a file or database instead of an in-memory variable
- Support multiple user accounts
- Add input validation for non-numeric inputs
- Create a simple menu loop to go back after each action (e.g., confirm before exit)

## License

This project is open for learning purposes. Feel free to fork and modify it.
