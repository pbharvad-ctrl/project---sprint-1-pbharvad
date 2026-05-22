# project---sprint-1-pbharvad
## Checklist

- Are you in a Group?
   No

- If so, who else is in your group?
  N/A

- What programming language are you selecting? Which version?
  Java 17

- Do you have your GitHub account set up?
  Yes

- Do you have a public repository for your Project?
  Yes

- What is the link to your GitHub repository?
https://github.com/pbharvad-ctrl/project---sprint-1-pbharvad

- If you are in a group, does everyone have access to the github repo?
   N/A

- Do you have a “Hello World” program that compiles and runs?
  Yes

- Where is the entry point to your project?
  src/Main.java

---



# Restaurant Ordering & Management System

## Project Idea
The Restaurant Ordering & Management System is a Java-based software application designed to manage restaurant operations efficiently. It allows customers to browse the menu, place orders, customize food items, select payment methods, and track order progress. It also provides tools for kitchen staff and administrators to manage incoming orders, menu items, and sales records.

This project is large enough to demonstrate multiple custom Design Patterns and object-oriented programming concepts.

## Main Features
- Display restaurant menu
- Add items to cart
- Customize food orders (extra toppings, sizes, drinks)
- Place customer orders
- Process payments
- Update and track order status
- Kitchen receives new orders
- Admin can manage menu and view reports

## Planned Design Patterns
1. **Factory Pattern**  
   Used to create menu items such as Burger, Pizza, Drink, Dessert.

2. **Singleton Pattern**  
   Used for one central system manager or database connection.

3. **Observer Pattern**  
   Kitchen staff is notified when a new order is placed.

4. **Strategy Pattern**  
   Different payment options such as Cash, Credit Card, Online Payment.

5. **Decorator Pattern**  
   Add extras such as cheese, toppings, sauces.

6. **State Pattern**  
   Order moves through states: Pending, Preparing, Ready, Completed.

## Libraries / Tools Planned
- Java Swing or JavaFX (GUI)
- JDBC
- SQLite
- Gson / Jackson
- Java Collections Framework

## Sprint 2 Progress
### Meaningful Commits
1. Create GitHub repository and add README.md  
2. Build project structure and menu item classes  
3. Implement order creation and cart system  
4. Add payment methods and order status system  

## Language
- Java

## Team Members
- PREET BHARVAD

# Restaurant Ordering & Management System

## Project Overview

The Restaurant Ordering & Management System is a Java-based software application designed to manage restaurant operations efficiently. The system allows customers to browse menu items, customize food, place orders, process payments, and track order progress. Kitchen staff receive updates for incoming orders, while administrators can manage menu items and monitor restaurant activities.

This project demonstrates Object-Oriented Programming principles and the implementation of software design patterns to improve maintainability, scalability, and flexibility.

---

## Main Features

- Display restaurant menu
- Add items to shopping cart
- Customize food orders (extra toppings, sizes, drinks)
- Place customer orders
- Process payments
- Update and track order status
- Kitchen receives new orders
- Admin manages menu and reports

---

## Sprint 3 Progress

During Sprint 3, the project was refactored and improved by implementing custom Design Patterns to improve maintainability and organization of the system.

### Design Patterns Implemented

### 1. Strategy Pattern – Payment Processing

The Strategy Pattern was implemented to support multiple payment methods in the restaurant system.

#### Purpose
Different payment options require different processing logic. Instead of hardcoding payment methods inside a single class, the Strategy Pattern allows payment behaviors to be interchangeable.

#### Implemented Classes

**PaymentStrategy (Interface)**
- `processPayment(double amount)`

**CashPayment**
- Handles cash payment processing

**CreditCardPayment**
- Handles credit card transactions

**OnlinePayment**
- Handles digital/online payments

**PaymentContext**
- Selects and executes the chosen payment strategy

#### Example Flow
Customer places order → selects payment method → system applies selected payment strategy.

#### Benefits
- Easy to add new payment methods
- Cleaner code organization
- Follows Open/Closed Principle

---

### 2. Observer Pattern – Kitchen Order Notifications

The Observer Pattern was implemented to notify kitchen staff when a new order is placed.

#### Purpose
When customers place an order, kitchen staff should automatically receive updates without tightly coupling kitchen logic to ordering logic.

#### Implemented Classes

**Subject Interface**
- `registerObserver()`
- `removeObserver()`
- `notifyObservers()`

**KitchenStaff (Observer)**
- Receives notifications for new orders

**OrderManager**
- Maintains order list
- Notifies kitchen staff whenever a new order is placed

#### Example Flow
Customer places order → OrderManager creates order → KitchenStaff automatically receives notification.

#### Benefits
- Loose coupling between ordering and kitchen system
- Better scalability
- Easier to maintain notification system

---

## UML Diagram

A UML diagram containing all classes, interfaces, methods, and fields related to the implemented design patterns is included in the root directory of this repository.

The UML diagram includes:

### Strategy Pattern Classes
- PaymentStrategy
- CashPayment
- CreditCardPayment
- OnlinePayment
- PaymentContext

### Observer Pattern Classes
- Subject
- Observer
- KitchenStaff
- OrderManager
- Order

---

## Sprint 3 Meaningful Commits

1. Implemented Strategy Pattern for payment processing system

2. Added payment method classes and payment context

3. Implemented Observer Pattern for kitchen notifications

4. Added UML diagram and updated README documentation

---

## Final Submission Goals

For the final submission, the goal is to develop a fully functional Restaurant Ordering & Management System with an interactive interface and complete order management process. Customers will be able to browse menu items, customize food, add items to a cart, place orders, and choose payment methods.

Kitchen staff will receive real-time notifications for incoming orders and update order status throughout preparation. The administrator will be able to manage menu items, monitor restaurant activity, and generate reports. Additional improvements such as database integration using SQLite and a polished GUI using Java Swing or JavaFX are planned.

---

## Problems / Challenges

One challenge during Sprint 3 was integrating Design Patterns into existing code while maintaining system functionality. Refactoring parts of the payment and order systems was necessary to properly implement the Strategy and Observer patterns.

Another challenge is designing the database structure and GUI integration while keeping the system modular and maintainable. Time management and debugging may affect some advanced features planned for the final submission.

---

## Technologies Used

- Java
- Java Swing / JavaFX
- JDBC
- SQLite
- Gson / Jackson
- Java Collections Framework

---

## Team Members

**PREET BHARVAD**

# Restaurant Ordering & Management System

## Project Description

This Java-based Restaurant Ordering & Management System helps manage restaurant operations efficiently. The system allows order tracking, payment processing, kitchen notifications, and food item management using object-oriented programming and design patterns.

## Design Patterns Implemented

### Observer Pattern
Used to notify different restaurant components when an order status changes.

Observers:
- KitchenStaff
- CustomerNotification

### Strategy Pattern
Used to support multiple payment methods.

Strategies:
- Cash Payment
- Credit Card Payment
- Online Payment

### Factory Pattern
Used to create food items dynamically without directly instantiating objects.

Food Types:
- Burger
- Pizza

### Singleton Pattern
Used to maintain a single Restaurant Management System instance.

## Sprint 4 Goals

- Improve restaurant order tracking
- Expand notification system
- Add more food types
- Improve system scalability

## Challenges

- Integrating multiple design patterns together
- Updating UML diagram to reflect new patterns
- Managing communication between system components
