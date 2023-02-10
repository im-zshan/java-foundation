import java.util.Scanner;

public class Taking_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // for taking a 'string' as an input.
        String name = sc.nextLine();
        System.out.println("The name is: " + name);

    // for taking the 'integer' as an input.
        int age = sc.nextInt();
        System.out.println("The age is: " + age);

    // or we can also output by using multiple inputs.
        System.out.println(name+": "+age);
    }
}


/* Key Takeaways

That's how you take input from the user in Java!
Here are the steps:

1. import the java.util.Scanner class.
2. create a Scanner object: Scanner sc = new Scanner(System.in);
3. Use the corresponding method of the Scanner to take input, for example: int num = sc.nextInt();

There are similar methods available to take other types as input: nextDouble(), nextFloat(), nextBoolean().

*/