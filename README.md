# Quantum Bookstore Challenge – Fawry N² Dev Slope #10

This repository is my complete solution to the **Quantum Bookstore** challenge for the Fawry N² Full Stack Internship 2025.  
The project demonstrates a clean, object-oriented, and extensible Java design for managing different types of books in an online bookstore.

---

## Features

- Add books to inventory with:
  - ISBN, title, author, publication year, price
  - Type: `PaperBook`, `EBook`, or `ShowcaseBook`
- Remove books:
  - By ISBN
  - If outdated (based on publish year and age limit)
- Buy books using their ISBN
  - Quantity-based purchase (for physical books)
  - Delivery handled based on book type:
    - Paper books: shipped via `ShippingService`
    - EBooks: sent via `MailService`
    - Showcase books: not purchasable


---

## Design Choices

- Abstract base class (`Book`) encapsulates shared attributes and logic
- Subclasses (`PaperBook`, `EBook`, `ShowcaseBook`) handle their own availability and delivery mechanisms
- No runtime polymorphism issues — each book type defines exactly how it behaves
- `Customer` class centralizes customer data (email, address) to avoid redundancy
- Final method `purchase()` in `Book` enforces consistent transaction logic while allowing customization via abstract methods

---

## Extensibility

This system follows the Open/Closed Principle: open for extension, closed for modification.

- To add a new book type (e.g., `AudioBook`), simply extend the `Book` class and implement the required methods.
- No need to change existing classes or logic.
- Services are decoupled from the book logic for better maintainability.

---

## Sample Output

![image](https://github.com/user-attachments/assets/a5655689-0ee7-4c41-9cc2-9aca5c055eef)

## How to Run

1. Clone or download the repository  
2. Open a terminal in the project directory  
3. Compile and run the program:

```bash
javac Main.java
java Main


