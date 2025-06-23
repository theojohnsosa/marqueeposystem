# 🎟️ Marquee POS System

A Java-based Point of Sale (POS) application tailored for cinema operations. Built using Swing for the interface and Maven for dependency management, the system supports multi-category sales, user authentication, and receipt generation.

---

## 🛠️ Built With

- **Java (Swing GUI)** – Desktop-based user interface  
- **Maven** – Project management and build automation  
- **JDK 8+** – Core language features  
- **Text File I/O** – For simple data persistence (e.g. receipts)

---

## 📦 Project Structure

```
MarqueePosSystem/
├── src/
│   └── main/java/com/mycompany/marqueepossystem/
│       ├── Login.java
│       ├── CashierDashboard.java
│       ├── TicketsDashboard.java
│       ├── SnacksSubMenu.java
│       └── ... and other category dashboards
├── target/
├── pom.xml
└── CinemaReceipt.txt
```

---

## 🚀 Features

- 🎫 **Ticketing**: Sell and manage cinema tickets
- 🍿 **Snacks and Beverages**: POS screens for multiple food categories
- 💳 **Cashier Mode**: Dedicated UI for handling orders and payments
- 🧾 **Receipt Generation**: Prints order details to `CinemaReceipt.txt`
- 👥 **User Roles**: Admin and cashier login flows
- ✅ **Basic Validation**: Ensures data consistency during input

---

## 🖥️ How to Run

### Prerequisites

- JDK 8 or higher
- Apache Maven installed

### Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/theojohnsosa/marqueeposystem.git
   cd marqueeposystem/MarqueePosSystem
   ```

2. **Compile the project**:
   ```bash
   mvn compile
   ```

3. **Run the application**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.mycompany.marqueepossystem.Login"
   ```

> ⚠️ Make sure to adjust the main class path if the entry point differs.

---

## 📄 Receipt Output

All finalized orders are exported to `CinemaReceipt.txt` in the root folder for record-keeping or printing purposes.

---

## 📌 Notes

- This version uses **local file I/O only**. There's no database integration.
- Ideal for **offline use** or as a **capstone / thesis prototype**.
- Extendable for inventory tracking, database storage, or analytics.

---

## 🤝 Contributing

Pull requests are welcome! If you'd like to contribute:
1. Fork the repo
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes
4. Push and open a PR

---

## 📧 Contact

**Theojohn Sosa**  
📧 theojohnsosa@gmail.com  
🔗 [GitHub](https://github.com/theojohnsosa)

---

## 📝 License

This project is licensed under the MIT License. See `LICENSE` for details.
