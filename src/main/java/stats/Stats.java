package stats;

/**
 * The Stats class stores integer values and calculates
 * their maximum, minimum, total, average, and count.
 *
 * @author samyog hang lingden
 * @version 1.0
 */
public class Stats {

    private int[] numbers;
    private int count;

    /**
     * Creates a Stats object with the specified capacity.
     *
     * @param capacity the initial capacity of the array
     * @throws IllegalArgumentException if capacity is not positive
     */
    public Stats(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        this.numbers = new int[capacity];
        this.count = 0;
    }

    /**
     * Adds a new integer value to the array.
     *
     * @param number the integer value to add
     */
    public void addValue(int number) {
        if (count == numbers.length) {
            int[] newNumbers = new int[numbers.length * 2];

            System.arraycopy(numbers, 0, newNumbers, 0, count);

            numbers = newNumbers;
        }

        numbers[count] = number;
        count++;
    }

    /**
     * Returns the largest stored value.
     *
     * @return the maximum value
     * @throws IllegalStateException if no values have been added
     */
    public int getMax() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to add statistics");
        }

        int max = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    /**
     * Returns the smallest stored value.
     *
     * @return the minimum value
     * @throws IllegalStateException if no values have been added
     */
    public int getMin() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics");
        }

        int min = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    /**
     * Calculates the average of all stored values.
     *
     * @return the average value
     * @throws IllegalStateException if no values have been added
     */
    public double getAverage() {
        if (count == 0) {
            throw new IllegalStateException("No values have been added to calculate statistics");
        }

        return (double) getTotal() / count;
    }

    /**
     * Calculates the sum of all stored values.
     *
     * @return the total sum
     */
    public int getTotal() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }

        return total;
    }

    /**
     * Returns the number of values currently stored.
     *
     * @return the actual number of added values
     */
    public int getCount() {
        return this.count;
    }
}