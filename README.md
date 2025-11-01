# 🧩 ICE 3 — Software Development (Java)

This repository contains the work for **ICE 3** in Software Development.  
Two independent Java programs will be implemented in **separate branches**:

- **Bakery** — implemented by **Santiago Bernal** → branch: `bakery-santiago`
- **Zoo** — implemented by **Alex Diamolidis** → branch: `zoo-alex`

> Each student contributes their program to the same remote repository, following a clean branch workflow.

---

## 📦 Repository Structure

- **Branch `bakery-santiago`**  
  Contains the Bakery program (Problem 0).  
  Includes `.java` files and a **class diagram image**.

- **Branch `zoo-alex`**  
  Contains the Zoo program (Problem 1).  
  Includes `.java` files and a **class diagram image**.

> Per assignment, **only `.java` and image files** are to be submitted (no entire IDE projects).

---

## 🔀 Git Workflow (Quick Start)

```bash
# clone your repo
git clone https://github.com/<org-or-user>/<repo>.git
cd <repo>

# create and switch to your feature branch
git switch -c bakery-santiago   # for Santiago
# or
git switch -c zoo-alex          # for Alex

# add your files
git add *.java images/*.png

# commit
git commit -m "Add ICE3 program and class diagram"

# push and set upstream
git push -u origin bakery-santiago   # or zoo-alex
```

---

## 0) 🍞 Bakery (5 marks)

**Scenario**  
A popular bakery sometimes runs out of bread. A delivery girl sees a business opportunity: she waits at the bakery for fresh bread and delivers it to clients for a fee.

**Requirements**
- Identify classes and draw them in **Visual Paradigm** (include diagram image).
- Add appropriate **instance variables** and **methods** to each class.
- Program behavior:
  - The **girl registers** a set of clients.
  - The **bakery registers** the girl.
  - The bakery **starts baking** bread at **random intervals (1–10 seconds)**  
    *(hint: `Thread.sleep(random.nextInt(10000));`)*
  - When a bread is ready, the **girl delivers** it to the **next customer**.
  - The **customer acknowledges**, e.g.:  
    `Donald received his bread.`

**Suggested Class Set (example)**
- `Bakery` (produces bread, notifies listener)
- `DeliveryGirl` (listens for bread-ready events, delivers)
- `Client` (acknowledges receipt)
- `Bread` (simple value object / identifier)
- `BreadReadyListener` (interface for event callback)
- `BakeryApp` (main driver)

**UML Diagram (place your image here)**
```
images/ice3-bakery-diagram.png
```
![Bakery Class Diagram](images/ice3-bakery-diagram.png)

**Run (example)**
```bash
javac *.java
java BakeryApp
```

---

## 1) 🦁 Zoo (5 marks)

**Scenario**  
A zoo up north employs **zookeepers** who **bring their own animals**. The zoo itself does not connect directly with animals. In this example:
- We have **2 zookeepers**, each with **3 animals**.
- The program must output the formatted list of keepers and animals as specified.

**Target Output (excerpt)**
```
Sheridan College Royal Metropolitan Zoo
125 Park Avenue
Brampton, ON
M1M 1M1
(905) 555-1234
These are our 2 zookeepers and the animals they care for:
Anand
. Leo.    I am a 12 year old lion  and I love water buffalo.
. Tony.   I am a  7 year old tiger and I love white tail deer.
. Babu.   I am a 10 year old bear  and I love berries and honey.
Bobby
. Deepak. I am a  4 year old deer  and I love fresh grass.
. Harry.  I am a  2 year old hare  and I love carrots.
. Cowan.  I am a  9 year old cow   and I love crunchy corn.
. ******* I am a ** year old ***** and I love *****************
```

Use:
```java
System.out.printf(". %-7s I am a %2d year old %-5s and I love %s.\n", name, age, species, diet);
```

**Design Guidance**
- Use **ArrayList** for collections.
- Identify instance variables and methods per the spec:

```
+--------------------+      +--------------------+      +--------------------+
|        Zoo         | 1 1..5|      ZooKeeper     | 1 1..5|       Animal       |
+--------------------+------ +--------------------+------ +--------------------+
| name: String       |       | name: String       |       | name: String       |
| keepers: ArrayList |       | animals: ArrayList |       | species: String    |
|                    |       |                    |       | diet: String       |
| Zoo()              |       | ZooKeeper()        |       | Animal()           |
| addZooKeeper()     |       | addAnimal()        |       | about()            |
| about()            |       | about()            |       |                    |
+--------------------+       +--------------------+       +--------------------+
```

**Behavior**
- Create animals (with species, diet, ages).
- Create two zookeepers and assign three animals each.
- Create a `Zoo` and **add zookeepers**.
- Calling `zoo.about()` should **cascade**:
  - `Zoo.about()` → each `ZooKeeper.about()` → each `Animal.about()`.
- Output must match the formatting example.

**UML Diagram (place your image here)**
```
images/ice3-zoo-diagram.png
```
![Zoo Class Diagram](images/ice3-zoo-diagram.png)

**Run (example)**
```bash
javac *.java
java TestZoo
```

---

## 3) ✅ Commit & Collaboration (5 marks)

- Pair with another student and create a **local** and **remote** repository.
- Each student **adds one program** (Bakery or Zoo) to the **shared remote**.
- Add the **instructor as collaborator** to the remote.
- Submit:
  - Your **`.java` files** and **diagram images** *(no entire projects)*.
  - A **Git log file** (e.g., `git log --oneline --graph --decorate > gitlog.txt`).

---

## 📝 Submission Checklist

- [ ] `.java` files only (no IDE project folders)  
- [ ] Class diagram images (`.png/.jpg`) from Visual Paradigm  
- [ ] Branch pushed to GitHub (`bakery-santiago` or `zoo-alex`)  
- [ ] Instructor added as collaborator  
- [ ] `gitlog.txt` included (history of commits)  

---

## 👥 Authors (Branches)

- **Bakery** — *Santiago Bernal* → `bakery-santiago`  
- **Zoo** — *Alex Diamolidis* → `zoo-alex`  

---

## 🛠️ Notes

- Keep your branch focused on **one program**.  
- Use clear commit messages.  
- Follow the exact output and formatting rules (especially for the Zoo output).  
- Place diagram images in an `images/` folder and update the paths above if necessary.
