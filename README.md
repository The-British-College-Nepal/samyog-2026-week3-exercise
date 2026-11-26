# 📊 SSD Interactive Lab: Code Documentation, Structure & Refactoring
**Software Systems Development (CRN 12391) · Level 5**  
**The British College (Leeds Beckett University) · Sudan Pudasaini**

```
Progress: [████████████░░░░░░] Step 2 of 3 (In Progress)
```

---

## ✅ Step 1 Complete! Excellent refactoring work!

You successfully fixed code indentation, encapsulated internal state with `private` modifiers, eliminated cryptic 3GL names, and resolved the `getCount()` capacity bug.

Now, let's fix the statistical calculation algorithms.

---

## 🌿 Step 2 Git Workflow: Create Your Feature Branch

Before writing code for Step 2, create and switch to a fresh feature branch:

```bash
# 1. Ensure you have the latest updates on main
git checkout main
git pull origin main

# 2. Create and switch to your Step 2 feature branch
git checkout -b feature/step2-statistics
```

---

## 📝 Step 2: Core Statistical Logic & Array Bounds

Open [`src/main/java/stats/Stats.java`](src/main/java/stats/Stats.java) in your IDE.

### ⚠️ The Array Bounds Bug Explained
In the legacy code, loops iterated over `i < numbers.length`.  
In Java, an uninitialized `int[]` array contains zeros (`0`).  
If an array has capacity **10**, but the user only adds **3 negative numbers** (e.g., `-10, -5, -20`):
* The array contains: `[-10, -5, -20, 0, 0, 0, 0, 0, 0, 0]`.
* If a loop checks `i < numbers.length`, it will erroneously report `0` as the maximum value!
* Similarly, `getAverage()` would divide the sum by 10 instead of 3!

**Rule:** Statistical loops must iterate over added elements only: `i < this.count`.

### Your Tasks:

1. **Implement `getTotal()`:**
   * Iterate from index `0` up to `i < count`.
   * Sum all values and return the total integer:
     ```java
     int total = 0;
     for (int i = 0; i < count; i++) {
         total += numbers[i];
     }
     return total;
     ```

2. **Implement `getAverage()`:**
   * Calculate the sum of all elements up to `count`.
   * Divide the total by `count` cast as a `double`:
     ```java
     return total / (double) count;
     ```

3. **Implement `getMax()`:**
   * Initialize `max = numbers[0]`.
   * Loop from `i = 1` up to `i < count`.
   * If `numbers[i] > max`, update `max = numbers[i]`.
   * Return `max`.

4. **Implement `getMin()`:**
   * Initialize `min = numbers[0]`.
   * Loop from `i = 1` up to `i < count`.
   * If `numbers[i] < min`, update `min = numbers[i]`.
   * Return `min`.

---

## 🧪 How to Verify Step 2 Locally

Run both Step 1 and Step 2 unit tests:

```bash
mvn test -Dtest=Step1CleanCodeTest,Step2StatisticsTest
```
*(Or right-click `Step2StatisticsTest.java` in your IDE and select **Run**).*

You should see all **10 tests pass**:
* ✅ `testNumbersFieldIsPrivate`
* ✅ `testCountFieldIsPrivate`
* ✅ `testMeaningfulMethodNamesExist`
* ✅ `testCrypticNamesEliminated`
* ✅ `testGetCountReturnsAddedCount`
* ✅ `testGetTotal` — Verifies total sum of elements.
* ✅ `testGetAverage` — Verifies double precision average.
* ✅ `testGetMax` — Verifies maximum element finding.
* ✅ `testGetMin` — Verifies minimum element finding.
* ✅ `testPartiallyFilledArrayBounds` — Confirms algorithms only inspect added elements, avoiding uninitialized zeros.

---

## 🚀 How to Advance to Step 3

Once your local tests pass:

```bash
# 1. Stage and commit on your feature branch
git add src/main/java/stats/Stats.java
git commit -m "Step 2: Corrected statistical calculations and array bounds handling"

# 2. Switch back to main and merge your feature branch
git checkout main
git merge feature/step2-statistics

# 3. Push main to trigger the autograder!
git push origin main
```

> [!TIP]
> After pushing, wait ~15 seconds and refresh this page on GitHub (or run `git pull` locally).  
> GitHub Actions will verify your solution and update this `README.md` to unlock **Step 3: Javadoc Documentation & Defensive Checks**!
