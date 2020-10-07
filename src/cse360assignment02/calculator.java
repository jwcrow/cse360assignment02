/** CSE 360 Assignment
 * Description: Calculator inherits AddingMachine to use AddingMachines' methods
 * This programs is testing to make sure the methods in AddingMachine works
 *
 * @author  Jenny Wong
 * @version 1.1
 * @since   2020-10-07
 */

package cse360assignment02;

public class calculator extends AddingMachine{

    public static void main(String[] args) {
	    calculator myCalculator = new calculator();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        System.out.println(myCalculator.toString());
        System.out.println(myCalculator.getTotal());
        myCalculator.clear();
        System.out.println(myCalculator.getTotal());

    }





}
