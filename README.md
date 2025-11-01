# 🚀 How to Upload the **Zoo** Code to the `zoo` Branch (Step‑by‑Step, Windows CMD)

Repository: **https://github.com/Sagaz0501/ICE3_Bakery_and_zoo.git**  
Target branch: **`zoo`** (Alex’s branch)

> This guide is written for a Windows machine using **Command Prompt (CMD)**.  
> Follow **Option A** if you don’t have the repo locally yet (recommended).  
> Follow **Option B** if you already have your project folder with code and want to connect it to GitHub.

---
## Ignore this you already have it

## ✅ Prerequisites (do this once)
1) Install **Git for Windows**: https://git-scm.com/download/win  
2) Open **Command Prompt** (press `Win` → type `cmd` → Enter).  
3) Configure your Git identity (only the first time):
```bash
git config --global user.name "Alex Diamolidis"
git config --global user.email "your-email@example.com"
```
4) You’ll push over **HTTPS**. Have your **GitHub Personal Access Token** ready (used instead of password).  
Create one here: https://github.com/settings/tokens (classic token with `repo` scope is enough).

---

## 🅰️ Option A — Start by CLONING the repository (recommended)
> Use this if you **don’t** have the repo yet on your computer.

1) In netbeans right click in the project and slect open in system.
2) In the search bar delete the path and write cmd
3) now you are in the proyect direcotry e.g
```bash
cd %USERPROFILE%\Documents\System_devolpment\ICE3\zoo
```

2) **Clone** the repository:
```bash
git clone https://github.com/Sagaz0501/ICE3_Bakery_and_zoo.git
```

3) Enter the project folder:
```bash
cd ICE3_Bakery_and_zoo
```

4) Create or switch to the **zoo** branch (or switch if it already exists):
```bash
git checkout zoo
```

5) **Add the Diagram Class to the folder as a png image**

6) Add the files to Git:
```bash
git add .
```

7) Commit your changes with a clear message:
```bash
git commit -m "Add Zoo program (.java) and class diagram"
```

8) Push the `zoo` branch to GitHub **and set upstream**:
```bash
git push -u origin zoo
```
> When asked for credentials: **Username = your GitHub username**, **Password = your PAT (token)**.

Done ✅ Your code is now in the **zoo** branch on GitHub.

---

## 🅱️ Option B — You already have a local folder with your Zoo code
> Use this if your files are already in a folder and you want to connect that folder to GitHub.

1) Open **Command Prompt** and go to your project folder (replace the path):
```bash
cd C:\Users\<YourUser>\Documents\MyZooProject
```

2) Initialize Git in this folder:
```bash
git init
```

3) Create (or switch to) the `zoo` branch:
```bash
git checkout zoo
```

4) Add the **remote** (link to GitHub repo):
```bash
git remote add origin https://github.com/Sagaz0501/ICE3_Bakery_and_zoo.git
```

5) Add all files and commit:
```bash
git add .
git commit -m "Initial Zoo upload: .java files and diagram"
```

6) Push to GitHub and set upstream to `zoo`:
```bash
git push -u origin zoo
```
> Use your GitHub username + **Personal Access Token** when prompted.

Done ✅ Your existing local project is now uploaded to the **zoo** branch.

---

## 🔍 Verify on GitHub
Open the repository page:  
https://github.com/Sagaz0501/ICE3_Bakery_and_zoo  
Then switch to the **zoo** branch using the branch dropdown and confirm your files are there.

---

## 🆘 Common Fixes

- **“remote origin already exists”**  
  You likely added the remote before. Reset it:
  ```bash
  git remote remove origin
  git remote add origin https://github.com/Sagaz0501/ICE3_Bakery_and_zoo.git
  ```

- **“Updates were rejected” when pushing**  
  Get the remote branch content first (if any) and then push:
  ```bash
  git fetch origin
  git switch zoo        || git switch -c zoo
  git pull --rebase origin zoo
  git push -u origin zoo
  ```

- **Wrong branch**  
  Check where you are:
  ```bash
  git branch
  ```

- **See your changes before committing**  
  ```bash
  git status
  git diff
  ```

---

## 🧾 What to Upload (per assignment)
- Only **`.java` files** and the **diagram image(s)** (e.g., `.png`).  
- Do **not** upload the entire IDE project folder.

---

## ✅ Quick Copy Paste (minimal commands)
If you want the short version (Option A):
```bash
cd %USERPROFILE%\Documents
git clone https://github.com/Sagaz0501/ICE3_Bakery_and_zoo.git
cd ICE3_Bakery_and_zoo
git switch -c zoo   ||   git switch zoo
git add .
git commit -m "Add Zoo program (.java) and class diagram"
git push -u origin zoo
```
