/* While Loops
Some loops require to increase or decrease the value of a variable by a different number.

For example, lets output only the even numbers from 0 to 10.
*/

class Demo {
    public static void main(String[ ] args) {
        int x = 0;

        while(x <= 10) {
            System.out.println(x);
            x=x+2;
        }
    }
}

/* Output

0
2
4
6
8
10

There is also a shorter way for x = x+2; It can be written as x+=2;

Similarly, there are shorthand operators for other mathematical operations, such as -= for subtraction, *= for multiplication, etc.
*/
