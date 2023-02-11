/* Do While Loops
Another variation of the while loop is do-while.

*/

class Demo {
    public static void main(String[ ] args) {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while(x < 5);
    }
}

/* Output

1
2
3
4

Notice that the condition appears at the end of the loop, so the statements in the loop execute once before it is tested.

Even with a false condition, the code will run once.Also, note the semicolon after the while condition.

Note: The difference between while and do-while is that do-while is guaranteed to run at least once, even with a false condition. Try changing the condition in the code above and see the result.

*/

