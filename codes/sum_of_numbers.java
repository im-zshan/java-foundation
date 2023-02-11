// Calculate the sum of the numbers from 1 to 100 and output it.

class Demo {
    public static void main(String[ ] args) {
        int sum = 0;
        int num = 0;

        while(num <= 100) {
            sum += num;
            num++;
        }
        System.out.println(sum);

    }
}

// Output: 5050

/*
We add the value of num to sum each time the loop runs, and then increase the num value by 1.

At the end of the loop, sum holds the result of our calculation.
level. Also, Notice that the last print statement is out of the while scope.
*/
