# 📚 Quantum Bookstore – Fawry N² Dev Slope #10 Internship Task

A simple yet extensible Java-based bookstore system supporting different types of books (Paper, EBook, and Demo), with functionality for adding, buying, and removing books.  
The project is designed using Object-Oriented Programming and is structured to easily support future product types.

---

## 🚀 Features

- ➕ Add books (ISBN, title, year, price)
- 🗑️ Remove outdated books by publication year
- 🛒 Buy books using ISBN, quantity, email, and address
- 📦 Handles **PaperBook** shipping
- 📧 Handles **EBook** emailing
- 🚫 Prevents purchasing **DemoBook**
- 🧩 Extensible object-oriented design (easy to add more book types)

---

## 🧱 Book Types

| Type         | Buyable | Delivery Method     | Additional Fields |
|--------------|---------|----------------------|-------------------|
| **PaperBook**| ✅      | Shipping address     | `stock: int`      |
| **EBook**    | ✅      | Sent via email       | `fileType: String`|
| **DemoBook** | ❌      | Not for sale         | —                 |

---

## 🛠️ Tech Stack

| Layer      | Tech       |
|------------|------------|
| Language   | Java       |
| Design     | OOP        |
| Testing    | Manual via `main()` method |
| Diagram    | Draw.io (UML Class Diagram) |

---

## 🧠 OOP Structure

- `Book`: Abstract base class for all book types  
- `Paper_book`, `EBook`, `Demo_Book`: Extend `Book` and override behavior  
- `Book_store`: Manages the Library and actions (add, remove, buy)

---

## 🖼️ UML Class Diagram

<details>
<summary><strong>📌 Click to view</strong></summary>

<br>

📄 [Click here to view UML Diagram (PDF)](https://github.com/ramah83/Quantum-Bookstore-Fawry/blob/main/Erd%20Task2.pdf)

</details>

---

## 📁 Project Structure

```text
Quantum-Bookstore/
├── Book.java
├── Paper_book.java
├── EBook.java
├── Demo_Book.java
├── Book_store.java
├── QuantumBookstoreFullTest.java
└── README.md
