/** CSE 360 Assignment
 * Description: The AddingMachine program implements an application that
 * adds and subtracts like a calculator. It also keeps track of the history.
 *
 * @author  Jenny Wong
 * @version 1.1
 * @since   2020-10-07
 */

package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    /**
     * Constructor
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = String.valueOf(total);
    }

    /**
     * getTotal() method
     * @return int the current total
     */
    public int getTotal () {
        return total;
    }

    /**
     * add() method
     * @param value (required) int adds the value to the current total
     */
    public void add (int value) {
        total = total + value;
        history = history + " + " + value; //keeps track of what was added to the total
    }
    /**
     * subtract() method
     * @param value (required) int subtracts the value from the current total
     */
    public void subtract (int value) {
        total = total - value;
        history = history + " - " + value; //keeps track of what was subtracted to the total

    }
    /**
     * toString() method
     * @return String of the history of the operations
     */
    public String toString () {
        return history;
    }
    /**
     * clear() method
     * resets the total value and history
     */
    public void clear() {
        total = 0;
        history = String.valueOf(total);
    }
}