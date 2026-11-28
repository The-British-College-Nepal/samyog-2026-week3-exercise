# 📊 SSD Interactive Lab: Code Documentation, Structure & Refactoring
**Software Systems Development (CRN 12391) · Level 5**  
**The British College (Leeds Beckett University) · Sudan Pudasaini**

```
Progress: [██████████████████] Step 3 of 3 (In Progress)
```

---

## ✅ Step 2 Complete! Outstanding progress!

You have resolved the critical array bounds bug and implemented accurate mathematical operations for `getTotal()`, `getAverage()`, `getMax()`, and `getMin()`.

Now, for the final challenge, you will add **standard Javadoc documentation and defensive exception handling**.

---

## 🌿 Step 3 Git Workflow: Create Your Feature Branch

Before writing code for Step 3, switch to a fresh feature branch:

```bash
# 1. Ensure you have the latest updates on main
git checkout main
git pull origin main

# 2. Create and switch to your Step 3 feature branch
git checkout -b feature/step3-documentation
```

---

## 📝 Step 3: Javadoc Documentation & Defensive Checks

Open [`src/main/java/stats/Stats.java`](src/main/java/stats/Stats.java) in your IDE.

### Your Tasks:

1. **Add Defensive Checks Against Empty Data:**
   * What happens if a caller invokes `getMax()`, `getMin()`, or `getAverage()` before any numbers have been added (`count == 0`)?
   * In each of these three methods, add a defensive invariant check at the top:
     ```java
     if (count == 0) {
         throw new IllegalStateException("No values have been added to calculate statistics.");
     }
     ```
   * *Why?* Accessing `numbers[0]` when `count == 0` is undefined domain behavior. Throwing an `IllegalStateException` protects data integrity!

2. **Add Complete Javadoc Comments:**
   Document every class, constructor, and method following the official Oracle Javadoc standards:
   * **Class Header:**
     ```java
     /**
      * Calculates statistical metrics from a dynamic collection of integer values.
      *
      * @author Your Name (or Sudan Pudasaini)
      */
     public class Stats { ... }
     ```
   * **Constructor:** Use `@param capacity` to describe the maximum array size.
   * **`addValue(int value)`:** Use `@param value` to describe the integer being appended.
   * **Methods returning values (`getCount`, `getTotal`, `getAverage`, `getMax`, `getMin`):** Use `@return` to describe the computed value.
   * **Methods throwing exceptions:** Use `@throws IllegalStateException` to document when the error occurs.

3. **Run and Verify the Driver Program:**
   * Open [`src/main/java/stats/Driver.java`](src/main/java/stats/Driver.java) in your IDE.
   * Run the `main()` method and verify clean console output:
     ```text
     ==================================================
     📊 SSD Week 3: Stats Class Demonstration
     ==================================================
     Numbers stored : [42, 88, 12, 65, 30, 95, 14, 50, 71, 23]
     Count          : 10
     Total          : 490
     Average        : 49.00
     Minimum value  : 12
     Maximum value  : 95
     ==================================================
     ```

---

## 🧪 How to Verify Step 3 Locally

Run all unit tests across the entire project:

```bash
mvn test
```
*(Or right-click the `src/test/java` folder in your IDE and select **Run 'All Tests'**).*

All **15 unit tests** across `Step1CleanCodeTest`, `Step2StatisticsTest`, and `Step3DocumentationTest` should pass!

---

## 🚀 How to Finish the Lab

Once all 15 tests pass locally:

```bash
# 1. Stage and commit on your feature branch
git add src/main/java/stats/Stats.java
git commit -m "Step 3: Completed Javadoc documentation and defensive exception checks"

# 2. Switch back to main and merge your feature branch
git checkout main
git merge feature/step3-documentation

# 3. Push main to claim your completion badge!
git push origin main
```

> [!TIP]
> After pushing, wait ~15 seconds and refresh this page on GitHub (or run `git pull` locally).  
> GitHub Actions will verify your entire lab and grant you the **Week 3 Exercise Completion Badge**!
