/* While Loop

As it is common to decrease or increase a variable by 1 during loops, Java provides increment and decrement operators.
These are a shorter way to increase or decrease the value of a variable by one.

For example, the statement x=x-1; can be simplified to x--;
*/

class Demo {
    public static void main(String[ ] args) {
        int x = 7;

        while(x > 0) {
            System.out.println(x);
            x--;
        }
    }
}

/* Output

7
6
5
4
3
2
1

*/
