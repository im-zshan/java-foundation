/* While Loops!
A while loop statement repeatedly executes a target statement as long as a given condition is true.

The while loops check for the condition x > 0. If it evaluates to true, it executes the statements within its body. Then it checks for the statement again and repeats.

for example:
*/

class Demo {
    public static void main(String[ ] args) {
        int x = 7;

        while(x > 0) {
            System.out.println(x);
            x = x-1;
        }
    }
}

/* The code above will output;

7
6
5
4
3
2
1

The line x = x-1; is important, as without it the condition would never become false and the loop would run forever. 

Each time the loop runs, 1 is subtracted from x.

*/
