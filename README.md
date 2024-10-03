# ATM Interface Project

## Author
**Hritik Ranjan**

## Project Overview
The ATM Interface project is a console-based Java application simulating basic ATM functionalities. Users can register an account, login, and perform operations like withdrawing money, depositing money, transferring funds, checking balance, and viewing transaction history. It is designed to mimic the essential functionalities of an ATM machine.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Results](#results)
- [License](#license)
- [Contact](#contact)

## Introduction
This project allows users to interact with an ATM system via the command-line interface. After registration and login, users can perform a series of transactions like withdrawals, deposits, and transfers. Each transaction is recorded, and users can check their balance and view transaction history.

## Features
- **User Registration**: Users can register by providing their name, username, password, and account number.
- **Login**: Users need to authenticate using their username and password.
- **Withdraw Money**: Users can withdraw funds from their account (if they have sufficient balance).
- **Deposit Money**: Users can deposit money into their account (up to a certain limit).
- **Transfer Money**: Users can transfer money to another account (up to a specified limit).
- **Check Balance**: Users can view their account balance.
- **Transaction History**: Users can view their transaction history to track withdrawals, deposits, and transfers.
- **Exit**: Option to exit from the ATM interface.

## Installation
To run this project, ensure that Java is installed on your system. You can follow these steps to set up and run the project:

1. **Clone the repository** (if applicable):
   ```bash
   git clone https://github.com/hritikranjan1/atm_interface_project.git
   cd atm_interface_project
2.Compile the Java files:

    javac AtmInterface.java

3.Run the program:

    java AtmInterface
## Usage

Once the program is running, the following steps can be followed:

- 1.Register: Enter your name, username, password, and account number to register.
- 2.Login: Authenticate using your username and password.
- 3.After login, you can:
        - Withdraw money.
        - Deposit money.
        - Transfer money to another account.
        - Check your account balance.
        - View your transaction history.
  ## Example Workflow:
  
      WELCOME TO ATM SYSTEM

       1. Register
       2. Quit
      Enter Your Choice : 1

      Enter Your Name : John Doe
      Enter Your Username : johndoe
      Enter Your Password : ******
      Enter Your Account Number : 12345678
 
      Registration completed..kindly login

      1. Login
      2. Quit
      Enter Your Choice : 1

      Enter Your Username : johndoe
      Enter Your Password : ******
      Login successful...
 
      WELCOME BACK John Doe

      1. Withdraw
      2. Deposit
      3. Transfer
      4. Check Balance
      5. Transaction History
      6. Exit

      Enter Your Choice : 2
      Enter amount to deposit: 1000
      Successfully Deposited...
## Results

Once logged in, users can perform different ATM operations. The program provides feedback after every operation, confirming whether the action was successful. Here is an example of the output when depositing money:
## Example Output:
       WELCOME BACK John Doe

        1. Withdraw
        2. Deposit
        3. Transfer
        4. Check Balance
        5. Transaction History
        6. Exit

        Enter Your Choice : 2
        Enter amount to deposit : 1000
        Successfully Deposited...

        Balance: 1000 Rs
  ## License

This project is licensed under the MIT License - see the LICENSE file for details.
  ## Contact   

  Name: Hritik ranjan
  GitHub: https://github.com/hritikranjan1
  LinkedIn: https://www.linkedin.com/in/hritik-ranjan-05a835230/
