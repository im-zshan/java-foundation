/* Loop Control 'Continue'

Another control statement is continue.
It makes the loop skip the current iteration and go to the next one. */

class Demo {
    public static void main(String[ ] args) {
        for(int x=10; x<=40; x+=10) {
            if(x == 30) {
                continue;
            }
            System.out.println(x);
        }
    }
}

/* Output:

10
20
40

The above code skips the value of 30, as directed by the continue statement.

An example use case of continue:

An airline ticketing system needs to calculate the total cost for all tickets purchased. Tickets for children under the age of 3 are free. We can use a while loop to iterate through the list of passengers and calculate the total cost of their tickets. Here, the continue statement can be used to skip the children. */
