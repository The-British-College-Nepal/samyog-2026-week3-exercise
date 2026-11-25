package stats;

import java.util.Arrays;

// TODO [Step 1.1]: Fix the messy indentation and formatting of this class!
// TODO [Step 3.1]: Add class-level Javadoc with @author tag
public class Stats {

    // TODO [Step 1.2]: Encapsulate fields! Add the 'private' modifier to both attributes
    private int[] numbers;
    private int count;

    // TODO [Step 3.2]: Add Javadoc with @param capacity
    public Stats(int capacity) {
        numbers = new int[capacity];
    }

    // TODO [Step 3.3]: Add Javadoc with @param value
    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    // TODO [Step 1.3]: Fix the bug! This should return 'count', not 'numbers.length'
    // TODO [Step 3.4]: Add Javadoc with @return
    public int getCount() {
        return this.count;
    }

    // TODO [Step 1.4]: Ensure this method is named getMax() (not getA)
    // TODO [Step 2.1]: Iterate through 1 to count (NOT numbers.length) to find highest value
    // TODO [Step 3.5]: Throw IllegalStateException if count == 0 ("No values have been added")
    public int getMax() {
        return 0;
    }

    // TODO [Step 1.5]: Ensure this method is named getMin() (not getB)
    // TODO [Step 2.2]: Iterate through 1 to count (NOT numbers.length) to find lowest value
    // TODO [Step 3.6]: Throw IllegalStateException if count == 0 ("No values have been added")
    public int getMin() {
        return 0;
    }

    // TODO [Step 2.3]: Sum all added values (loop up to count, NOT numbers.length)
    // TODO [Step 3.7]: Add Javadoc with @return
    public int getTotal() {
        return 0;
    }

    // TODO [Step 1.6]: Ensure this method is named getAverage() (not get)
    // TODO [Step 2.4]: Divide total by count (NOT numbers.length) as a double
    // TODO [Step 3.8]: Throw IllegalStateException if count == 0 ("No values have been added")
    public double getAverage() {
        return 0.0;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
