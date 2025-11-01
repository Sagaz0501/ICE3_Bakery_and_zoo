# 🥖 ICE2 Bakery and Zoo Program

## 📘 Overview
**ICE2 Bakery and Zoo Program** is a Java multithreaded simulation that models a small-town bakery operation.  
It demonstrates the use of **threads**, **interfaces**, and **object-oriented programming (OOP)** principles such as **abstraction**, **composition**, and **encapsulation**.

The main scenario includes:
- A **Bakery** that produces bread at random intervals.  
- A **Delivery Girl** who delivers freshly baked bread to registered clients.  
- **Clients** who acknowledge receiving their bread.  

This README describes the **first commit** version — before any refactoring or later design adjustments.

---

## 🧩 Class Diagram
Below is the class diagram used for the first commit implementation:

![Class Diagram](34df715a-7802-452a-a364-61155c960501.png)

---

## 🧱 Class Descriptions

### 🏠 Bakery
The `Bakery` class represents the central system that manages the bread baking process.

**Attributes**
- `name : String` — Bakery’s name.  
- `random : Random` — Generates random baking intervals.  
- `open : boolean` — Indicates if the bakery is active.  
- `loavesToTake : int` — Total number of loaves to bake.  
- `worker : Thread` — Thread that runs the baking loop.

**Methods**
- `Bakery(String name)` — Constructor to initialize the bakery.  
- `registerGirl(BreadReadyListener listener)` — Registers the delivery girl to be notified when bread is ready.  
- `startBaking(int loaves)` — Begins baking a given number of loaves.  
- `run()` — Core method executed by the bakery’s internal thread.  
- `bakeLoop(int loaves)` — Controls the bread production cycle with random delays.  
- `close()` — Stops the bakery operation.  
- `joinQuietly()` — Waits for the worker thread to finish execution.  
- `getName()` — Returns the bakery’s name.  
- `main(String[] args)` — Entry point for running the program.

---

### 👩‍🍞 DeliveryGirl
Implements the `BreadReadyListener` interface and handles the bread delivery once notified by the bakery.

**Attributes**
- `name : String` — Delivery girl’s name.  
- `clients : List<Client>` — List of clients waiting for bread.

**Methods**
- `DeliveryGirl(String name)` — Constructor.  
- `registerClient(Client client)` — Adds a client to the delivery list.  
- `hasClients()` — Checks if any clients are registered.  
- `onBreadReady(Bread bread)` — Triggered when new bread is ready.  
- `deliver(Bread bread)` — Simulates the bread delivery process.  
- `getName()` — Returns the delivery girl’s name.

---

### 🍞 Bread
Represents a loaf of bread baked by the bakery.

**Attributes**
- `id : int` — Unique bread identifier.

**Methods**
- `Bread(int id)` — Constructor.  
- `getId()` — Returns the bread ID.  
- `toString()` — Returns a readable description, e.g., `Bread #1`.

---

### 👨‍👩‍👧 Client
Represents a customer who receives bread from the delivery girl.

**Attributes**
- `name : String` — Client’s name.

**Methods**
- `Client(String name)` — Constructor.  
- `receiveBread(String deliveredBy)` — Called when the delivery girl delivers bread.  
- `getName()` — Returns the client’s name.

---

### 🧩 BreadReadyListener (Interface)
Defines a listener for bread readiness events.

**Method**
- `onBreadReady(Bread bread)` — Triggered when the bakery finishes baking a loaf.

This interface allows the bakery to **notify** the delivery girl asynchronously when bread is ready.

---

### 🚀 BakeryApp
Acts as the entry point for running the simulation.  
It creates and connects all components: the bakery, delivery girl, and clients.

**Responsibilities**
- Initialize the system objects.  
- Register the delivery girl and clients.  
- Start the baking process.  

**Example usage:**
```java
Bakery bakery = new Bakery("Oliver’s Bakery");
DeliveryGirl girl = new DeliveryGirl("Anna");

girl.registerClient(new Client("Donald"));
girl.registerClient(new Client("Sarah"));

bakery.registerGirl(girl);
bakery.startBaking(5);
## ⚙️ How It Works
1. The **Bakery** bakes loaves at random time intervals (1–10 seconds).  
2. Each time bread is ready, it triggers the `onBreadReady()` method in the **DeliveryGirl** class.  
3. The **DeliveryGirl** delivers the bread to each registered **Client**.  
4. Every **Client** prints a message confirming the delivery.

---

## 🧪 Example Output
Bakery started baking...
Bread #1 is ready!
Anna is delivering Bread #1 to Donald
Donald received Bread #1 from Anna.
Anna is delivering Bread #1 to Sarah
Sarah received Bread #1 from Anna.
Bread #2 is ready!
Anna is delivering Bread #2 to Donald
Donald received Bread #2 from Anna.
...
Bakery is closing.

yaml
Copy code

---

## 🧠 Key OOP Concepts Demonstrated
- **Interfaces & Event Listeners** → `BreadReadyListener`.  
- **Multithreading** → Simulated real-time baking.  
- **Encapsulation** → Private fields with public accessors.  
- **Abstraction** → Separation of roles and responsibilities.  
- **Composition** → Classes interact through references and listeners.

---

## 🗂️ Project Structure
src/
├── Bakery.java
├── Bread.java
├── DeliveryGirl.java
├── Client.java
├── BreadReadyListener.java
└── BakeryApp.java

yaml
Copy code

---

## 🧾 Version Information
- **Version:** 1.0 – First Commit  
- **Status:** Working baseline (before design refinements)  
- **Author:** Santiago Bernal  
- **Institution:** Sheridan College  
- **Course:** ICE2 – Object-Oriented Programming  

---

## 💬 Notes
This README corresponds to the **initial working version** of the project before implementing the suggested improvements and refactoring for the second commit.

---

## ✅ Instructions
- Save this as `README.md` in your project’s root folder.  
- Keep your class diagram image inside the project (same level as README) so the link  
  `![Class Diagram](34df715a-7802-452a-a364-61155c960501.png)` displays correctly on GitHub.  
- If you rename the image, just update that filename in the README.
