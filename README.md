# 📊 SSD Interactive Lab: Code Documentation, Structure & Refactoring
**Software Systems Development (CRN 12391) · Level 5**  
**The British College (Leeds Beckett University) · Sudan Pudasaini**

```
Progress: [██████░░░░░░░░░░░░] Step 1 of 3 (In Progress)
```

---

> [!IMPORTANT]
> ### 🏷️ Repository Creation & Naming Convention
> Before writing any code, you must create your own copy of this lab repository:
> 1. Click the green **"Use this template"** ➡️ **"Create a new repository"** button at the top right of this page (or click **Fork**).
> 2. **Owner:** Select **`The-British-College-Nepal`** (or your own GitHub account).
> 3. **Repository Name:** You **MUST** strictly follow this exact naming format:
>    ```text
>    <your-name>-ssd-2026-week3-exercise
>    ```
>    * ✅ **Correct Examples:**
>      * `sudan-ssd-2026-week3-exercise`
>      * `crystal-ssd-2026-week3-exercise`
>      * `garima-ssd-2026-week3-exercise`
>      * `sujal-ssd-2026-week3-exercise`
>      * `roshan-ssd-2026-week3-exercise`
>    * ❌ **Incorrect Examples:** `week3`, `my-lab3`, `exercise3`, `StatsLab`.
> 4. **Visibility:** Select **Public**.
> 5. Click **"Create repository"**.
> 6. Clone your newly created repository to your laptop/lab machine:
>    ```bash
>    git clone https://github.com/The-British-College-Nepal/<your-name>-ssd-2026-week3-exercise.git
>    cd <your-name>-ssd-2026-week3-exercise
>    ```

---

## 🎯 Welcome to Your Week 3 Interactive Lab!

Welcome! In professional software development, writing code that *simply executes* is only the bare minimum. Professional software engineering requires code to be **readable, self-documenting, maintainable, and safely encapsulated**.

In this interactive lab, you will inherit a legacy class ([`Stats.java`](src/main/java/stats/Stats.java)) that represents typical un-engineered "student script" code:
* Messy, inconsistent indentation.
* Leaked internal state (missing `private` modifiers).
* Cryptic 3GL method names (`getA()`, `getB()`, `get()`).
* A critical array capacity bug.

Your objective is to refactor this class into clean, documented, and thoroughly verified production code.

Just like GitHub Skills:
1. You work on your dedicated feature branch.
2. Verify your code with JUnit 5 unit tests locally.
3. Merge your branch into `main` and push to GitHub.
4. GitHub Actions automatically tests your code.
5. When your tests pass, **this README automatically updates to reveal Step 2!**

---

## 🌿 The Git Branching Rule for Week 3

> [!IMPORTANT]
> ### 📢 In-Lab Policy: Work in a Feature Branch!
> Never commit directly to `main`. Create an isolated feature branch for Step 1, verify your tests locally, and merge into `main` only when ready.

Open your terminal inside your cloned repository and switch to a new branch:

```bash
# 1. Ensure your local main is up to date
git checkout main
git pull origin main

# 2. Create and switch to your Step 1 feature branch
git checkout -b feature/step1-clean-code

# 3. Confirm you are on your new branch (look for the * asterisk)
git branch
```

---

## 📝 Step 1: Clean Code, Naming Conventions & Encapsulation

Open [`src/main/java/stats/Stats.java`](src/main/java/stats/Stats.java) in your IDE.

### Your Tasks:

1. **Fix Code Formatting & Indentation:**
   * In your IDE, reformat the entire file:
     * **IntelliJ IDEA:** Press `Ctrl + Alt + L` (Windows/Linux) or `Cmd + Option + L` (Mac).
     * **Eclipse:** Press `Ctrl + Shift + F` (Windows/Linux) or `Cmd + Shift + F` (Mac).
     * **VS Code:** Press `Shift + Alt + F` (Windows/Linux) or `Shift + Option + F` (Mac).

2. **Enforce State Encapsulation:**
   * Notice that `numbers` and `count` have default package-private visibility.
   * Add the **`private`** access modifier to both attributes:
     ```java
     private int[] numbers;
     private int count;
     ```

3. **Rename Cryptic Legacy Method Names:**
   * `getA()` $\rightarrow$ rename to **`getMax()`** (returns `int`).
   * `getB()` $\rightarrow$ rename to **`getMin()`** (returns `int`).
   * `get()` $\rightarrow$ rename to **`getAverage()`** (returns `double`).
   * *Why?* A method name should be a descriptive verb or noun phrase explaining what it computes, not an arbitrary letter.

4. **Fix the `getCount()` Capacity Bug:**
   * Currently, `getCount()` returns `numbers.length`. This is a bug: `numbers.length` is the **capacity** of the array, not the number of values actually added!
   * Fix it to return `this.count`:
     ```java
     public int getCount() {
         return this.count;
     }
     ```

---

## 🧪 How to Verify Step 1 Locally

Run the unit test suite for Step 1 in your IDE or terminal:

```bash
mvn test -Dtest=Step1CleanCodeTest
```
*(Or right-click `Step1CleanCodeTest.java` in your IDE and select **Run**).*

You should see **5 passing tests**:
* ✅ `testNumbersFieldIsPrivate` — Verifies `numbers` is encapsulated.
* ✅ `testCountFieldIsPrivate` — Verifies `count` is encapsulated.
* ✅ `testMeaningfulMethodNamesExist` — Verifies `getMax()`, `getMin()`, `getAverage()`, `getTotal()`.
* ✅ `testCrypticNamesEliminated` — Verifies `getA`, `getB`, and `get` have been removed or renamed.
* ✅ `testGetCountReturnsAddedCount` — Verifies `getCount()` returns actual elements added.

---

## 🚀 How to Advance to Step 2

Once all 5 tests are passing:

```bash
# 1. Stage and commit on your feature branch
git add src/main/java/stats/Stats.java
git commit -m "Step 1: Refactored legacy method names and enforced encapsulation"

# 2. Switch back to main and merge your feature branch
git checkout main
git merge feature/step1-clean-code

# 3. Push main to trigger the autograder!
git push origin main
```

> [!TIP]
> After pushing, wait ~15 seconds and refresh this page on GitHub (or run `git pull` locally).  
> GitHub Actions will verify your solution and update this `README.md` to unlock **Step 2: Core Statistical Logic & Array Bounds**!
