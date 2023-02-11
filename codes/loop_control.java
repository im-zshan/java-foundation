/* Loop Control

Remember the break statement from the switch?
It can also be used to terminate loops.
*/

class Demo {
    public static void main(String[ ] args) {
        int x = 1;

        while(x < 10) {
            System.out.println(x);
            if(x == 4) {
                break;
            }
            x++;
        }
    }
}

/* Output

1
2
3
4

This will end the loop when x reaches the value 4.
*/
