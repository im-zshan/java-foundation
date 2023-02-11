/* Key Takeaways of For-loop

1. The for loop has the following syntax:
for(init; condition; increment) {
   //code
}

2. The break statement can be used to stop a loop.

3. The continue statement can be used to skip the current iteration of the loop and jump to the next one. */

/* Factorial Program!

The factorial of a number N is equal to 1 * 2 * 3 * ... * N
For example, the factorial of 5 is 1* 2 * 3 * 4 * 5  = 120.

Create a program that takes a number from input and output the factorial of that number.

Hint: Use a for loop to make the calculation, and start the loop from the number 1. */

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int factorial = 1;

        for (int x=1; x<=num; x++) {
            factorial *= x;
        }
        System.out.println(factorial);
   }
}
